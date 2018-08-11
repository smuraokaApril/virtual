package action;

import reader.XmlReader;

public class Main {
	public static void main(String[] args) throws Exception {

		String filePath = args[0].toString();

		XmlReader reader = new XmlReader();

		reader.domRead(filePath);
	}
}