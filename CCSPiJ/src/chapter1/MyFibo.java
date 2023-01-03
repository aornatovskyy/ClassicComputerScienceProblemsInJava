package chapter1;
/*
    input is: 4
    stream 0, 1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15,16

   0: 0 + 0 = 0
   1: 1 + 0 = 1
   2: 0 + 1 = 1
   3: 1 + 1 = 2
   4: 1 + 2 = (3) < ---- expected
   5: 2 + 3 = 5
   6: 3 + 5 = 8
 */

public class MyFibo {
    public static void main(String[] args) {
        System.out.println(new MyFibo().fibo(4)+ " is 3");
        System.out.println(new MyFibo().fibo(6) + " is 8");
    }

    public int fibo(int n) {
        int current = 0, next = 1;

        for (int i = 0; i < n; i++) {
            int temp = current;
            current = next;
            next = temp + next;
        }
        return current;
    }
}
