/**
 *
 */
package enumerate;

/**
 * @author A
 *
 */
public enum FileTypeEnum {
	TXT(".txt"),
	/** .txt */
	XML(".xml"),
	/** .txt */
	CSV(".csv"),
	/** .txt */
	TSV(".tsv"),
	/** .txt */
	WILD_CARD(".*"),;

	private final String value;

	private FileTypeEnum(final String pr_value) {
		this.value = pr_value;
	}

	public String getTypeName() {
		return this.value;
	}
}
