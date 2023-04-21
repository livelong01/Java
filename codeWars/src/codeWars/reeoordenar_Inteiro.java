package codeWars;

import java.util.ArrayList;
import java.util.List;

import entities.program;

public class reeoordenar_Inteiro {

	public static void main(String[] args) {
		
		
		int x = 123456789;
		int y = 381;
		int z = 15;
		
	   
		String a = String.valueOf(y); 
		int num = a.length();
		List<Integer> list = new ArrayList<>();
		//Integer.valueOf(a.charAt(i));
			
		for (int i= 0; i < num; i++) {
			list.add((int)a.charAt(i));
		}
		program prog = new program();
	
		program.ordenar(list);
		System.out.println(list);
		System.out.println(a.charAt(0));
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		



	}

