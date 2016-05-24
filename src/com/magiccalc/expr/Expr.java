package com.magiccalc.expr;

import java.util.Map;

public interface Expr {
	abstract double getValue();
	abstract double getValueFor(Map<String, Double> variables);
}
