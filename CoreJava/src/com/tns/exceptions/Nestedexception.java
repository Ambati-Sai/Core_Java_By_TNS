package com.tns.exceptions;

public class Nestedexception {
	public static void Show() {
		String name = "TKR";
		//int nlength = name.length();
		System.out.println("length of the name:"+name.length());
		String nameone = null;
		int index = 4;
		try {
			try {
				System.out.println(name.charAt(index));
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("exception:"+ex.getMessage());
			}
			System.out.println("string length:"+nameone.length());
			
		}
		catch(NullPointerException ep) {
			System.out.println("exception:"+ep.getMessage());
		}
	
		
	}

}
