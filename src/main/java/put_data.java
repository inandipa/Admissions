import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class put_data {

	public static void main(String[] args){
		DataModel model = new DataModel();
		model.setId(6);
		model.setFirstname("lakshman");
		model.setLastname("ramu");
		model.setLocation("chennai");
		
		SessionFactory sessionfactory =  new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(model);
		session.getTransaction().commit();
		
	
}
	
}
