import java.util.Scanner;

class prime{
    public static void main(String args[]) {
        int num;
        Scanner s = new Scanner(System.in);
        boolean isprime = true;
        num = s.nextInt() ;
        for(int i = 2; i<num; i++){
            if((num%i)==0){
                isprime = false;
                break;
            }
        }
        if(isprime) System.out.println("prime");
        else System.out.println("not prime");
    }
}