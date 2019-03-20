package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Car;

public class CarTest {

	private static Car suzuki;
	private static Car honda;
	private static Car tata;
	
	@BeforeClass
	public static void setUp() {
		suzuki = new Car("SUZUKI","i20",2017,500000);
		honda =  new Car("HONDA","City",2011,900000);
		tata =  new Car("TATA","Tiago",2016,300000);
	}
	
	@Test
	public void testCheckWhetherItIsNotContainDuiplicates() {
		HashSet<Car>  car=new HashSet<>();
		car.add(suzuki);
		car.add(honda);
		car.add(tata);
		car.add(honda);
		
		
		assertEquals(3, car.size());
	}
	
	@Test
	public void testCheckInsertionOrderFollow() {
		ArrayList<Car> car = new ArrayList<>();
		car.add(suzuki);
		car.add(tata);
		car.add(honda);
		car.add(honda);
		
		Iterator<Car> iterator = car.iterator(); 
		assertEquals("SUZUKI", iterator.next().getMake());
		assertEquals("TATA", iterator.next().getMake());
		assertEquals("HONDA", iterator.next().getMake());
		assertEquals("HONDA", iterator.next().getMake());
	}
	
	@Test
	public void testAscendingOrder() {
		TreeSet<Car> car = new TreeSet<Car>();
		car.add(honda);
		car.add(tata);
		car.add(suzuki);
	
		
		Iterator<Car> iterator = car.iterator(); 
		assertEquals("HONDA", iterator.next().getMake());
		assertEquals("SUZUKI", iterator.next().getMake());
		assertEquals("TATA", iterator.next().getMake());
	
	}
	

}
