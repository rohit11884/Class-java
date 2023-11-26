import java.util.Scanner;
public class timepass3 {
    public static int method1(int n){
        // for(int i=0;i<5;i++){
        //     System.out.println(i);
        // }
        // System.out.println("Hello");
        
            if(n==1)
            return 1;
            else{
                int fact=n*method1(n-1);
                return fact;

            }
                
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        int fact1=method1(n);
        System.out.println(fact1);
    }
}
