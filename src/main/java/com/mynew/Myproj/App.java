package com.mynew.Myproj;
import org.hiberate.cfg.AnnotationConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfiguration cfg=new AnnotatioConfiguration();
        cfg.configure("");
        SessionFactory sf=cfg.buildSessionFactory();
        Session ses=sf.openSession();
        Transaction ts=ses.beginTransaction();
        
        
       Student student1=new 
    }
}
