package HibernateInheritanceDemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static Configuration con=new Configuration();
	public static SessionFactory sf=con.configure("Hibernate.cfg.xml").buildSessionFactory();
	

}
