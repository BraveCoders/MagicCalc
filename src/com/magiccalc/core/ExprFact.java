package com.magiccalc.core;

import java.util.ArrayList;
import java.util.List;

public class ExprFact {
	static List<Expr> list = new ArrayList<Expr>();
	public Expr createExpr(String value){
		if (value.indexOf('(')>-1) {
			 return createExpr(getValuePar(value));
		}else if(value.indexOf("+")>0){
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
		} else if (value.equals("expr[0..9]*")){
			return list.get(0);
		} else return new ConstExpr(value);

	}
	
	public String getValuePar(String bracket) {
		
		int count = 1;
		int start = bracket.indexOf('(');
		int end = start + 1;
		while (count > 0)
		{
			if (bracket.charAt(end) == '(') {
				count += 1;

			} else if (bracket.charAt(end) == ')') {
				count -= 1;
			}
			end++;
		}
		
		list.add(createExpr(bracket.substring(start+1, end-1)));
		return bracket.substring(0, start) + "expr" + (list.size()-1) + bracket.substring(end, bracket.length());
}
}
