import org.antlr.v4.runtime.tree.TerminalNode;

public class MethodListener extends Java8BaseListener {

    @Override
    public void enterMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
        TerminalNode node = ctx.methodHeader().methodDeclarator().Identifier();
        String methodName = node.getText();

        if (Character.isUpperCase(methodName.charAt(0))) {
            System.out.println("Method is UPPERCASE");
        }
        super.enterMethodDeclaration(ctx);
    }
}
