package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {

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

			p.setName(pArray[0]);
			p.setHp(pArray[1]);
			p.setCompany(pArray[2]);
			person.add(p);

		}
		
		//추가할 데이터 생성
		
		//정보생성 -> 윤성한 010-4469-9069 그런거없음
		Person p = new Person("윤성한", "010-4469-9069", "그런거없음");
		
		//리스트에 추가
		person.add(p);		
		
		for (int i = 0; i < person.size(); i++) {
			person.get(i).showInfo();
		}
		

		//쓰기	미리 빨대 꽂으면 날라감...
		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		/////////파일에 저장
		for(Person s : person) {
			String saveStr = s.getName() + "," + s.getHp() + "," + s.getCompany();
			System.out.println(saveStr);
			
			bw.write(saveStr);
			bw.newLine();
		}
		

		
		bw.close();
		br.close();
	}

}
