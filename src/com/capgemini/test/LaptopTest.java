package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Laptop;

public class LaptopTest {

	private static Laptop dellLaptop;
	private static Laptop hpLaptop;
	private static Laptop lenovoLaptop;
	
	@BeforeClass
	public static void setUp() {
		dellLaptop = new Laptop("DELL","inspirion","Ubuntu","i5");
		hpLaptop = new Laptop("HP","pavilion","Windows 10","i7");
		lenovoLaptop =new Laptop("Lenovo","xyz","windows XP","i3");
	}

	@Test
	public void testCheckWhetherItIsNotContainDuiplicates() {
		HashSet<Laptop>  laptop=new HashSet<>();
		laptop.add(dellLaptop);
		laptop.add(lenovoLaptop);
		laptop.add(hpLaptop);
		laptop.add(dellLaptop);
		
		
		assertEquals(3, laptop.size());
	}
	
	@Test
	public void testCheckInsertionOrderFollow() {
		ArrayList<Laptop> laptop = new ArrayList<Laptop>();
		laptop.add(dellLaptop);
		laptop.add(lenovoLaptop);
		laptop.add(hpLaptop);
		
		Iterator<Laptop> iterator = laptop.iterator(); 
		assertEquals("DELL", iterator.next().getCompany());
		assertEquals("Lenovo", iterator.next().getCompany());
		assertEquals("HP", iterator.next().getCompany());
	}
	

}
