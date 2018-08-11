package service;

class JudgePalindromicNumber {

	boolean judge(String target) {

		String verfication;
		verfication = target;
		int length = verfication.length();

		boolean isMatchFlg = true;
		for (int i = 0; i < length; i++) {
			Character c1 = verfication.charAt(i);
			Character c2 = verfication.charAt((length - 1) - i);
			if (!c1.equals(c2)) {
				isMatchFlg = false;
				break;
			}
		}

		return isMatchFlg;
	}
}
