import java.util.Date;

public class DeptEmployee {

	String name;
	double salary;
	Date hireDate;
	

	public DeptEmployee(String name, double salary, Date hireDate) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	public double computeSalary (){
		return salary;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
}
