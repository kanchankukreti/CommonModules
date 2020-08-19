package com.xworkz.commonmodule.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.commonmodule.entity.LoginEntity;
import com.xworkz.commonmodule.entity.MilitaryEntity;

@Component
public class MilitaryDAOImpl implements MilitaryDAO {
	@Autowired
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public MilitaryDAOImpl() {
		System.out.println("calling from /t" + this.getClass().getSimpleName());
	}

	@Override
	public void create(MilitaryEntity entity) {
		Session session = factory.openSession();
		System.out.println("Started create method from DAO /t" + this.getClass().getSimpleName());
		System.out.println(entity);
		try {
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("Inserted successfully");
			System.out.println("End:" + this.getClass().getSimpleName());
		} catch (Exception e) {
			System.out.println(" insert failed");
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public void logindao(LoginEntity loginentity) {
		System.out.println("calling from logindao method /t" + this.getClass().getSimpleName());
		Session session = factory.openSession();
		System.out.println("Started logindao method from DAO /t" + this.getClass().getSimpleName());
		System.out.println(loginentity);
		try {
			session.beginTransaction();
			session.save(loginentity);
			session.getTransaction().commit();
			System.out.println("Inserted successfully");
			System.out.println("End:" + this.getClass().getSimpleName());
		} catch (Exception e) {
			System.out.println(" insert failed");
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void homeLoginCheck(String email, String password) {
		Session session = factory.openSession();
		System.out.println("Started create method from DAO /t" + this.getClass().getSimpleName());
		try {
			// get method
			String hql = "select L from LoginDTO L WHERE L.email='" + email + "' and L.password='" + password + "'";
			Query query = (Query) session.createQuery(hql).uniqueResult();
			System.out.println("End:" + this.getClass().getSimpleName());
		} catch (Exception e) {
			System.out.println("Inlid emailid or password");
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}

/*
 * @Override public MilitaryDTO militaryDetails(int id) { Session session =
 * factory.openSession(); try { session. } catch (Exception e) { // TODO: handle
 * exception } return null; }
 */
