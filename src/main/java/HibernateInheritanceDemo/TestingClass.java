package HibernateInheritanceDemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Session session=HibernateUtil.sf.openSession();
       Transaction t=session.beginTransaction();
       
       Vehicle v1=new Vehicle(2001, "Two Wheeler");
       Vehicle v2=new Vehicle(4001, "Four Wheeler");
      
       TwoWheeler t1=new TwoWheeler(101, "Two", "Honda", "Red", 15000);
       TwoWheeler tv1=new  TwoWheeler();
       tv1.setVehicleNo(2001);
       tv1.setV_comp_name("Hero");
       tv1.setColor("black");
       tv1.setV_price(50000);
       
//       TwoWheeler tv2=new  TwoWheeler();
//       tv1.setV_comp_name("Honda");
//       tv1.setColor("Red");
//       tv1.setV_price(60000);
       
       FourWheeler fw1=new FourWheeler();
       
       fw1.setModelNo("M-800");
       fw1.setV_comp_name("Maruti");
       fw1.setV_price(650000);
       
       
       session.save(v1);
       session.save(v2);
       session.save(t1);
       session.save(fw1);
       
       t.commit();
       session.close();
       
       
	}

}
