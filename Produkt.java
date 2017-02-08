import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.*;

/* Guppenmitglieder: ...... (bei Gruppenarbeit) */
public class Produkt {
	public static List<String> list;
	static int i=0;
	String name;
	String artnr;
	int preis;
	public static ArrayList<Produkt>products = new ArrayList<Produkt>();

	
	public Produkt() {
		if(list==null) {
			readLine();
		}
		String work = list.get(i);
		StringBuffer buffer = new StringBuffer(work);
		buffer.delete(0, 1);
		
		int Indexofindexpreis= buffer.indexOf("preis")+6;
		int indexofdoppelpunkt = buffer.indexOf(":",Indexofindexpreis);
		boolean check = true;
		while(buffer.substring(indexofdoppelpunkt+1, indexofdoppelpunkt+2).equals(" ")) {
			indexofdoppelpunkt++;
		}
		int hochzaehl = indexofdoppelpunkt;
		while(check) {
			try {
				preis = Integer.parseInt(buffer.substring(indexofdoppelpunkt+1, hochzaehl+2));
				hochzaehl++;
			}
			catch(NumberFormatException e) {
				check = false;
			}
		}
		
		for(int i = 0; i<buffer.length(); i++) {
			if(buffer.substring(i, i+1).equals("}") ) {
				buffer.delete(i, i+1);
			}						
		}
		for(int i = 0; i<buffer.length(); i++) {
			if(buffer.substring(i, i+1).equals("{")) {
				buffer.delete(i, i+1);
			}						
		}
		
		int Indexofindexname = buffer.indexOf("name")+5;
		int indexofName1 = buffer.indexOf("\"", Indexofindexname+1);
		int indexofName2 = buffer.indexOf("\"", indexofName1+1);
		name = buffer.substring(indexofName1+1, indexofName2);
		
		int Indexofindexartnr= buffer.indexOf("artnr")+6;
		int indexofartnr1 = buffer.indexOf("\"", Indexofindexartnr+1);
		int indexofartnr2 = buffer.indexOf("\"", indexofartnr1+1);
		artnr = buffer.substring(indexofartnr1 +1, indexofartnr2);
		System.out.println(artnr);
		
		for(int i = 0; i<buffer.length(); i++) {
			if( buffer.substring(i, i+1).equals("\"")) {
				buffer.delete(i, i+1);
			}						
		}
		//products.add(this);
		writeFileBytes("Produktliste.mod",products);
		products.add(this);
		
		
		
		
		i++;
	}
	
	
	
	public static void writeFileBytes(String name, ArrayList<Produkt> lines) {
		try (BufferedWriter nbw = Files.newBufferedWriter(FileSystems.getDefault().getPath(".", name),
				Charset.forName("UTF-8"), StandardOpenOption.CREATE)) {
			for (Produkt line : lines) {
				String writing = "artnr:"+line.artnr+", name:"+line.name+", preis:"+line.preis;
				nbw.write(writing, 0, writing.length());
				nbw.newLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static List<String> readLine() {
		 list = new ArrayList<String>();
		Scanner s;
	    File file = new File("Produktliste.txt");
		try{
			s = new Scanner(file);
			while(s.hasNextLine()) {
				list.add(s.nextLine());
				
			}
			return list;
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		return null;
		
	}

public static void main(String[] args) {
	List<String> unfiltered = readLine();
	for(String e : unfiltered) {
		//System.out.println(e);
	}
	
	for(int i = 0; i<list.size(); i++) {
		Produkt p = new Produkt();
	}
	
	


	}
}


