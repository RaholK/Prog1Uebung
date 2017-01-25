
public class UniMember {
	// super class of Student and Staff

	// fields of university members
	private String name;
	private String prenom;
	private String adress;
	
	// constructor
	public UniMember(String name, String prenom, String adress){
		this.setName(name);
		this.setPrenom(prenom);
		this.setAdress(adress);
	}
	
	public boolean employed() {
		if(this instanceof Staff) {
			return true;
		}
		return false;
	}

	// return instance as String
	public String toString(){
		return "Name: "+name+", Vorname: "+ prenom+ ", Adresse: " + adress;
	}
	
	// getter and setter for fields
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
}
