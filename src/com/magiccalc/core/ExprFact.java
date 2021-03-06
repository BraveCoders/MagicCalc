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
		} else if (value.length()>3 && value.substring(0,4).equals("expr")){
			int index = Integer.parseInt(value.substring(4));
			return list.get(index);
		} else return new ConstExpr(value);

	}
	public String getValuePar(String bracket) {
		List<Integer> x= new ArrayList<Integer>();
		for (int index = 0; index < bracket.length(); index++)
		{
			if (bracket.charAt(index) == '(') {
				x.add(index);
				//System.out.println("Adding " + index + " to start indexes");
			} else if (bracket.charAt(index) == ')') {
				int start = x.get(x.size()-1);
				x.remove(x.size()-1);
				//System.out.println("Creating bracket from " + (start+1) + " to " + (index)+ " : " + bracket.substring(start+1, index));
				list.add(createExpr(bracket.substring(start+1, index)));
				bracket = bracket.substring(0, start) + "expr" + (list.size()-1) + bracket.substring(index+1, bracket.length());
			}
		}
		return bracket;
}
}