package service;

public class TestConvertBase {

	public static void main(String[] args) {

		System.out.println("2進数変換処理の検証：開始");
		validateBinaryNumber();
		System.out.println("2進数変換処理の検証：終了");

		System.out.println("8進数変換処理の検証：開始");
		validateOctalNotation();
		System.out.println("8進数変換処理の検証：終了");

	}

	private static void validateBinaryNumber() {

		ConvertBaseImpl converter = new ConvertBaseImpl();
		int decimal = 0;
		String result = "";
		boolean isValidateFlg = false;

		decimal = 0;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("0", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 1;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("1", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 2;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("10", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 3;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("11", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 4;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("100", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 5;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("101", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 6;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("110", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 7;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("111", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 8;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("1000", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 9;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("1001", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 10;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("1010", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 11;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("1011", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 11;
		result = converter.convert(decimal, 2);
		isValidateFlg = validate("1011", result, decimal);
		if (!isValidateFlg) {
			return;
		}
	}

	private static void validateOctalNotation() {

		ConvertBaseImpl converter = new ConvertBaseImpl();
		int decimal = 0;
		String result = "";
		boolean isValidateFlg = false;

		decimal = 0;
		result = converter.convert(decimal, 8);
		isValidateFlg = validate("0", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 1;
		result = converter.convert(decimal, 8);
		isValidateFlg = validate("1", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 7;
		result = converter.convert(decimal, 8);
		isValidateFlg = validate("7", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 8;
		result = converter.convert(decimal, 8);
		isValidateFlg = validate("10", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 9;
		result = converter.convert(decimal, 8);
		isValidateFlg = validate("11", result, decimal);
		if (!isValidateFlg) {
			return;
		}

		decimal = 11;
		result = converter.convert(decimal, 8);
		isValidateFlg = validate("13", result, decimal);
		if (!isValidateFlg) {
			return;
		}
	}

	private static boolean validate(String expected, String result, int decimal) {
		if (expected.equals(result)) {
			return true;
		}
		System.out.println("値：" + decimal + "でエラー");
		System.out.println("result：" + result);
		return false;
	}
}
