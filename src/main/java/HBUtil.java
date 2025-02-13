

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HBUtil {

	public static StandardServiceRegistry registry=null;
	public static SessionFactory  sesfac=null;
	
	public static SessionFactory getsesfac() {
		
		if(sesfac ==null) {
			try {
				
				//create registry
				registry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				
				//create MetadataSources
				MetadataSources sources=new MetadataSources(registry);
				
				//create MetaData
				Metadata metadata=sources.getMetadataBuilder().build();
				
				//create Session Factory
				sesfac = metadata.getSessionFactoryBuilder().build();
				
			}
			catch (Exception e) {
                  e.printStackTrace();
                  if(registry != null) {
                	   StandardServiceRegistryBuilder.destroy(registry);
                  }
			
			}
		}
		
		return sesfac;
		
		
	}

	public static SessionFactory getsesfac1() {
		// TODO Auto-generated method stub
		return null;
	}
}