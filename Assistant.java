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
		int count = 0;
		for(int i = 0; i<supervisor.assistants.length; i++) {
			if(supervisor.assistants[i]==null) {
				count++;
			}
		}
		if(count==0) {
			System.exit(0);
		}
		for(int i = 0; i<supervisor.assistants.length; i++) {
			if(supervisor.assistants[i] == null) {
				supervisor.assistants[i] = this;
				
				break;
			}
		}
		
	}
	public void resign() { 
		if(supervisor!=null) {
			for(int i = 0; i<supervisor.assistants.length; i++) {
				if(supervisor.assistants[i] == this) {
					supervisor.assistants[i] = null;
					supervisor = null;
					break;
				}
				
			}
		}
		
	}
	
	public boolean employed() {
		if(supervisor!=null) {
			return true;
		}
		else {
			return false;
		}
		/*for(int i = 0; i<supervisor.assistants.length; i++) {
			if(supervisor.assistants[i] == this) {
				return true;
			}
		}
		return false; */
			
	}
	
	@Override
	public String toString() {
		
		return super.toString()+", Vorname des Chefs: "+supervisor.getPrenom()+ ", Nachname des Chefs: " +supervisor.getName();
	}
	
}
