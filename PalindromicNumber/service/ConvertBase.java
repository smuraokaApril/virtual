package service;

interface ConvertBase {

	/**
	 * 進数変換
	 * 
	 * @param conversionSource 変換元
	 * @param base 進数
	 * @return
	 */
	public String convert(int conversionSource, int base);
}
