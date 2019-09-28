import java.util.Date;

public class Secretary extends DeptEmployee {

	double overtimeHours;

	public Secretary(String name, double salary, Date hireDate, double overtimeHours) {
		super(name, salary, hireDate);
		this.overtimeHours = overtimeHours;
	}
	
	public double computeSalary (){
		return salary + 12* overtimeHours;
	}
	
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
}
