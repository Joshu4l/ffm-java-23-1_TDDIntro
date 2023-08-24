public class Fibonacci {
//fibonacci [0, 1, 1, 2, 3, 5, 8]

    public static int fibonacci(int position) {

        if (position == 1) {
            return 0;
        }

        if (position ==2) {
            return 1;
        }

        int n1 = 0;
        int n2 = 1;
        int n3 = -1;

        for (int i =3; i <= position; i++) {
            n3 = n1 + n2;

            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}
