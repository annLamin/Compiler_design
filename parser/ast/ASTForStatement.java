package utg.mcc.parser.ast;

import utg.mcc.parser.util.ASTIdentityTransformation;

public class ASTForStatement extends ASTStatement {

	public final ASTExprStatement initialization, update;
	public final ASTExpression expression;
	public final ASTNode statement;

	public ASTForStatement(ASTExprStatement initialization, ASTExpression expression, ASTExprStatement update,
			ASTNode statement) {
		super();
		this.initialization = initialization;
		this.expression = expression;
		this.update = update;
		this.statement = statement;
	}

	@Override
	public String toString() {
		return "" + (new ASTIdentityTransformation()).visitForStatement(this, "");
	}

	@Override
	public Object accept(ASTVisitor visitor, Object o) {
		return visitor.visitForStatement(this, o);
	}
}