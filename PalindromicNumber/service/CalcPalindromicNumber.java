package service;

public class CalcPalindromicNumber {

	public void calculation() {

		int decimalNumber = 10;

		ConvertBaseImpl converter = new ConvertBaseImpl();
		JudgePalindromicNumber judgement = new JudgePalindromicNumber();
		String target = "";
		boolean isPalindromicNumberFlg = false;

		while (true) {

			target = String.valueOf(decimalNumber);
			// 回文数か否かを確認
			isPalindromicNumberFlg = judgement.judge(target);

			if (isPalindromicNumberFlg) {

				target = Integer.toOctalString(decimalNumber);
				isPalindromicNumberFlg = judgement.judge(target);

				if (isPalindromicNumberFlg) {

					target = Integer.toBinaryString(decimalNumber);
					isPalindromicNumberFlg = judgement.judge(target);

					if (isPalindromicNumberFlg) {

						break;
					}
				}
			}

			decimalNumber++;
			if (decimalNumber > 1000000) {
				System.out.println("無限ループエラー");
				break;
			}
		}

		System.out.println("10進数：" + decimalNumber);
		target = converter.convert(decimalNumber, 8);
		System.out.println("8進数：" + target);
		target = converter.convert(decimalNumber, 2);
		System.out.println("2進数：" + target);
	}
}
