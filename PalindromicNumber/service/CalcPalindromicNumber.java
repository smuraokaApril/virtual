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
			// �񕶐����ۂ����m�F
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
				System.out.println("�������[�v�G���[");
				break;
			}
		}

		System.out.println("10�i���F" + decimalNumber);
		target = converter.convert(decimalNumber, 8);
		System.out.println("8�i���F" + target);
		target = converter.convert(decimalNumber, 2);
		System.out.println("2�i���F" + target);
	}
}
