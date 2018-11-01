package week7.task1;

public class MultiPlication extends BinaryExpression {
    private Expression left;
    private Expression right;
    public MultiPlication(Expression a,Expression b){
        left=a;
        right=b;
    }
    public String toString(){
        return "";
    }
    public int evaluate(){
        return left.evaluate()*right.evaluate();
    }
    public Expression left(){
        return left;
    }
    public Expression right(){
        return right;
    }
}
