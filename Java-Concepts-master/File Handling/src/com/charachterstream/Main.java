package com.charachterstream;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
//		try {
//			InputStreamReader isr= new InputStreamReader(System.in);
//			System.out.println("Enter some letter : ");
//			int letters = isr.read();
//			while(isr.ready()) {
//				System.out.println((char)letters);
//				letters=isr.read();
//			}
//			isr.close();
//			System.out.println();
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		//Read data from file 
		
//		try {
//			FileReader fr= new FileReader("note.txt");
//			int letters = fr.read();
//			while(fr.ready()) {
//				System.out.println((char)letters);
//				letters=fr.read();
//			}
////			fr.close();
//			System.out.println();
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
		
		// BufferReader
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// byte to char stream and then reading char stream
		System.out.println("You type "+br.readLine());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader("note.txt"));
			while(br.ready()) {
				System.out.println(br.readLine());
		     }
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		
	}

}
