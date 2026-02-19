import java.lang.*;

class Calculator{
    double i;
    double x;
    void p(){
        x = Math.sqrt(i);
    }
}

class package1{
    public static void main(String[] args) {
        Calculator a = new Calculator();
        a.i =20.0;
        a.p();
        System.err.println("SQUARE ROOT OF "+a.i+"is "+a.x);
    }
    }