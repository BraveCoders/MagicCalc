package com.magiccalc.core;

public class ConstExpr extends Expr {
	double x;
	String s;
	public ConstExpr(String x){
		try{
		this.x=Double.parseDouble(x);
		}catch(Exception e){
		this.s=x;
		}
	}
	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return x;
	}
	@Override
	public double getValueFor(double y) {
		// TODO Auto-generated method stub
		return x;
	}
}
