package com.example.expressionobjectdialect.expression;

import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.dialect.IExpressionObjectDialect;
import org.thymeleaf.expression.IExpressionObjectFactory;

public class NumberExpressionDialect extends AbstractDialect implements IExpressionObjectDialect {

	private final IExpressionObjectFactory PAPEL_EXPRESSION_OBJECTS_FACTORY = new NumberExpresseionFactory();
	
	public NumberExpressionDialect() {
		super("number");
	}

	@Override
	public IExpressionObjectFactory getExpressionObjectFactory() {
		return PAPEL_EXPRESSION_OBJECTS_FACTORY;
	}

	
	
}
