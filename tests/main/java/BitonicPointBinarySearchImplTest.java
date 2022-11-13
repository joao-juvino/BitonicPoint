package main.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.SetUp;
import problems.BitonicPointBinarySearch;
import problems.BitonicPointBinarySearchImpl;

class BitonicPointBinarySearchImplTest {

	SetUp st;
	BitonicPointBinarySearch<Integer> bp;
	
	@BeforeEach
	void setUp() {
		this.st = new SetUp();
		bp = new BitonicPointBinarySearchImpl<Integer>();
	}
	
	@Test
	void test1() {
		assertEquals(this.bp.bitonicPoint(this.st.arrayPadrao1), 20);
	}
	
	@Test
	void test2() {
		assertEquals(this.bp.bitonicPoint(this.st.arrayPadrao2), 20);
	}
	
	@Test
	void test3() {
		assertEquals(this.bp.bitonicPoint(this.st.arrayPadrao3), 25);
	}
	
	@Test
	void test4() {
		assertEquals(this.bp.bitonicPoint(this.st.arrayBordaRight), 20);
	}
	
	@Test
	void test5() {
		assertEquals(this.bp.bitonicPoint(this.st.arrayBordaLeft), 20);
	}
	
	@Test
	void test8() {
		assertNull(this.bp.bitonicPoint(this.st.arrayVazio));
	}
	
	@Test
	void test9() {
		assertEquals(this.bp.bitonicPoint(this.st.arrayUnitario), 7);
	}
	
	@Test
	void test10() {
		assertEquals(this.bp.bitonicPoint(this.st.arrayNegativo), 20);
	}
	
	@Test
	void test11() {
		assertEquals(this.bp.bitonicPoint(this.st.arrayFullNegativo), -1);
	}
	
	@Test
	void test12() {
		assertNull(this.bp.bitonicPoint(this.st.arrayNulo));
	}
	
	@Test
	void test13() {
		assertNull(this.bp.bitonicPoint(this.st.arrayFullNulo));
	}

}
