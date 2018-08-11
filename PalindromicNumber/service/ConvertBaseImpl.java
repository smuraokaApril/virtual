package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConvertBaseImpl implements ConvertBase {

	/**
	 * �i���ϊ�
	 */
	@Override
	public String convert(int conversionSource, int base) {

		String result = "";

		List<Integer> list;
		list = new ArrayList<Integer>();

		Integer tmp = 0;
		tmp = conversionSource;

		while (true) {
			int mod = 0;
			mod = tmp % base;
			list.add(mod);
			if (tmp < base) {
				break;
			}
			tmp = tmp / base;
		}

		Collections.reverse(list);

		result = linkingFromListNumber(list);

		return result;
	}

	/**
	 * Integer�`�̔z��Ɋi�[����Ă���l�𕶎���A��
	 * 
	 * @param list ������A��������Integer�^�̔z��
	 * @return ������A�������l
	 */
	private String linkingFromListNumber(List<Integer> list) {
		int work;
		StringBuilder linkingNumber = new StringBuilder();
		for (Iterator<Integer> i = list.iterator(); i.hasNext();) {
			work = i.next();
			linkingNumber.append(work);
		}

		String result = linkingNumber.toString();
		return result;
	}

}
