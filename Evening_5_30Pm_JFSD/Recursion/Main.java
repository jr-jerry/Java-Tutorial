public class Main {
    public static void f(int n) {
        System.out.println("F(" + n + ")'s Stack Frame Pushed");
        if (n > 1) {
            f(n - 1);
            f(n - 1);
        }
        System.out.println("F(" + n + ")'s Stack Frame Removed");
    }

    public static void main(String[] args) {
        f(3);
    }
}