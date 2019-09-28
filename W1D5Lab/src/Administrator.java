import java.util.Date;

public class Administrator extends DeptEmployee{
	int workHoures = 0;
	public Administrator(String name, double salary, Date hireDate, int workHoures) {
		super(name, salary, hireDate);
		this.workHoures = workHoures;
		// TODO Auto-generated constructor stub
	}
	
	public double computeSalary () {
		return workHoures * 20;
	}

}
