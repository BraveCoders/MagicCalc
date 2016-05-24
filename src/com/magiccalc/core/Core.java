package com.magiccalc.core;

import com.magiccalc.expr.Expr;

public class Core {
	
	private Expr expr;
	
	public double getValue(){
		return expr.getValue();
	}
	
	public void compile(String s){
		expr = null;
	}
	
}
