package day12_OOP;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("윈도우 실행 명령어 입력");
		String s = input.next();
		
		ProcessBuilder pro = new ProcessBuilder(s);
		

		try {
			pro.start();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
