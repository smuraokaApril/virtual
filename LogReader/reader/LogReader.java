package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogReader {

	public static final String CHAR_SET_UTF8 = "UTF-8";
	public static final String UNDER_TRIANGL = "▼▼▼▼▼▼▼▼▼▼▼▼▼";
	public static final String TOP_TRIANGL = "▲▲▲▲▲▲▲▲▲▲▲▲▲";
	public static final String FILTER_STRING = "AAAA";

	public void doRead(String filePath) {

		try {

			BufferedReader br;
			br = newBufferedReader(filePath);

			List<Map<String, Object>> list;
			list = new ArrayList<>();

			Map<String, Object> map;
			map = null;

			boolean readFlg = false;

			String str = br.readLine();
			while (str != null) {

				if (str.contains(UNDER_TRIANGL)) {

				}

				if (!readFlg) {
					continue;
				}

				// 取得行の文字列を表示
				System.out.println(str);

				if (str.contains(UNDER_TRIANGL)) {

					// マップの生成
					map = new HashMap<String, Object>();

				} else if (str.contains(TOP_TRIANGL)) {

					// マップをリストに追加
					list.add(map);

				} else {

				}

				str = br.readLine();
			}

			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	private BufferedReader newBufferedReader(String filePath) throws FileNotFoundException, IOException {

		File file;
		file = new File(filePath);

		FileInputStream fileInputStream;
		fileInputStream = new FileInputStream(file);

		InputStreamReader inputStreamReader;
		inputStreamReader = new InputStreamReader(fileInputStream, CHAR_SET_UTF8);

		BufferedReader br;
		br = new BufferedReader(inputStreamReader);

		return br;
	}
}
