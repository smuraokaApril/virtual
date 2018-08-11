/**
 *
 */
package load;

import java.io.File;
import java.util.List;

import enumerate.FileTypeEnum;

/**
 * @author A
 *
 */
public interface Loader {

	/**
	 * �Ώۃt�@�C���p�X�̃t�@�C����ǂݍ���
	 *
	 * @param filePath �ǂݍ��ݑΏۂ̃t�@�C���p�X
	 * @return File�I�u�W�F�N�g
	 */
	public File loadFile(String... filePath);

	/**
	 * �Ώۃf�B���N�g���̒����ɂ���S�t�@�C����ǂݍ���
	 *
	 * @param dirPath �ǂݍ��ݑΏۂ��z�u���Ă���f�B���N�g��
	 * @return File�I�u�W�F�N�g
	 */
	public List<File> loadFiles(String... dirPath);

	/**
	 * �Ώۃf�B���N�g������w��̃t�@�C���^�C�v(*.txt��)�Ɉ�v����t�@�C����ǂݍ���
	 *
	 * @param fileType �t�@�C���^�C�v(".txt"��".xml"�Ȃ�)
	 * @param dirPath �ǂݍ��ݑΏۂ��z�u���Ă���f�B���N�g��
	 * @return File�I�u�W�F�N�g
	 */
	public List<File> loadFiles(FileTypeEnum fileType, String... dirPath);

}
