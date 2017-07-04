package fr.operatuers.console;

import java.util.Scanner;

public class OperateursApp {

	public static void main(String[] args) {

		System.out.println("****Application Opératuers \n Veuillez saisir le premier nombre...");
		Scanner sc = new Scanner(System.in);
		int premier = sc.nextInt();
		System.out.println("VEuillez saisir le second nombre...");
		Scanner sc2 = new Scanner(System.in);
		int second =sc2.nextInt();
		System.out.println(premier + "+" + second + "=" + (premier+second) );
		System.out.println(premier + "-" + second + "=" + (premier-second) );		System.out.println();
		System.out.println(premier + "*" + second + "=" + (premier*second) );		
		System.out.println(premier + "/" + second + "=" + (premier/second) );
	}

}
