public class timepass {
    int i;
    int j;
    
        // Q. what is the use of methods?
        // Ans- To reuse the code.

    static void display1() {
        System.out.println("fu");
    }

    void display2() {
        System.out.println("fu2");
    }

    void display2(int k) {
        System.out.println(k);
    }

    public void max(int a, int b) {
        if (a > b) {
            System.out.println("a is max");
        } else {
            System.out.println("b is max");
        }
    }

    public static void main(String[] arg) {
        timepass ref = new timepass();
        ref.i = 1;
        ref.j = 3;
        System.out.println(ref.i + ref.j);
        System.out.println(ref.i * ref.j);
        display1();
        ref.display2();
        ref.display2(5);
        ref.max(2, 4);

        
    }
}
