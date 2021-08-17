package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.*;

public class TimerQuiz {

	private Date date;
	private SimpleDateFormat simple;
	public void setDate() {
		date = new Date();
		simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
	}
	public String getDate() {
		return simple.format(date);
	}
	public void timer() {
		for(int i=0; i<10; i++) {
			setDate();
			String s = getDate();
			System.out.println(s);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
		}
	}
}
