package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Car;
import com.capgemini.model.Student;

public class StudentTest {
	
	private static Student akshay;
	private static Student ram;
	private static Student ruchir;
	
	
	@BeforeClass
	public static void setUp() {
		akshay = new Student("Akshay",11,"Nagpur");
		ram = new Student("Ram",12,"Banglore");
		ruchir = new Student("Ruchir",10,"Mumbai");
	}
	
	@Test
	public void testCheckWhetherItIsNotContainDuiplicates() {
		HashSet<Student>  students=new HashSet<>();
		students.add(akshay);
		students.add(ruchir);
		students.add(akshay);
		students.add(ram);
		
		
		assertEquals(3, students.size());
	}

	@Test
	public void testCheckInsertionOrderFollow() {
		ArrayList<Student> students = new ArrayList<>();
		students.add(ruchir);
		students.add(akshay);
		students.add(ram);
		
		Iterator<Student> iterator = students.iterator(); 
		assertEquals("Ruchir", iterator.next().getName());
		assertEquals("Akshay", iterator.next().getName());
		assertEquals("Ram", iterator.next().getName());
	}
	@Test
	public void testAscendingOrder() {
		TreeSet<Student> students = new TreeSet<Student>();
		students.add(ruchir);
		students.add(akshay);
		students.add(ram);
	
		
		Iterator<Student> iterator = students.iterator(); 
		assertEquals("Akshay", iterator.next().getName());
		assertEquals("Ram", iterator.next().getName());
		assertEquals("Ruchir", iterator.next().getName());
	
	}
	@Test
	public void testCheckValueUsingKey() {
		Map<String, String> map = new HashMap<String, String>();
		map.put(ruchir.getName(), "Mango");
		map.put(akshay.getName(), "Apple");
		map.put(ram.getName(), "Orange");
		
		assertEquals("Mango", map.get(ruchir.getName()));
		assertEquals("Apple", map.get(akshay.getName()));
		assertEquals("Orange", map.get(ram.getName()));
	}
}
