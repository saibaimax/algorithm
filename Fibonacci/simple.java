// Nが、0から10まで増える時、Nの階乗を計算する。
// 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ": " + permutation(i));
        }
    }

    public static int permutation(int num) {
        int perm = 1;
        for (int i = 1 ; i <= num; i++) {
            perm = perm * i; // permをi倍する
        }
        return perm;
    }
}



