public class Professor extends Staff{
	
	public Assistant[]  assistants = new Assistant[10];
	
	public Assistant[] getProf() {
		return assistants;
	}
	public void setAssistants(Assistant[] assistants) {
		this.assistants = assistants;
	}
	public Professor(String name, String prenom, String adress, String room, String telephoneNumber) {
		super(name, prenom, adress, room, telephoneNumber);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String assistenten=""; 
		for(int i = 0; i<assistants.length; i++) {
			if(assistants[i]!=null) {
			assistenten = assistenten + "\nName:"+assistants[i].getName()+ ", Vorname: " +assistants[i].getPrenom()+ ", Adresse: "+assistants[i].getAdress();
			}
		}
		return super.toString()+ " Assistenten: "+assistenten;
	}
	
	
}
