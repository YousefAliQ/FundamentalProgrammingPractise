import java.util.Date;

public class Professor extends DeptEmployee {

	int numberOfPublications;
	
	public Professor(String name, double salary, Date hireDate, int numberOfPublications) {
		super(name, salary, hireDate);
		this.numberOfPublications = numberOfPublications;
		// TODO Auto-generated constructor stub
	}

	public double computeSalary (){
		return salary;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
}
