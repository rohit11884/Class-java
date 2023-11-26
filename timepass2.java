public class timepass2 {
    // Q.1

//    public void display(int a,int b){
//     int c=a+b;
//     System.out.println(c);

//    } 
//    public static void main(String[] args) {
//     timepass2 ref=new timepass2();
//     ref.display(2,4);
//    }

    // Q.2

    // public void display(int n){
    //     int fact=1;
    //     for(int i=1;i<=n;i++)
    // {
    //     fact=fact*i;
    // }
    // System.out.println(fact);

    // }
    // public static void main(String[] args) {
    //     timepass2 ref=new timepass2();
    //     ref.display(5);
    // }

    // Q.3

    public void display(){
        System.out.println("fu");
    }
    public void display(int a){
        int b=a*5;
        System.out.println("kam"+b);
    }
    public static void main(String[] args) {
        timepass2 ref =new timepass2();
        ref.display();
        ref.display(5);
    }

}
