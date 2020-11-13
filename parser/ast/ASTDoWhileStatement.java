package utg.mcc.parser.ast;

import utg.mcc.parser.util.ASTIdentityTransformation;

public class ASTDoWhileStatement extends ASTStatement {
public final ASTExpression expression;
public final ASTNode statement;
public ASTDoWhileStatement(ASTExpression expression, ASTNode statement)
 {
	super();
this.expression = expression;
this.statement = statement;
}
public String toString() {
	return ""
	        + (new ASTIdentityTransformation()).visitDoWhileStatement(this,
	            "");
}
@Override
public Object accept(ASTVisitor visitor, Object o) {
return visitor.visitDoWhileStatement(this, o);
}
}
