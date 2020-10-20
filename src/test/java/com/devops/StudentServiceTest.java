package com.devops;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.devops.Student;
import com.devops.StudentService;


@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {
	
	@Mock
	private StudentService studentService;
	
	@Test 
	public void getBooksByIdTest() throws Exception {
		Student student = studentService.getStudent(01);  
	}
	
	@Test 
	public void getDeleteStudentTest() throws Exception {
		    studentService.deleteStudent(01);  
	}


}
