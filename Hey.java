 class A {
     protected int data = 49;
   protected  void msg(){
       
        System.out.println("welcome to ths class ");
    }
}
class Hey{
    public static void main(String[] args) {
        A obj= new A();
        System.out.println(obj.data);
        obj.msg();
    }
}