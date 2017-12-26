package hibernateCRUDOperation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//Pojo class
@Entity
@Table(name="EmployeeDemo")
public class EmployeePojoclass {
	@Id
	@Column (name="ID")
	int id;
	@Column (name="EMP_NAME")
	String Emp_Name;
	@Column (name="EMP_DESIGNATION")
	String Emp_Designation;
	@Column (name="EMP_CITY")
	String Emp_City;
	@Column (name="EMP_SALARY")
	int Emp_Salary;
	
	public EmployeePojoclass() {
		super();
	}
	public EmployeePojoclass(int id, String emp_Name, String emp_Designation,
			String emp_City, int emp_Salary) {
		super();
		this.id = id;
		Emp_Name = emp_Name;
		Emp_Designation = emp_Designation;
		Emp_City = emp_City;
		Emp_Salary = emp_Salary;
	}
	
	@Override
	public String toString() {
		return "EmployeePojoclass [id=" + id + ", Emp_Name=" + Emp_Name
				+ ", Emp_Designation=" + Emp_Designation + ", Emp_City="
				+ Emp_City + ", Emp_Salary=" + Emp_Salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmp_Name() {
		return Emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}
	public String getEmp_Designation() {
		return Emp_Designation;
	}
	public void setEmp_Designation(String emp_Designation) {
		Emp_Designation = emp_Designation;
	}
	public String getEmp_City() {
		return Emp_City;
	}
	public void setEmp_City(String emp_City) {
		Emp_City = emp_City;
	}
	public int getEmp_Salary() {
		return Emp_Salary;
	}
	public void setEmp_Salary(int emp_Salary) {
		Emp_Salary = emp_Salary;
	}
	
	
	
	
	
}
