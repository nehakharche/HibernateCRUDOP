package hibernateCRUDOperation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	public static SessionFactory sf=null;
	public static SessionFactory getSessionFactory() 
	{
	if (sf == null) 
		{
			 sf=new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		}
		return sf;

	}

}

