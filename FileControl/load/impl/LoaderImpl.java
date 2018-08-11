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
	 * 対象ファイルパスのファイルを読み込む
	 *
	 * @param filePath 読み込み対象のファイルパス
	 * @return Fileオブジェクト
	 */
	@Override
	public File loadFile(String... filePath) {
		return loadFileImpl(filePath);
	}

	/**
	 * 対象ディレクトリの直下にある全ファイルを読み込む
	 *
	 * @param dirPath 読み込み対象が配置してあるディレクトリ
	 * @return Fileオブジェクト
	 */
	@Override
	public List<File> loadFiles(String... dirPath) {
		return loadFilesImpl(dirPath);
	}

	/**
	 * 対象ディレクトリから対象のファイルタイプ(*.txt等)に一致するファイルを読み込む
	 *
	 * @param fileType ファイルタイプ(".txt"や".xml"など)
	 * @param dirPath 読み込み対象が配置してあるディレクトリ
	 * @return Fileオブジェクト
	 */
	@Override
	public List<File> loadFiles(FileTypeEnum fileType, String... dirPath) {
		return loadFilesImpl(fileType, dirPath);
	}

	/**
	 * 対象ファイルパスのファイルを読み込む
	 * 実装処理
	 *
	 * @param filePath 読み込み対象のファイルパス
	 * @return Fileオブジェクト
	 */
	private File loadFileImpl(String... filePath) {
		return new File(join(filePath));
	}

	/**
	 * 対象ディレクトリ直下にあるファイルを読み込む
	 * 実装処理
	 *
	 * @param p_dirPath 対象ディレクトリパス
	 * @return ファイル（配列）
	 */
	private List<File> loadFilesImpl(String... dirPath) {

		List<File> tempFiles = null;
		// ディレクトリの配列をList型に変換
		tempFiles = Arrays.asList(new File(join(dirPath)).listFiles());

		List<File> files = null;
		// 戻り値にセットするFile型リストのインスタンス生成
		files = new ArrayList<>();

		// ファイルの存在チェック
		if (tempFiles == null) {
			// 対象ディレクトリ直下にファイルが存在しない場合

			// 空のリストを返す
			return files;
		}

		// ■繰り返し処理 繰り返し回数：対象ディレクトリに存在するファイル(または、フォルダ)の数
		for (File tempFile : tempFiles) {

			if (tempFile.isFile()) {
				// フォルダではなく、ファイルの場合

				// 戻り値にセットするFile型リストにファイルを追加
				files.add(tempFile);
			}
		}

		return files;
	}

	/**
	 * 対象ディレクトリから対象の拡張子(*.txt等)に一致するファイルを読み込む
	 * 実装処理
	 *
	 * @param fileType 拡張子(".txt"や".xml"など)
	 * @param dirPath 読み込み対象が配置してあるディレクトリ
	 * @return Fileオブジェクト
	 */
	private List<File> loadFilesImpl(FileTypeEnum fileType, String... dirPath) {

		List<File> files = null;
		// 対象ディレクトリ直下に存在する全ファイルを取得
		files = loadFilesImpl(dirPath);

		Predicate<File> filter = null;
		// 対象ディレクトリ直下にあるファイルから除くルールを定義
		filter = definFilterRule(fileType);
		// 対象ディレクトリ直下にある全ファイルから、対象の拡張子を持ったファイル以外を除く
		files.removeIf(filter);

		return files;
	}

	/**
	 * 除外ルールを定義
	 *
	 * @param fileType 除外しないファイルの拡張子
	 * @return 除外ルール
	 */
	private Predicate<File> definFilterRule(FileTypeEnum fileType) {

		Predicate<File> filter = null;

		// 対象ディレクトリ直下にあるファイルから除くルールを定義
		filter = work -> {
			return (work.getName().indexOf(fileType.getTypeName()) == -1);
		};

		return filter;
	}

	/**
	 * String型の配列の値を文字列連結し、１つの文字列として返却する
	 *
	 * @param strings 連結対象のString型の配列
	 * @return String型の配列の値を文字列連結した文字列
	 */
	private String join(String... strings) {
		StringBuilder sb = new StringBuilder();
		for (String str : strings) {
			sb.append(str);
		}
		return sb.toString();
	}

}
