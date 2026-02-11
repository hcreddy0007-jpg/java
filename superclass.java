class A {
    int i,j;
    void showij(){
        System.out.println("i and  j :"+i+" "+j);
    }
}

class B extends A {
    int k;
    void showk(){
        System.out.println("k: " +k);
    }
    void sum(){
        System.out.print("i+j+k: "+(i+j+k));
    }
}

class superclass{
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Content of superob: ");
        superOb.showij();
        System.err.println();

        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        System.err.println("Contents of subob");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.printf("Sum :");
        subOb.sum();
    
    }
}