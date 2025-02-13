

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Text {
	public static void main(String[] args)
	{
		College c=new College("vsb","karur",98);
		
		Transaction tr=null;
		try(Session sess=HBUtil.getsesfac1().openSession())
		{
			tr=sess.beginTransaction();
			sess.persist(c);
			tr.commit();
		}
		catch(Exception e) {
			if(tr!=null)
				tr.rollback();
				e.printStackTrace();
			
		}
	}
}