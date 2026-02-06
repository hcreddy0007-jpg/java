class circledemo1{
    public static void main(String[] args) {
        circle c = new circle();
        circle c2 = new circle();
        c.x = 0.0;
        c.y = 0.0;
        c.r = 5.0;
        c2.x = 0.0;
        c2.y = 0.0;
        c2.r = 10.0;
        
        System.out.println("Circumference: "+c.circumference());
        System.out.println("area : "+ c.area());
        System.out.println("Circumference: "+c2.circumference());
        System.out.println("area: "+ c2.area());
    }
}