package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.CellPhone;

public class CellPhoneTest {


	private static CellPhone moto;
	private static CellPhone mi;
	private static CellPhone apple;
	
	@BeforeClass
	public static void setUp() {
		moto = new CellPhone("MOTOROLA","E4 Plus","2GB-RAM","Android-Lolipop",10000);
		mi = new CellPhone("XIOMI","Note 6 Pro","4GB-RAM","Android-MarshMello",11000);
		apple = new CellPhone("Apple","i10","6GB-RAM","ios 10",50000);
		}
	@Test
	public void testCheckWhetherItIsNotContainDuiplicates() {
		HashSet<CellPhone>  cellPhones=new HashSet<>();
		cellPhones.add(moto);
		cellPhones.add(mi);
		cellPhones.add(apple);
		cellPhones.add(mi);
		
		
		assertEquals(3, cellPhones.size());
	}
	@Test
	public void testCheckInsertionOrderFollow() {
		ArrayList<CellPhone> cellPhones = new ArrayList<>();
		cellPhones.add(apple);
		cellPhones.add(moto);
		cellPhones.add(mi);
		
		Iterator<CellPhone> iterator = cellPhones.iterator(); 
		assertEquals("Apple", iterator.next().getCompany());
		assertEquals("MOTOROLA", iterator.next().getCompany());
		assertEquals("XIOMI", iterator.next().getCompany());
	}
}
