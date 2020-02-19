package edu.umb.cs.cs680.hw02;
import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import edu.umb.cs.cs680.hw02.Student;

public class StudentTest {

	@Test
	public void createInStateStudent() {
		Student cut = Student.createInStateStudent("Mark", "100 Comm ave.", 2);
		String actual = cut.getName();
		String expected = "Mark";
	
		assertThat(actual, is(expected));
	}

	@Test
	public void createOutStateStudent() {
		Student cut = Student.createOutStateStudent("Rebecca", "200 Tremont St.", 5);
		String actual = cut.getName();
		String expected = "Rebecca";
		assertThat(actual, is(expected));
	}
	
		
	
	
	@Test
	public void createIntlStudent() {
		Student cut = Student.createIntlStudent("Penelope", 12345, "500 Washington St.", 1, "125 Bombay St.");
		String actual = cut.getName();
		String expected = "Penelope";
		assertThat(actual, is(expected));
	
	}
	
	}

