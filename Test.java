/* Guppenmitglieder: ...... (bei Gruppenarbeit) */


/*public class Test {

	private static void testOfUniMember(){
		System.out.println("University member: ");
		
		UniMember u = new UniMember("Kaiser", "Godehard", "KurfÃ¼rstenstraÃŸe 15");
		System.out.println( u );
	}
		
	private static void testOfStudent(){
		System.out.println("___________________________");
		System.out.println("Student: ");
		
		// please test functionality here
		Student s = new Student("Rahol", "Kumar","nicht in Trier");
		System.out.println(s);
		System.out.println("Test of continuous and unique matriculationNumber: ");
	}
	
	private static void testOfStaff(){
		System.out.println("___________________________");
		System.out.println("Staff: ");
		Staff st = new Staff("X", "Mr.E", "irgendwo in trier", "H321", "0651/xxxx");
		System.out.println(st);
		// please test functionality here
	}
	
	private static void testOfProfessor(){
		System.out.println("___________________________");
		System.out.println("Professor: ");
		Professor prof = new Professor("Prof. H F", "Mr.E", "petrisberg", "H123", "0651/bb");
		System.out.println(prof);
		// please test functionality here
	}
	
	private static void testOfAssistent(){
		System.out.println("___________________________");
		System.out.println("Assistent: ");
		
		// please test functionality here
		Assistant as = new Assistant("Steven", "Weber", "tarforst", "H465", "0651/16",  new Professor("Prof. H F", "Mr.E", "petrisberg", "H123", "0651/bb"));
		System.out.println(as);
		System.out.println("Test of resign(): ");
	}
	

	private static void testOfStaffNo(){
		System.out.println("___________________________");
		System.out.println("Test of continuous and unique staffNo: ");
		
		Staff a = new Staff("Markus", "Mustermann", "Metterich", "Audimax", "1234");
		Staff b = new Staff("Wilhelm", "Mustermann", "Metterich", "HS2", "12345");
		System.out.println(a);
		System.out.println(b);
	}
	
	private static void testOfEmployed(){
		System.out.println("___________________________");
		System.out.println("Test of employed(): ");
		Staff a = new Staff("Markus", "Mustermann", "Metterich", "Audimax", "1234");
		System.out.println(a.employed());
		Student s = new Student("Rahol", "Kumar","nicht in Trier");
		System.out.println(s.employed());
		
		
	}
	
	public static void main(String[] args){
		testOfUniMember();
		testOfStudent();		
		testOfStaff();
		testOfProfessor();
		testOfAssistent();
		testOfStaffNo();
		testOfEmployed();
	}
} */

/* Guppenmitglieder: ...... (bei Gruppenarbeit) */


public class Test {

	private static void testOfUniMember(){
        System.out.println("___________________________");
	    System.out.println("University member: ");
        System.out.println("");

        UniMember u = new UniMember("name1", "prenom1", "adress1");
        System.out.println("Test Ausgabe UniMember: ");
        System.out.println( u );


    }
		
	private static void testOfStudent(){
		System.out.println("___________________________");
		System.out.println("Student: ");
        System.out.println("");

		Student student1 = new Student("name1", "prenom1", "adress1");
        System.out.println(student1);

        Student student2 = new Student("name2", "prenom2", "adress2");
        System.out.println(student2);

        System.out.println("Test of continuous and unique matriculationNumber: ");
        System.out.println(student1.getMatriculationNumber());
        System.out.println(student2.getMatriculationNumber());
        System.out.println("Gleich? "+(student1.getMatriculationNumber()==student2.getMatriculationNumber()));
        System.out.println("Aufeinanderfolgend? "+ (student1.getMatriculationNumber()+1==student2.getMatriculationNumber()));
    }
	
	private static void testOfStaff(){
		System.out.println("___________________________");
		System.out.println("Staff: ");
        System.out.println("");
		
		Staff staff3 = new Staff("name3", "prenom3", "adress3", "number3", "room3");
        System.out.println(staff3);
    }
	
	private static void testOfProfessor(){
		System.out.println("___________________________");
		System.out.println("Professor: ");
        System.out.println("");
		
		Professor prof4 = new Professor("name4","prenom4", "adress4", "tele4", "room4");
        System.out.println("Ausgabe ohne Mitarbeiter");
        System.out.println(prof4);

        // Test ob Mitarbeiter korrekt ausgegeben werde:
        System.out.println("Ausgabe mit Mitarbeitern: ");
        Assistant assi5 = new Assistant("name5","prenom5", "adress5", "tele5", "room5", prof4 );
        Assistant assi6 = new Assistant("name6","prenom6", "adress6", "tele6", "room6", prof4 );

        System.out.println(prof4);
    }
	
	private static void testOfAssistent(){
		System.out.println("___________________________");
		System.out.println("Assistent: ");
        System.out.println("");

        Professor prof7 = new Professor("name7","prenom7", "adress7", "tele7", "room7");
		Assistant assi8 = new Assistant("name8","prenom8", "adress8", "tele8", "room8", prof7 );

        // Test toString
		System.out.println(assi8.toString());
		// Teste getProf
        System.out.println(assi8.getProf());

    }
	

	private static void testOfStaffNo(){
		System.out.println("___________________________");
		System.out.println("Test of continuous and unique staffNo: ");
        System.out.println("");
		
		Staff mitarbeiter9 = new Staff("name9","prenom9", "adress9", "tele9", "room9");
        Staff mitarbeiter10 = new Staff("name10","prenom10", "adress10", "tele10", "room10");
        System.out.println("Test staffNo: ");
        System.out.println("Gleich? "+(mitarbeiter9.getStaffNo()==mitarbeiter10.getStaffNo()));
        System.out.println("Aufeinanderfolgend? "+ (mitarbeiter9.getStaffNo()+1==mitarbeiter10.getStaffNo()));
    }
	
	private static void testOfEmployed() {
        System.out.println("___________________________");
        System.out.println("Test of employed(): ");
        System.out.println("");

        UniMember uniMember11 = new UniMember("name11", "prenom11", "adress11");
        Student student12 = new Student("name12", "prenom1", "adress12");
        Professor prof13 = new Professor("name13", "prenom13", "adress13", "tele13", "room13");
        Assistant assi14 = new Assistant("name14", "prenom14", "adress14", "tele14", "room14", prof13);

        System.out.println("UniMember = employed ?: " + uniMember11.employed() + " (sollte false sein)");
        System.out.println("Student = employed ?: " + student12.employed() + " (sollte false sein)");
        System.out.println("Prof = employed ?: "+ prof13.employed() + " (sollte true sein)");


        System.out.println("");
        // Test Angestelltenstatus, erst Angestellter, dann nicht mehr
        System.out.println("Assistent = employed? vor resign: " + assi14.employed() + " (sollte true sein.)");
        System.out.println("kündigt ...");
        assi14.resign();
        System.out.println("Assistent = employed? nach resign: " + assi14.employed() + " (sollte false sein.)");


        System.out.println("");
        // Test was bei zu vielen Assitenten passiert:
        System.out.println("Test was bei zu vielen Assitenten passiert");
        Professor prof15 = new Professor("name15", "prenom15", "adress15", "tele15", "room15");
        Assistant assi1 = new Assistant("x", "x", "x", "x", "x", prof15);
        Assistant assi2 = new Assistant("x", "x", "x", "x", "x", prof15);
        Assistant assi3 = new Assistant("x", "x", "x", "x", "x", prof15);
        Assistant assi4 = new Assistant("x", "x", "x", "x", "x", prof15);
        Assistant assi5 = new Assistant("x", "x", "x", "x", "x", prof15);
        Assistant assi6 = new Assistant("x", "x", "x", "x", "x", prof15);
        Assistant assi7 = new Assistant("x", "x", "x", "x", "x", prof15);
        Assistant assi8 = new Assistant("x", "x", "x", "x", "x", prof15);
        Assistant assi9 = new Assistant("x", "x", "x", "x", "x", prof15);
        Assistant assi10 = new Assistant("x", "x", "x", "x", "x", prof15);
        System.out.println("Maximale Anzahl erreich, beim nächsten Absturz:");
        Assistant assi11 = new Assistant("x", "x", "x", "x", "x", prof15);

    }
	public static void main(String[] args){
		testOfUniMember();
		testOfStudent();		
		testOfStaff();
		testOfProfessor();
		testOfAssistent();
		testOfStaffNo();
		testOfEmployed();
	}
}
