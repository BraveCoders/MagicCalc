package com.magiccalc.core;

public class ExprFact {

	public Expr createExpr(String value){
		if(value.indexOf("+")>0){
			return new AddExpr(createExpr(value.substring(0,value.indexOf("+"))), createExpr(value.substring(value.indexOf("+")+1,value.length())));
		} else if(value.indexOf("-")>0){
			return new SubExpr(createExpr(value.substring(0,value.lastIndexOf("-"))), createExpr(value.substring(value.lastIndexOf("-")+1,value.length())));
		} else if(value.indexOf("*")>0){
			return new MulExpr(createExpr(value.substring(0,value.indexOf("*"))), createExpr(value.substring(value.indexOf("*")+1,value.length())));
		} else if(value.indexOf("/")>0){
			return new DivExpr(createExpr(value.substring(0,value.lastIndexOf("/"))), createExpr(value.substring(value.lastIndexOf("/")+1,value.length())));
		} else if(value.indexOf("^")>0){
			return new PowExpr(createExpr(value.substring(0,value.lastIndexOf("^"))), createExpr(value.substring(value.lastIndexOf("^")+1,value.length())));
		} else if (value.equals("x")){
			return new xExpr();
		} else return new ConstExpr(value);
	
		
	}
	
	
}
