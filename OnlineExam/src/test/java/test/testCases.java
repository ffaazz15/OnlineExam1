package test;


//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import com.example.demo.layer2.UserID;
//
//
//
//
//
//	public class testCases{
//
//		
//		
//		@Test
//		public void insertUser() {
//			EntityManagerFactory entityManagerFactory = 
//					Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 
//			
//			System.out.println("Entity Manager Factory : "+entityManagerFactory);
//			
//			EntityManager entityManager = entityManagerFactory.createEntityManager();
//			//ctrl+shift+M
//			
//			System.out.println("Entity Manager : "+entityManager);
//			
//			EntityTransaction transaction = entityManager.getTransaction();
//			transaction.begin();
//				UserID user = new UserID();
//				UserID uid = new UserID();
//				UserID password = new UserID();
//				
//				user.setS_No(5);
//				entityManager.persist(user);
//				
//				uid.setUser_id("fazil");
//				entityManager.persist(uid);
//				
//				password.setPassword("lkjhh");
//				entityManager.persist(password);
//			
//			transaction.commit();
//		}
//	}
//	