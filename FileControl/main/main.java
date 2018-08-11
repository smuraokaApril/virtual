package main;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import enumerate.FileTypeEnum;
import load.impl.LoaderImpl;

/**
 *
 */

/**
 * @author A
 *
 */
public class main {

	/**
	 * @param args
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void main(String[] args) {
		load();
	}

	private static void load() {

		LoaderImpl loader = null;
		loader = new LoaderImpl();

		List<File> files = null;
		files = loader.loadFiles(FileTypeEnum.XML, "C:\\eclipse");

		for (File file : files) {
			try {
				System.out.println(FileUtils.readFileToString(file, "UTF-8"));
			} catch (IOException e) {
				// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
				e.printStackTrace();
			}
		}

	}

}
