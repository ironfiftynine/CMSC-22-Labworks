import java.util.Scanner;

public class ThreadTest {

    public static void main(String[] args) {
        long start, end, time;
        long start2, end2, time2;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Table Size:");
        int x = in.nextInt(); 
        
        start = System.currentTimeMillis();
        Thread30 test1 = new Thread30(x);
        test1.print();
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("THREADED: " + time);

        
        
        start2 = System.currentTimeMillis();
        MP1 test2 = new MP1(x);
        test2.print();
        end2 = System.currentTimeMillis();
        time2 = end2 - start2;
        System.out.println("NON-THREADED: " + time2);
    }
}