package com.magiccalc.core;

public class SubExpr extends Expr{
	Expr x;
	Expr y;
	public SubExpr(Expr x,Expr y){
		this.x=x;
		this.y=y;
	}
	public double getValue(){
		return (this.x.getValue()-this.y.getValue());
	}
	@Override
	public double getValueFor(double x) {
		// TODO Auto-generated method stub
		System.out.println(this.x.getValueFor(x)-this.y.getValueFor(x));
		return (this.x.getValueFor(x)-this.y.getValueFor(x));
	}
}
