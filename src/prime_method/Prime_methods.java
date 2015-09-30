package prime_method;
public class Prime_methods {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++){
                if(isEven(i)) {
                    System.out.println(i + " is even");
                }
                if(isOdd(i))
                    System.out.println(i + " is odd");{
              }
                if(isPrime(i))
                    System.out.println(i + " is prime");{
        }
        }
}  
    /*
    A method is like a little program
    It can receive and return values to other methods
    */ 
    static boolean isEven(int x){
        return ( x % 2 == 0);
    }
   static boolean isOdd(int y){
       return ( y % 2 != 0) ;
    }
   static boolean isPrime(int a){
       int divisor = 0;
       for(int i = 2; i < a; i++){
       
       }
       return(a == 0);
   }
}