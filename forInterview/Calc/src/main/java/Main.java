

public class Main {
    public static void main(String[] args) {
        String exp = "5*0.1+10*25.5 - 70 / 3.5";
        exp = exp.replaceAll("\\s+","");
        System.out.println(Calculator.expressionToRPN(exp));
        System.out.println(Calculator.rPNtoAnswer(Calculator.expressionToRPN(exp)));
    }
}

