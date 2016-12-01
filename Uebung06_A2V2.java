/* Guppenmitglieder: ...... (bei Gruppenarbeit) */

import java.util.Scanner;

public class Uebung06_A2V2 {
  public static void main(String[] args) {


    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		int zehner = 1;
		int a = 0;			//wie viele Stellen? 
		int z1,z2,z3 = 0;
		while(n/zehner != 0) {
			zehner = zehner * 10;
			a++;
		}
		if(n==0) {
			a = 1;
		}
		if(n<1000&& n>-1) {
			if(a==1) {
				z1 = n%10;
				String ausgabez1 = z1 == 1 ? "eins" : z1==2 ? "zwei" : z1==3 ? "drei" : z1==4 ? "vier" : z1 == 5 ? "fuenf" : z1 == 6 ? "sechs" : z1==7 ? "sieben" : z1 == 8 ? "acht" : z1 == 9 ? "neun" : "null"  ;
				System.out.println(ausgabez1);
			}
			else if(a>=2) {
				String ausgabez3;
				if(a==3) {
					z3 = (n/100) % 10;
					ausgabez3 = z3 == 1 ? "ein" : z3==2 ? "zwei" : z3==3 ? "drei" : z3==4 ? "vier" : z3 == 5 ? "fuenf" : z3 == 6 ? "sechs" : z3==7 ? "sieben" : z3 == 8 ? "acht" : z3 == 9 ? "neun" : "null"  ;		
					System.out.print(ausgabez3+"hundert");
				}
				z1 = n%10;
				z2 = (n/10) % 10;
				String ausgabez1 = z1 == 1 && z2<2 ? "eins" :z1 == 1 && z2>1 ? "ein" : z1==2 ? "zwei" : z1==3 ? "drei" : z1==4 ? "vier" : z1 == 5 ? "fuenf" : z1 == 6 ? "sechs" : z1==7 && z2==1? "sieb"  :z1==7 && z2>1? "sieben"  : z1 == 8 ? "acht" : z1 == 9 ? "neun" : "null"  ;
				String ausgabez2 = z2  == 1 ? "eins" : z2 ==2 ? "zwei" : z2 ==3 ? "drei" : z2==4 ? "vier" : z2 == 5 ? "fuenf" : z2 == 6 ? "sech" : z2==7 ? "sieb" : z2 == 8 ? "acht" : z2 == 9 ? "neun" : "null"  ;			
				int letztenbeidenstellen = z1+z2*10;
				if(letztenbeidenstellen<20 && letztenbeidenstellen>12) {
					System.out.println(ausgabez1+"zehn");
				}
				else if(letztenbeidenstellen>20 && letztenbeidenstellen<30) {
					System.out.println(ausgabez1+"und"+"zwanzig");
				}
				else if(letztenbeidenstellen>9 && letztenbeidenstellen<13 || letztenbeidenstellen == 20) {
					switch(letztenbeidenstellen) {
					case 10: 
						System.out.println("zehn"); break;
					case 11: 
						System.out.println("elf"); break;
					case 12: 
						System.out.println("zwölf"); break;
					case 20:
						System.out.println("zwanzig"); break;
					}
				}
				else if(letztenbeidenstellen>29) {
					if(letztenbeidenstellen%10 == 0 )
					System.out.println(ausgabez2+"zig");
					else 
						System.out.println(ausgabez1 + "und" +ausgabez2+"zig");
				}
				else if(letztenbeidenstellen<10 && letztenbeidenstellen!=0) {
					System.out.println(ausgabez1);
				}
			}
		}
		else {
			System.out.println("falsche Eingabe");
		}
  }
}
