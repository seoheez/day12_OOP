package day12_OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Win7Quiz {

	private HashMap map;
	private ArrayList funcList;
	public void function(String funcName) {
		if(map.containsKey(funcName)) {
			System.out.println(map.get(funcName) + "동작합니다.");
		} else {
			System.out.println("없는 기능입니다.");
		}
		
	}
	public ArrayList getFuncList() {
		funcList = new ArrayList();
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			funcList.add(it.next());
		}
		return funcList;
	}
	public void setMap() {
		map = new HashMap();
		map.put("계산기", "calc.exe");
		map.put("메모장", "notepad.exe");
	}
	public void display() {
		ArrayList list = null;
		setMap();
		Scanner input = new Scanner(System.in);
		System.out.println("===== 환영합니다 =====");
		int sel = 0;
		String funcName = null;
		while(true) {
			System.out.println("1. 기능");
			System.out.println("2. off");
			System.out.println("입력 >>>>");
			sel = input.nextInt();
			switch(sel) {
			case 1:
				list = getFuncList();
				System.out.println("사용 가능 기능");
				for(int i=0; i<list.size(); i++)
					System.out.println(i + 1 + ":" + list.get(i));
				System.out.println("사용할 기능 입력: ");
				funcName = input.next();
				function(funcName);
				break;
			case 2:
				System.out.println("프로그램 종료.");
				return;
			}
		}
	}
}
