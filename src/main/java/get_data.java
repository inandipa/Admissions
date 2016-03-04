import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class get_data {

	public static void main(String[] args) {
	
	
	DataModel model = new DataModel();
	
	
	SessionFactory sessionfactory =  new Configuration().configure().buildSessionFactory();
	Session session = sessionfactory.openSession();
	session.beginTransaction();
	model = (DataModel) session.get(DataModel.class, 6);

	System.out.println("Data retreived for id = 3");
	System.out.println("Data : ");
	System.out.println("First name : "+ model.getFirstname());
	System.out.println("Last name : " + model.getLastname());
	System.out.println("Locattion : "+ model.getLocation());
	}

}
