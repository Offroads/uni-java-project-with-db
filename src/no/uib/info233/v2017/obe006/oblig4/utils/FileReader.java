package no.uib.info233.v2017.obe006.oblig4.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReader {

	public FileReader() {
	}

	public String readFile(String path) throws IOException {
		String string = "";
		String file = path;

		// Reading
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
