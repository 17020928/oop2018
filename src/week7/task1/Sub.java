package week7.task1;

public class Sub extends BinaryExpression {
    private Expression left;
    private Expression right;
    public Sub(Expression a,Expression b){
        left=a;
        right=b;
    }
    public String toString(){
        return "";
    }
    public int evaluate(){
        return left.evaluate()-right.evaluate();
    }
    public Expression left(){
        return left;
    }
    public Expression right(){
        return right;
    }
}
