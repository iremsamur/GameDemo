import java.util.Date;

public class Player implements Entity{
	public int Id;
	public String FirstName;
	public String LastName;
	public Date DateOfBirth;
	public String NationalityId;
	
	
	public Player(int id,Date dateOfBirth, String firstName, String lastName, String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalityId = nationalityId;
		DateOfBirth = dateOfBirth;
		
	}

	

	

}
