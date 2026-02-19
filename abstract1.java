abstract class base{
    abstract void fun();
}
class Derived extends base{
    void fun(){
        System.out.println("Derived fun() is called ");
    }
}


@SuppressWarnings("unused")
class abstract1 {
    public static void main(String[] args) {
        base b = new Derived();
        b.fun();
    }
}