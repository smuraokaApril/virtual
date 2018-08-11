package fileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ファイルカスタムクラス
 * <p>
 * １ファイルにつき、１ファイルカスタムクラスのオブジェクトを作成する
 * </p>
 */
public class FileCustom {

	/**
	 * ファイル
	 */
	File file;

	/**
	 * コンストラクタ
	 * 
	 * @param name ファイル名
	 */
	FileCustom(String name) {
		this.file = new File(name);
	}

	/**
	 * ファイル作成
	 * 
	 * @param name ファイル名
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
	 * ファイルに読み取り専用属性を付与
	 */
	public void setReadOnly() {
		this.file.setReadOnly();
	}

	/**
	 * ファイルデータを文字列で読み込み
	 * 
	 * @return ファイルデータ(文字列)
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
