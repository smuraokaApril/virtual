package service;

class TestJudgePalindromicNumber {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		System.out.println("�񕶐��`�F�b�N�F�J�n");
		test();
		System.out.println("�񕶐��`�F�b�N�F�I��");
	}

	private static void test() {

		JudgePalindromicNumber judge = new JudgePalindromicNumber();
		boolean isPalindromicNumber;
		String target = "";

		target = "10";
		isPalindromicNumber = judge.judge(target);
		validate(false, isPalindromicNumber, target);

		target = "11";
		isPalindromicNumber = judge.judge(target);
		validate(true, isPalindromicNumber, target);

		target = "123";
		isPalindromicNumber = judge.judge(target);
		validate(false, isPalindromicNumber, target);

		target = "101";
		isPalindromicNumber = judge.judge(target);
		validate(true, isPalindromicNumber, target);

		target = "202";
		isPalindromicNumber = judge.judge(target);
		validate(true, isPalindromicNumber, target);

		target = "10101";
		isPalindromicNumber = judge.judge(target);
		validate(true, isPalindromicNumber, target);

		target = "777";
		isPalindromicNumber = judge.judge(target);
		validate(true, isPalindromicNumber, target);

		target = "99";
		isPalindromicNumber = judge.judge(target);
		validate(true, isPalindromicNumber, target);

		target = "0123456789876543210";
		isPalindromicNumber = judge.judge(target);
		validate(true, isPalindromicNumber, target);

		target = "01234567899876543210";
		isPalindromicNumber = judge.judge(target);
		validate(true, isPalindromicNumber, target);

		target = "012345678998765432101";
		isPalindromicNumber = judge.judge(target);
		validate(false, isPalindromicNumber, target);

		target = "465134";
		isPalindromicNumber = judge.judge(target);
		validate(false, isPalindromicNumber, target);

	}

	private static boolean validate(boolean expected, boolean result, String target) {

		if (expected == result) {
			return true;
		}
		System.out.println("�l�F" + target + "�ŃG���[");
		System.out.println("result�F" + result);
		return false;
	}

}
