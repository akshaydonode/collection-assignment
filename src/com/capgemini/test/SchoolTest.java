package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.CellPhone;
import com.capgemini.model.School;

public class SchoolTest {

	private static School samarth;
	private static School sinhgad;
	private static School universal;
	
	
	@BeforeClass
	public static void setUp() {
		samarth =new School("Samarth Vidyalaya Lakhani","Lakhani","Bhandara",1);
		sinhgad = new School("Sinhgad Public School","Lonavala","Pune",4);
		universal =new School("Universal Public School","Gadegaon","Bhandara",2);
	}
	
	@Test
	public void testCheckWhetherItIsNotContainDuiplicates() {
		HashSet<School>  schools=new HashSet<>();
		schools.add(samarth);
		schools.add(sinhgad);
		schools.add(universal);
		schools.add(samarth);
		
		
		assertEquals(3, schools.size());
	}
	
	@Test
	public void testCheckInsertionOrderFollow() {
		ArrayList<School> schools = new ArrayList<>();
		schools.add(samarth);
		schools.add(universal);
		schools.add(sinhgad);
		
		Iterator<School> iterator = schools.iterator(); 
		assertEquals("Samarth Vidyalaya Lakhani", iterator.next().getName());
		assertEquals("Universal Public School", iterator.next().getName());
		assertEquals("Sinhgad Public School", iterator.next().getName());
	}
	

}
