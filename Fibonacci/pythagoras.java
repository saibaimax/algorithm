//ピタゴラスの定理
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        for (int i = 1; i <= number; i++) {
            System.out.println(i + ": " + pythagorean(3, i));
        }
    }
    public static double pythagorean(int a, int b) {
        // sqrt(a^2 + b^2)
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}