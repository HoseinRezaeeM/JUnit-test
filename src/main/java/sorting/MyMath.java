package sorting;


public class MyMath {

    private static final MyMath instance = new MyMath();

    public int division(int a ,int b) {
        if (b == 0)
            throw new RuntimeException(" by zero");
        return a / b;
    }
    public int multiply(int a , int b){
        return a*b;
    }
}

