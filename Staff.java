public class Staff extends UniMember {
	private String room;
	private String telephoneNumber;
	private static long StaffNo=1000;
	private long Staffno;
	
	public long getStaffNo() {
		return Staffno;
	}

	public Staff(String name, String prenom, String adress, String room, String telephoneNumber) {
		super(name, prenom, adress);
		this.room = room;
		this.telephoneNumber = telephoneNumber;
		Staffno = StaffNo;
		StaffNo++;		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Raum: "+room+ ", Telefonnummer: "+telephoneNumber+", Personalnummer: "+Staffno ;
	}
	
}