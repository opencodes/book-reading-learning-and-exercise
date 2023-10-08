package com.rkjha.designpattern.behavioral.interpreter;

import java.util.Map;

public class ExpressionContext {
    private Map<String, Boolean> variables;

    public ExpressionContext(Map<String, Boolean> variables) {
        this.variables = variables;
    }

    public boolean evaluate(Expression expression) {
        return expression.interpret(variables);
    }
}
