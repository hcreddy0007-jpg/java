class Cat{
    void speak (){
        System.out.println("Meom !");
    }
} 
class PetCat extends Cat{
    void speak(){
        System.err.println("  Meom ! ");
    }
}
class MagicCat extends Cat{
    static boolean noOne;

    void speak(){
        if(noOne){
            super.speak();
        }else{
            System.err.println("Hello world");
        }
    }
}

class extendclass{
    public static void main(String[] args) {
        PetCat P1 = new PetCat();
        MagicCat P2  = new MagicCat();
        P2.noOne = true;
        P2.speak();
        P1.speak();
        P2.noOne = false;
        P2.speak();
    }
}
