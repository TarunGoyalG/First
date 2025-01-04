package Sle;

import java.util.HashSet;
import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
String s="tarun goyal";
String[] m = s.split(" ");
StringBuilder sa=new StringBuilder();
	for(String i:m) {
		String ja=new StringBuilder(i).reverse().toString();
		sa.append(ja);
		if(i.length()>0) {
			sa.append(" ");
		}
	}
	System.out.println(sa.toString() );

}}