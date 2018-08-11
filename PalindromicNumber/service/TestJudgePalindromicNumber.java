package service;

class TestJudgePalindromicNumber {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("回文数チェック：開始");
		test();
		System.out.println("回文数チェック：終了");
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
		System.out.println("値：" + target + "でエラー");
		System.out.println("result：" + result);
		return false;
	}

}
