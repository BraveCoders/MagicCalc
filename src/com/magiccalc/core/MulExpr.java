package com.magiccalc.core;

public class MulExpr extends Expr{
	Expr x;
	Expr y;
	public MulExpr(Expr x,Expr y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
	public double getValue(){
		return (this.x.getValue()*this.y.getValue());
	}
}
