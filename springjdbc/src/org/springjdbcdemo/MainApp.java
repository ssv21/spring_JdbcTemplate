package org.springjdbcdemo;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml"); 
		StudentJdbcTemplate stjdbctem =(StudentJdbcTemplate)context.getBean("st");
		System.out.println("records creation");
		
		stjdbctem.create(100, "suneel", 23);
		stjdbctem.create(101, "somu", 25);
		stjdbctem.create(102, "siva", 23);
		stjdbctem.create(103, "subbu", 23);
		stjdbctem.create(104, "nag", 23);
		stjdbctem.create(105, "eka", 24);
		
		System.out.println("listing multiple records");
		List<Student> li =stjdbctem.listStudents();
		for(Student rec : li){
		System.out.println(rec.getId());
		System.out.println(rec.getName());
		System.out.println(rec.getAge());
		}
		System.out.println("update records");		
		stjdbctem.update(100, 24);
		System.out.println("listing updated record ");
		
		Student st =stjdbctem.getStudent(100);
		System.out.println(st.getAge());
		System.out.println(st.getId());
		System.out.println(st.getName());
	}	
}

