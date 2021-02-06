//50までのトリボナッチ数を求める
/*
T(0) = 0
T(1) = 0
T(2) = 1
T(n) = T(n - 1) + T(n - 2) + T(n - 3)

たとえば、4番目のトリボッチ数は、次のように計算します。

T(4) = T(3) + T(2) + T(1) = 1 + 1 + 0 = 2
*/

//トリボナッチ数
// 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 50;
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ": " + tribonacci(i));
        }
    }
    // 指定番目のトリボナッチ数を求める
    public static long tribonacci(int num) {
        if (num == 0) { // numが0ならば0を返す
            return 0;
        }
        if (num == 1) { // numが1ならば0を返す
            return 0;
        }
        if (num == 2) { // numが2ならば1を返す
            return 1;
        }
        
        long tri = 0; // 答えを保存する変数
        long tri_0 = 0; // 三つ前のトリボナッチ数を保存する変数
        long tri_1 = 0; // 二つ前のトリボナッチ数を保存する変数
        long tri_2 = 1; // 一つ前のトリボナッチ数を保存する変数
        
        for (int i = 3; i <= num; i++) {
            tri = tri_0 + tri_1 + tri_2; // i番目のトリボナッチ数を計算する
            tri_0 = tri_1;
            tri_1 = tri_2;
            tri_2 = tri;
        }
        return tri;
    }
}







