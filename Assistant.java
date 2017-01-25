public class Assistant extends Staff {
	private Professor supervisor;
	public Professor getProf() {
		return supervisor;
	}
	public void setSupervisor(Professor supervisor) {
		this.supervisor = supervisor;
	}
	public Assistant(String name, String prenom, String adress, String room, String telephoneNumber, Professor supervisor) {
		super(name, prenom, adress, room, telephoneNumber);
		this.supervisor = supervisor;
		for(int i = 0; i<supervisor.assistants.length; i++) {
			if(supervisor.assistants[i] == null) {
				supervisor.assistants[i] = this;
				break;
			}
			System.exit(0);
		}
		
	}
	public void resign() { 
		for(int i = 0; i<supervisor.assistants.length; i++) {
			if(supervisor.assistants[i] == this) {
				supervisor.assistants[i] = null;
			}
		}
	}
	
	public boolean employed() {
		for(int i = 0; i<supervisor.assistants.length; i++) {
			if(supervisor.assistants[i] == this) {
				return true;
			}
		}
		return false;
			
	}
	
	@Override
	public String toString() {
		
		return super.toString()+", Vorname des Chefs: "+supervisor.getPrenom()+ ", Nachname des Chefs: " +supervisor.getName();
	}
	
}