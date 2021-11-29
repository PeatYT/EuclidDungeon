package dungeonGame;

import dungeonGame.map;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class main {
	static Scanner amongus;
	static File level1;
	static BufferedReader b;
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		level1=new File("level1.txt");
		b=new BufferedReader(new FileReader(level1));
		
		String[] t=new String[1];
		while(b.readLine()!=null) {
		b.readLine();
		}
		
		map m = new map();
		m.setlevel(0, t);
		m.level=0;
		amongus=new Scanner(System.in);
		
		while(true) {
		for(int i=0;i<m.view(m.cx-5, m.cy-5, 10, 10).length-1;i++) {
				System.out.println(m.view(m.cx-5, m.cy-5, 10, 10)[i]);
			}
		String t=amongus.nextLine();
		if(t.equals("w")) {m.cy--;System.out.println("funk u");}
		if(t.equals("a")) {m.cx--;}
		if(t.equals("s")) {m.cy++;}
		if(t.equals("d")) {m.cx++;}
		}}
}
