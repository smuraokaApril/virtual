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
	 * 対象ファイルパスのファイルを読み込む
	 *
	 * @param filePath 読み込み対象のファイルパス
	 * @return Fileオブジェクト
	 */
	public File loadFile(String... filePath);

	/**
	 * 対象ディレクトリの直下にある全ファイルを読み込む
	 *
	 * @param dirPath 読み込み対象が配置してあるディレクトリ
	 * @return Fileオブジェクト
	 */
	public List<File> loadFiles(String... dirPath);

	/**
	 * 対象ディレクトリから指定のファイルタイプ(*.txt等)に一致するファイルを読み込む
	 *
	 * @param fileType ファイルタイプ(".txt"や".xml"など)
	 * @param dirPath 読み込み対象が配置してあるディレクトリ
	 * @return Fileオブジェクト
	 */
	public List<File> loadFiles(FileTypeEnum fileType, String... dirPath);

}
