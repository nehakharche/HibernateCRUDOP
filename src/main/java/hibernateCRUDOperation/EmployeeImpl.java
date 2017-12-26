package hibernateCRUDOperation;

import hibernateCRUDOperation.EmployeeTestClass.SearchParam;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;




public class EmployeeImpl implements EmployeeInterface {

	// Session session = HibernateUtil.getSessionFactory().openSession();
	//Session session = HibernateUtil.getSessionFactory().openSession();

	private void resourceCleanupActivity(Session session, Transaction trans) {
		// TODO Auto-generated method stub
		/*if (null != trans)
			trans.commit();*/
		if (null != session)
			session.close();
	}
	private void checkForNullFields(EmployeePojoclass emp) throws MyException {
		// TODO Auto-generated method stub

		if (null == emp || emp.getId() <= 0 || null == emp.getEmp_Name() || null == emp.getEmp_Designation()
				|| emp.Emp_Name.trim().length() <= 1 || emp.getEmp_Designation().trim().length() <= 1) {
			throw new MyException("Fields cannot be null");
		}
	}
	public boolean addemployee(EmployeePojoclass d) throws MyException {
		// TODO Auto-generated method stub
		if (null == d) 
		{
			throw new MyException("Object should not be null");
		}
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		try
		{
			session.save(d);
			t.commit();
		} catch (Exception ex) {
			// t.rollback();
			throw new MyException("Object value not stored");
		}finally {
			resourceCleanupActivity(session, t);
		}
		return true;
	}

	public EmployeePojoclass GetEmployee(int id) throws MyException {
		// TODO Auto-generated method stub
		EmployeePojoclass emp = new EmployeePojoclass();
		if (0 == id)
		{
			throw new MyException("Object ID should not be null");
		}
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		try 
		{
			emp = session.get(EmployeePojoclass.class, id);
			t.commit();
		} catch (Exception ex) {
			// t.rollback();
			throw new MyException("Object not found");
		}finally {
			resourceCleanupActivity(session, t);
		}
		return emp;
	}

	public boolean deleteemployee(int id) throws MyException {
		// TODO Auto-generated method stub

		if (0 == id) {
			throw new MyException("Object should not be null");
		}
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		try
		{
			EmployeePojoclass emp = session.get(EmployeePojoclass.class, id);
			session.delete(emp);
			t.commit();
		} catch (Exception ex) {
			// t.rollback();
			throw new MyException("Object will not present");
		}finally {
			resourceCleanupActivity(session, t);
		}

		return false;
	}

	public List<EmployeePojoclass> GetAllEmployee() throws MyException {
		List<EmployeePojoclass> list = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		try 
		{	
			list = session.createQuery("from EmployeePojoclass").list();
			t.commit();
		} catch (Exception ex) {
			// t.rollback();
			throw new MyException("Data not retrived");
		}finally {
			resourceCleanupActivity(session, t);
		}
		return (List<EmployeePojoclass>) list;

	}

	//public boolean updateemployee(int id, String name) throws MyException {
	public EmployeePojoclass updateemployee(EmployeePojoclass emp) throws MyException {
		// TODO Auto-generated method stub
		checkForNullFields(emp);
		if (null == GetEmployee(emp.getId())) {
			throw new MyException("Employee doesn't exist ");
		}
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		try 
		{
			session.update(emp);
			/*EmployeePojoclass e = session.get(EmployeePojoclass.class, id);
			e.setEmp_Name(name);
			session.update(e);*/
			
			t.commit();
		} catch (Exception ex) {
			throw new MyException("Data is not updated");
		} finally {
			resourceCleanupActivity(session, t);
		}
		//return true;
	     return emp;
	}

	//public EmployeePojoclass SearchByCriteria(String name) throws MyException {

	public List<EmployeePojoclass> searchEmployeeWithSomeCriteria(EmployeePojoclass emp, EmployeeTestClass.SearchParam  ... searchParam)
			throws MyException {
		/*Transaction t = session.beginTransaction();
		EmployeePojoclass e = session.load(EmployeePojoclass.class, name);
		System.out.println(e);
		return null;*/

		checkForNullFields(emp);
		List<EmployeePojoclass> empList = new ArrayList<EmployeePojoclass>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trans = session.beginTransaction();
		Criteria criteria = session.createCriteria(EmployeePojoclass.class);
		for (EmployeeTestClass.SearchParam param : searchParam) {

			if (param == SearchParam.EMPLOYEEID) {
				empList.add((EmployeePojoclass) session.get(EmployeePojoclass.class, emp.getId()));
				return empList;
			}

			if (param == SearchParam.EMPLOYEENAME) {
				criteria.add(Restrictions.eq("empName", emp.getEmp_Name()));
			}
			if (param == SearchParam.EMPLOYEEDESIGNATION) {
				criteria.add(Restrictions.eq("empAddress", emp.getEmp_Designation()));
			}
			if (param == SearchParam.AES_ORDER) {
				criteria.addOrder(Order.asc("empName"));
			}
			if (param == SearchParam.DES_ORDER) {
				criteria.addOrder(Order.desc("empName"));
			}
		}
		empList = criteria.list();
		resourceCleanupActivity(session, trans);
		return empList;
	}
	public boolean updateemployee(int d, String name) throws MyException {
		// TODO Auto-generated method stub
		return false;
	}
	public EmployeePojoclass SearchByCriteria(String name) throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

}
