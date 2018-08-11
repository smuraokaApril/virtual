package fileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * �t�@�C���J�X�^���N���X
 * <p>
 * �P�t�@�C���ɂ��A�P�t�@�C���J�X�^���N���X�̃I�u�W�F�N�g���쐬����
 * </p>
 */
public class FileCustom {

	/**
	 * �t�@�C��
	 */
	File file;

	/**
	 * �R���X�g���N�^
	 * 
	 * @param name �t�@�C����
	 */
	FileCustom(String name) {
		this.file = new File(name);
	}

	/**
	 * �t�@�C���쐬
	 * 
	 * @param name �t�@�C����
	 * @throws Exception
	 */
	public void create() throws Exception {
		try {
			this.file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	/**
	 * �t�@�C���ɓǂݎ���p������t�^
	 */
	public void setReadOnly() {
		this.file.setReadOnly();
	}

	/**
	 * �t�@�C���f�[�^�𕶎���œǂݍ���
	 * 
	 * @return �t�@�C���f�[�^(������)
	 * @throws Exception
	 */
	public String readToString() throws Exception {
		StringBuilder sb = new StringBuilder();
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			int ch;
			while ((ch = fileReader.read()) != -1) {
				sb.append((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			fileReader.close();
		}
		return sb.toString();
	}

	public void write() {

	}
}
