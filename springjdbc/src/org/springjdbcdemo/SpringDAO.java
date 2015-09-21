 package org.springjdbcdemo;

import java.util.List;

import javax.sql.DataSource;

public interface SpringDAO {
	
	//create a records in the student table
	public void create(Integer id,String name,Integer age);
	
	//to retrieve the data based upon id
	public Student getStudent(Integer id);
	
	//to list down all the records from the student table
	public List<Student> listStudents();
	
	//to delete the record based upon id
	public void delete(Integer id);
	
	//to update the record based upon id
	public void update(Integer id,Integer age);
}
