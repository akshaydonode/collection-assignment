package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Television;

public class TelevisionTest {

	private static Television samsung;
	private static Television onida;
	private static Television lg;
	
	@BeforeClass
	public static void setUp() {
		samsung = new Television("Samsung","LCD",true,45000);
		onida =  new Television("Onida","LED",false,55000);
		lg =  new Television("LG","Plasma",true,60000);
	}
	
	@Test
	public void testCheckWhetherItIsNotContainDuiplicates() {
		HashSet<Television>  televisions=new HashSet<>();
		televisions.add(samsung);
		televisions.add(onida);
		televisions.add(lg);
		televisions.add(onida);
		
		
		assertEquals(3, televisions.size());
	}
	
	@Test
	public void testCheckInsertionOrderFollow() {
		ArrayList<Television> television = new ArrayList<>();
		television.add(onida);
		television.add(lg);
		television.add(samsung);
		
		Iterator<Television> iterator = television.iterator(); 
		assertEquals("Onida", iterator.next().getCompany());
		assertEquals("LG", iterator.next().getCompany());
		assertEquals("Samsung", iterator.next().getCompany());
	}
}
