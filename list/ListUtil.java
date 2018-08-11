package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListUtil {

	/**
	 * Integer�`�̔z��Ɋi�[����Ă���l�𕶎���A��
	 * 
	 * @param list ������A��������Integer�^�̔z��
	 * @return ������A�������l
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
	 * char�^�̔z���Character�W�F�l���b�N��List�ɕϊ�
	 * 
	 * @param c char�^�̔z��
	 * @return Character�W�F�l���b�N��List
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
