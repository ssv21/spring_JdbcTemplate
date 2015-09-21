package org.springjdbcdemo ;
import java.util.List;                                         	
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
public class StudentJdbcTemplate implements SpringDAO {

	private JdbcTemplate jdbcTemplateObject;

	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}
	
	public void create(Integer id, String name, Integer age) {
	String sql ="insert into student1(id,name,age) values (?,?,?)";
	jdbcTemplateObject.update(sql,id,name,age);
	System.out.println("created id="+id+"age="+age+"name="+name);
	return ;	
	}
	public Student getStudent(Integer id) {
		String sql ="select * from student1 where id=?";
		Student st =jdbcTemplateObject.queryForObject(sql,new Object[]{id},new StudentMapper());
		return st;
	}
	public List<Student> listStudents() {
		String sql ="select * from student1";
		List<Student> sts =jdbcTemplateObject.query(sql, new StudentMapper());
		return sts;
	}
	public void delete(Integer id) {
		String sql ="delete from student1 where id=?";
		jdbcTemplateObject.update(sql,id);
		System.out.println("delete id="+id);
		return;
	}
	public void update(Integer id,Integer age) {
		String sql ="update Student1 set age=? where id=?";
		jdbcTemplateObject.update(sql,age,id);
		System.out.println("update id="+id);
		return;
	}
		// TODO Auto-generated method stub
}
