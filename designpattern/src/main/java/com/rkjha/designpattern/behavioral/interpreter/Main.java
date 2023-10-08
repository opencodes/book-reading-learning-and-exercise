package com.rkjha.designpattern.behavioral.interpreter;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Define variables and their values
        Map<String, Boolean> contextVariables = Map.of("x", true, "y", false);

        // Create expressions
        Expression xExpression = new VariableExpression("x");
        Expression yExpression = new VariableExpression("y");
        Expression orExpression = new OrExpression(xExpression, yExpression);
        Expression andExpression = new AndExpression(xExpression, yExpression);

        // Create a context and evaluate expressions
        ExpressionContext context = new ExpressionContext(contextVariables);
        boolean resultOr = context.evaluate(orExpression);    // (x || y) = true || false = true
        boolean resultAnd = context.evaluate(andExpression);  // (x && y) = true && false = false

        System.out.println("Result of (x || y): " + resultOr);
        System.out.println("Result of (x && y): " + resultAnd);
    }
}
