package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<Person> person = new ArrayList<Person>();

		Reader isr = new FileReader("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(isr);

		while (true) {
			Person p = new Person();

			String str = br.readLine();
			if (str == null) {
				break;
			}
			String[] pArray = str.split(",");
		}


		br.close();
	}

}
