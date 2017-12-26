package hibernateCRUDOperation;

import java.util.List;

public interface EmployeeInterface {
	
   public boolean addemployee(EmployeePojoclass d) throws Exception;
   public boolean deleteemployee(int id) throws MyException;
   public EmployeePojoclass GetEmployee(int id)throws MyException;
   public List<EmployeePojoclass> GetAllEmployee() throws MyException;
   public boolean updateemployee(int d,String name)throws MyException;
   public EmployeePojoclass SearchByCriteria(String name) throws MyException;
   public List<EmployeePojoclass> searchEmployeeWithSomeCriteria(EmployeePojoclass emp, EmployeeTestClass.SearchParam  ... searchParam)
			throws MyException;
   public EmployeePojoclass updateemployee(EmployeePojoclass emp) throws MyException;
}
