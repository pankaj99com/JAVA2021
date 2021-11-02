package mapPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDemo {

	public static void main(String[] args) {
		
		List<Student> students=new ArrayList<Student>();
		
		students.add(new Student(1,"pankaj",30));
		students.add(new Student(2,"Sandeep",28));
		students.add(new Student(3,"Vishwa",29));
		students.add(new Student(4,"pranjali",26));
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		
		for (Student student : students) {
			
			map.put(student.getID(),student.getName());
			//map.put(student.getID(),student.getAge());
			
		}
		
		System.out.println(map);

	}

}
