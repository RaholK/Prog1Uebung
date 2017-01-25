public class Student extends UniMember {
	private static int count = 1000000;
	private int matriculationNumber;
	public Student(String name, String prenom, String adress) {
		super(name, prenom, adress);
		matriculationNumber = ++count;
	}
	
	public int getMatriculationNumber() {
		return matriculationNumber;
	}

	public void setMatriculationNumber(int matriculationNumber) {
		this.matriculationNumber = matriculationNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Matrikelnummer: "+matriculationNumber ;
	}
	
}