/**
 *
 */
package load.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import enumerate.FileTypeEnum;
import load.Loader;

/**
 * @author A
 *
 */
public class LoaderImpl implements Loader {

	/**
	 * �Ώۃt�@�C���p�X�̃t�@�C����ǂݍ���
	 *
	 * @param filePath �ǂݍ��ݑΏۂ̃t�@�C���p�X
	 * @return File�I�u�W�F�N�g
	 */
	@Override
	public File loadFile(String... filePath) {
		return loadFileImpl(filePath);
	}

	/**
	 * �Ώۃf�B���N�g���̒����ɂ���S�t�@�C����ǂݍ���
	 *
	 * @param dirPath �ǂݍ��ݑΏۂ��z�u���Ă���f�B���N�g��
	 * @return File�I�u�W�F�N�g
	 */
	@Override
	public List<File> loadFiles(String... dirPath) {
		return loadFilesImpl(dirPath);
	}

	/**
	 * �Ώۃf�B���N�g������Ώۂ̃t�@�C���^�C�v(*.txt��)�Ɉ�v����t�@�C����ǂݍ���
	 *
	 * @param fileType �t�@�C���^�C�v(".txt"��".xml"�Ȃ�)
	 * @param dirPath �ǂݍ��ݑΏۂ��z�u���Ă���f�B���N�g��
	 * @return File�I�u�W�F�N�g
	 */
	@Override
	public List<File> loadFiles(FileTypeEnum fileType, String... dirPath) {
		return loadFilesImpl(fileType, dirPath);
	}

	/**
	 * �Ώۃt�@�C���p�X�̃t�@�C����ǂݍ���
	 * ��������
	 *
	 * @param filePath �ǂݍ��ݑΏۂ̃t�@�C���p�X
	 * @return File�I�u�W�F�N�g
	 */
	private File loadFileImpl(String... filePath) {
		return new File(join(filePath));
	}

	/**
	 * �Ώۃf�B���N�g�������ɂ���t�@�C����ǂݍ���
	 * ��������
	 *
	 * @param p_dirPath �Ώۃf�B���N�g���p�X
	 * @return �t�@�C���i�z��j
	 */
	private List<File> loadFilesImpl(String... dirPath) {

		List<File> tempFiles = null;
		// �f�B���N�g���̔z���List�^�ɕϊ�
		tempFiles = Arrays.asList(new File(join(dirPath)).listFiles());

		List<File> files = null;
		// �߂�l�ɃZ�b�g����File�^���X�g�̃C���X�^���X����
		files = new ArrayList<>();

		// �t�@�C���̑��݃`�F�b�N
		if (tempFiles == null) {
			// �Ώۃf�B���N�g�������Ƀt�@�C�������݂��Ȃ��ꍇ

			// ��̃��X�g��Ԃ�
			return files;
		}

		// ���J��Ԃ����� �J��Ԃ��񐔁F�Ώۃf�B���N�g���ɑ��݂���t�@�C��(�܂��́A�t�H���_)�̐�
		for (File tempFile : tempFiles) {

			if (tempFile.isFile()) {
				// �t�H���_�ł͂Ȃ��A�t�@�C���̏ꍇ

				// �߂�l�ɃZ�b�g����File�^���X�g�Ƀt�@�C����ǉ�
				files.add(tempFile);
			}
		}

		return files;
	}

	/**
	 * �Ώۃf�B���N�g������Ώۂ̊g���q(*.txt��)�Ɉ�v����t�@�C����ǂݍ���
	 * ��������
	 *
	 * @param fileType �g���q(".txt"��".xml"�Ȃ�)
	 * @param dirPath �ǂݍ��ݑΏۂ��z�u���Ă���f�B���N�g��
	 * @return File�I�u�W�F�N�g
	 */
	private List<File> loadFilesImpl(FileTypeEnum fileType, String... dirPath) {

		List<File> files = null;
		// �Ώۃf�B���N�g�������ɑ��݂���S�t�@�C�����擾
		files = loadFilesImpl(dirPath);

		Predicate<File> filter = null;
		// �Ώۃf�B���N�g�������ɂ���t�@�C�����珜�����[�����`
		filter = definFilterRule(fileType);
		// �Ώۃf�B���N�g�������ɂ���S�t�@�C������A�Ώۂ̊g���q���������t�@�C���ȊO������
		files.removeIf(filter);

		return files;
	}

	/**
	 * ���O���[�����`
	 *
	 * @param fileType ���O���Ȃ��t�@�C���̊g���q
	 * @return ���O���[��
	 */
	private Predicate<File> definFilterRule(FileTypeEnum fileType) {

		Predicate<File> filter = null;

		// �Ώۃf�B���N�g�������ɂ���t�@�C�����珜�����[�����`
		filter = work -> {
			return (work.getName().indexOf(fileType.getTypeName()) == -1);
		};

		return filter;
	}

	/**
	 * String�^�̔z��̒l�𕶎���A�����A�P�̕�����Ƃ��ĕԋp����
	 *
	 * @param strings �A���Ώۂ�String�^�̔z��
	 * @return String�^�̔z��̒l�𕶎���A������������
	 */
	private String join(String... strings) {
		StringBuilder sb = new StringBuilder();
		for (String str : strings) {
			sb.append(str);
		}
		return sb.toString();
	}

}
