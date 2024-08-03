package com.app.gsa.DAO;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.gsa.DTO.MatrimonyDTO;

@Repository
public class MatrimonyDAO {
	@Autowired
	private SessionFactory sf;
	public void register(MatrimonyDTO dto) {
		//create an object of configuration
				Configuration config=new Configuration();
				
				//To load the resources
				// load hibernate.cfg.xml
				config.configure();
				
				
				//To load mapping class
				
				config.addAnnotatedClass(MatrimonyDTO.class);
		System.out.println("inside a DAO");
		Session sess=sf.openSession();
		sess.save(dto);
		sess.beginTransaction().commit();
	}

}
