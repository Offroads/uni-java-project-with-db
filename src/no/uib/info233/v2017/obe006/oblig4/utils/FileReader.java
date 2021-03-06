package no.uib.info233.v2017.obe006.oblig4.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * FileReader can read the content of txt files.
 * 
 * @author obe006
 *
 */
public class FileReader {

	/**
	 * Constructor for filereader
	 */
	public FileReader() {
	}

	/**
	 * Reads the file in the given path
	 * 
	 * @param path
	 *            of the txt file
	 * @return String with the content of the txt file
	 * @throws IOException
	 */
	public String readFile(String path) throws IOException {
		String string = "";
		String file = path;

		InputStream ips = new FileInputStream(file);
		InputStreamReader ipsr = new InputStreamReader(ips);
		BufferedReader br = new BufferedReader(ipsr);
		String line;
		while ((line = br.readLine()) != null) {
			string = line;
		}
		br.close();
		return string;
	}
}
