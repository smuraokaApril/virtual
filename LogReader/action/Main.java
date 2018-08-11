package action;

import reader.LogReader;

public class Main {

	public static void main(String[] args) {

		String filePath = args[0].toString();

		LogReader logReader = new LogReader();
		logReader.doRead(filePath);
	}

}
