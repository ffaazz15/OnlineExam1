package test;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Subject;
import com.example.demo.repo.SubjectRepo;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.PersistenceUnit;

	import org.junit.jupiter.api.Test;
	import org.springframework.beans.factory.annotation.Autowired;
	



	@SpringBootTest
	public class OnlineExamCRUDTest {
	 

	@Autowired
	SubjectRepo subRepo;


	@PersistenceUnit
	  EntityManagerFactory entityManagerFactory;






	@Test
	void insertDetails() {


	System.out.println("Entity Manager Factory : "+entityManagerFactory);

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	System.out.println("Entity Manager : "+entityManager);

	EntityTransaction transaction = entityManager.getTransaction();


	System.out.println("Entity Manager : "+entityManager);

	transaction.begin();





	  Subject s = new Subject();
          s.setSubject("physics");
          s.setSubject_id(2);
          s.setLevels(3);
	entityManager.persist(s);
	transaction.commit();
	}

	}

//
//
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//import org.junit.jupiter.api.Test;
//
//import com.example.demo.layer2.StudentTable;
//
//
//public class OnlineExamCRUDTest {
//
//
//@Test
//public void insertStudentTable() {
//EntityManagerFactory entityManagerFactory =
//Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here
//
//System.out.println("Entity Manager Factory : "+entityManagerFactory);
//
//EntityManager entityManager = entityManagerFactory.createEntityManager();
////ctrl+shift+M
//
//System.out.println("Entity Manager : "+entityManager);
//
//EntityTransaction transaction = entityManager.getTransaction();
//transaction.begin();
//StudentTable stutable = new StudentTable(); //new/blank entity object
//stutable.setFull_Name("smith");
//entityManager.persist(stutable); //generate the insert query for us
//transaction.commit();
//}
//
//
//}
