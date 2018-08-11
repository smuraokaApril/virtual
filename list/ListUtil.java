package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListUtil {

	/**
	 * Integer形の配列に格納されている値を文字列連結
	 * 
	 * @param list 文字列連結したいInteger型の配列
	 * @return 文字列連結した値
	 */
	public String linkingFromListNumber(List<Integer> list) {
		int work;
		StringBuilder linkingNumber = new StringBuilder();
		for (Iterator<Integer> i = list.iterator(); i.hasNext();) {
			work = i.next();
			linkingNumber.append(work);
		}

		String result = linkingNumber.toString();
		return result;
	}

	/**
	 * char型の配列をCharacterジェネリックのListに変換
	 * 
	 * @param c char型の配列
	 * @return CharacterジェネリックのList
	 */
	public List<Character> toList(char[] c) {

		List<Character> list;
		list = new ArrayList<Character>();

		for (int i = 0; i < c.length - 1; i++) {
			list.add(c[i]);
		}

		return list;
	}
}
