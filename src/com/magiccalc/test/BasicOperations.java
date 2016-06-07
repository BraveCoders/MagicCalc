package com.magiccalc.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.magiccalc.core.Expr;
import com.magiccalc.core.ExprFact;

public class BasicOperations {
	
	private static int counter;
	private static ExprFact exprFact;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Starting testsuite BasicOperations");
		counter = 0;
		exprFact = new ExprFact();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Starting testcase " + ++counter);
	}

	@Test
	public void test1() {
		Expr ex = exprFact.createExpr("2/4");
		double x = ex.getValue();
		if(x != 0.5)
			fail("Testcase " + counter + " of BasicOperations failed for expression 2/4 with exit value: " + x);
	}

	@Test
	public void test2() {
		Expr ex = exprFact.createExpr("3+8/4/2-8/4");
		double x = ex.getValue();
		if(x != 2.0)
			fail("Testcase " + counter + " of BasicOperations failed for expression 3+8/4/2-8/4 with exit value: " + x);
	}
	@Test
	public void test3() {
		Expr ex = exprFact.createExpr("5*8-8-8*7+3/0.5");
		double x = ex.getValue();
		if(x !=-18 )
			fail("Testcase " + counter + " of BasicOperations failed for expression 5*8-8-8*7+3/0.5 with exit value: " + x);
	}
	@Test
	public void test4() {
		Expr ex = exprFact.createExpr("2/4*8+9-8-1+8/4");
		double x = ex.getValue();
		if(x != 6)
			fail("Testcase " + counter + " of BasicOperations failed for expression 2/4*8+9-8-1+8/4 with exit value: " + x);
	}

}
