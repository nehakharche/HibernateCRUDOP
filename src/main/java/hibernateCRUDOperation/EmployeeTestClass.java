package hibernateCRUDOperation;

import java.util.List;



public class EmployeeTestClass {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
    EmployeePojoclass emp1=new EmployeePojoclass(1,"Neha","Trainee Developer", "Pune", 25000);
     EmployeePojoclass emp2=new EmployeePojoclass(2,"smita","Dot Net Developer", "Pune", 35000);
    EmployeePojoclass emp3=new EmployeePojoclass(3,"Tina","Developer", "Pune", 45000);
     EmployeeImpl emp_impl=new EmployeeImpl();
     emp_impl.addemployee(emp1); 
     emp_impl.addemployee(emp2); 
     emp_impl.addemployee(emp3);
     emp_impl.deleteemployee(3);
  
  
     System.out.println("Get Data:=" + emp_impl.GetEmployee(2));
     System.out.println("Update:=" + emp_impl.updateemployee(emp2));

     System.out.println("List:=" + emp_impl.GetAllEmployee());

	 System.out.println("Criteria:=" + emp_impl.searchEmployeeWithSomeCriteria(emp2));
	 
     System.out.println("Search Criteria on Employee ID:= " + emp_impl.searchEmployeeWithSomeCriteria(
				new EmployeePojoclass(1,"Neha","Trainee Developer","Pune",12000), EmployeeTestClass.SearchParam.EMPLOYEEID));
    
     /*System.out.println("Search Criteria on Employee ID:= " + emp_impl.searchEmployeeWithSomeCriteria(
				new EmployeePojoclass(1,"Neha","Trainee Developer","Pune",12000), EmployeeTestClass.SearchParam.EMPLOYEENAME));
     
     System.out.println("Search Criteria on Employee ID:= " + emp_impl.searchEmployeeWithSomeCriteria(
				new EmployeePojoclass(1,"Neha","Trainee Developer","Pune",12000), EmployeeTestClass.SearchParam.EMPLOYEEDESIGNATION));
     */
     //emp_impl.updateemployee(1,"Smita");
     //emp_impl.SearchByCriteria("smita");
	}
	enum SearchParam {
		EMPLOYEEID, 
		EMPLOYEENAME, 
		EMPLOYEEDESIGNATION, 
		AES_ORDER, 
		DES_ORDER, 
		ALL;

	}
}

