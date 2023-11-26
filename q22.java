// class p{
//     int salary=40000;
// }
// class c1 extends p{
//     int id=10;
// }


// public class q22 {
//     public static void main(String[] args) {
//         c1 ob=new c1();
//         System.out.println("salary is "+ob.salary+" and id is "+ob.id);
//     }
// }


abstract class A{
    int i;
    abstract void display();
}
class B extends A{
    int j;
    void display(){
        System.out.println("I am in B");
    }
}
public class q22{
    public static void main(String[] args) {
         B ob=new B();
         A oa=new B();
         oa.display();
    }
   

}