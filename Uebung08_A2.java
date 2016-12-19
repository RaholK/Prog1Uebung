/* Guppenmitglieder: ...... (bei Gruppenarbeit) */

import java.util.Scanner;

public class Uebung08_A2 {

    static boolean error;
/* Loesung ab hier */

    static int myParseInt(String s){
    	int potenzzaehler ;
    	int zahl=0;
    	
    	if(s.equals("")) {          //leere Eingabe
    		error = true;
    		return 0;
    	}
    	for(int i=1; i<s.length(); i++) {       //Überprüfung ob jedes Element aus String (außer das nullte) eine Zahl ist
    		if((s.charAt(i)=='0'|| s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3'|| s.charAt(i)=='4' || s.charAt(i) == '5'|| s.charAt(i)=='6' ||s.charAt(i)=='7' || s.charAt(i)=='8'|| s.charAt(i) == '9' )) {
    		}
    		else {
    			error = true;
    			return 0;
    		}
    	}
    	
    if(s.charAt(0)=='0'|| s.charAt(0)=='1' || s.charAt(0)=='2' || s.charAt(0)=='3'|| s.charAt(0)=='4' || s.charAt(0) == '5'|| s.charAt(0)=='6' ||s.charAt(0)=='7' || s.charAt(0)=='8'|| s.charAt(0) == '9' || s.charAt(0) == '-') {   	 //Überprüfung was an der "nullten" also ersten Stelle steht, entweder Zahl oder '-'
    	}
    	else {
    		error = true;
    		return 0;
    	}
    	
//Ab jetzt folgt die Überprüfung ob der eingegebene String als positive Zahl in eine Int passt    	
    	if(s.length()>10 && s.charAt(0)!='-') {     //da r die "Grenzzahl" allein schon der Länge die Länge Zehn hat (positiv), dann ist eine längere Zahl automatisch nicht in Int vorhanden
    		error= true;
    		return 1;
    	}	 	  	 	      	    		     		   	 	
    	
    //Wenn die Länge des String 10 ist, dann könnte es eine Zahl sein die nicht in Int passt
    	else if(s.length()==10 && s.charAt(0)!='-') {   //In Zeile 42: wenn die Zahl an der ersten Stelle schon größer als 2 ist, dann passt sie nicht in eine int
    		if(s.charAt(0)=='3'|| s.charAt(0)=='4' || s.charAt(0) == '5'|| s.charAt(0)=='6' ||s.charAt(0)=='7' || s.charAt(0)=='8'|| s.charAt(0) == '9') {
    			error = true;
    			return 1;
    		} //falls das obige in Zeile 42 nicht erfüllt ist wird folgendes ausgeführt:
    		long feld [] = new long[s.length()+1];      //in feld[s.length] wird die Zahl umgewandelt in den Typ long gespeichert
    		for(int i = 0; i<s.length(); i++) {         //jede einzelne Zahl kommt dabei ins Feld
    			feld[i] = s.charAt(i)=='0' ? 0 : s.charAt(i)=='1' ? 1 : s.charAt(i)=='2' ? 2 : s.charAt(i)=='3' ? 3 : s.charAt(i)=='4' ? 4 : s.charAt(i) == '5'? 5 : s.charAt(i)=='6' ? 6 : s.charAt(i)=='7' ? 7 : s.charAt(i)=='8' ? 8 : s.charAt(i) == '9' ?9:0;
    		}
    		int zaehler = s.length()-1;             //Zaehler variable für die Potenz, da die erste Zahl die höchste Zehnerpotenz vorweist
    		for(int i = 0; i<s.length(); i++) {
    			feld[s.length()] = feld[i] * (long) Math.pow(10, zaehler) + feld[s.length()]; //Zusammenrechnen der Zahl
    			zaehler--;
    		}
    		if(feld[s.length()]>= 2147483648l ) {       //falls die Zahl größer gleich der ersten Zahl ist die nicht mehr in int passt wird error=true und return 1 aufgerufen
    			error = true;
    			return 1;
    		}
    	}
//Ab jetzt folgt die Überprüfung ob der eingegebene String als negative Zahl in eine Int passt 	    	
    	if(s.length()>11 && s.charAt(0)=='-') {
    		error= true;
    		return 1;
    	}
    	else if(s.length()==11 && s.charAt(0)=='-') {
    		if(s.charAt(1)=='3'|| s.charAt(1)=='4' || s.charAt(1) == '5'|| s.charAt(1)=='6' ||s.charAt(1)=='7' || s.charAt(1)=='8'|| s.charAt(1) == '9') {
    			error = true;
    			return 1;
    		}
    		long feld [] = new long[s.length()+1];
    		for(int i = 1; i<s.length(); i++) {
    			feld[i] = s.charAt(i)=='0' ? 0 : s.charAt(i)=='1' ? 1 : s.charAt(i)=='2' ? 2 : s.charAt(i)=='3' ? 3 : s.charAt(i)=='4' ? 4 : s.charAt(i) == '5'? 5 : s.charAt(i)=='6' ? 6 : s.charAt(i)=='7' ? 7 : s.charAt(i)=='8' ? 8 : s.charAt(i) == '9' ?9:0;
    		}
    		int zaehler = s.length()-2;     //-2 weil '-' nicht zur Zahl zählt
    		for(int i = 1; i<s.length(); i++) {	 	  	 	      	    		     		   	 	
    			feld[s.length()] = feld[i] * (long) Math.pow(10, zaehler) + feld[s.length()];
    			zaehler--;
    		}
    		if(feld[s.length()] * (-1)< -2147483648 ) { //(-1) daher weil die Zahl positiv ausgerechnet wurde
    			error = true;
    			return 1;
    		}
    	}
    	
    	
//Falls das Programm bis hier hin kommt, dann passt die Zahl in int, zuerst wird geschaut ob es sich um eine negative Zahl handelt  	
    	if(s.charAt(0) == '-') {
    		potenzzaehler = s.length()-2;
    		for(int i = 1; i<s.length(); i++) {   			
    			zahl = zahl + (int) Math.pow(10, potenzzaehler) * (s.charAt(i)=='0' ? 0 : s.charAt(i)=='1' ? 1 : s.charAt(i)=='2' ? 2 : s.charAt(i)=='3' ? 3 : s.charAt(i)=='4' ? 4 : s.charAt(i) == '5'? 5 : s.charAt(i)=='6' ? 6 : s.charAt(i)=='7' ? 7 : s.charAt(i)=='8' ? 8 : s.charAt(i) == '9' ?9:0 ) ; //Zahl wird zusammengerechnet
    			potenzzaehler--;			
    		}
        	zahl = zahl *(-1);
    	} //für positive Zahlen: 
    	else {
    		potenzzaehler = s.length()-1;
    		for(int i = 0; i<s.length(); i++) {   			
    			zahl = zahl + (int) Math.pow(10, potenzzaehler) * (s.charAt(i)=='0' ? 0 : s.charAt(i)=='1' ? 1 : s.charAt(i)=='2' ? 2 : s.charAt(i)=='3' ? 3 : s.charAt(i)=='4' ? 4 : s.charAt(i) == '5'? 5 : s.charAt(i)=='6' ? 6 : s.charAt(i)=='7' ? 7 : s.charAt(i)=='8' ? 8 : s.charAt(i) == '9' ?9:0 ) ;
    			potenzzaehler--;			
    		}
    	}
    	

        return zahl; 
    }
    
    
    
/* Loesung bis hierhin */

  public static void main(String[] args) {	 	  	 	      	    		     		   	 	

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Teststring: "); 
    String ts = sc.nextLine();
    
    error = false;
    
    int result = myParseInt(ts);
    
    if ( error ) 
        System.out.println ("Umwandlungsfehler "+ result);
    else 
        System.out.println ("Umwandlungsresultat "+ result);
    }
}