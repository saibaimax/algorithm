//巡回セールスマン問題
/*
n　（n 訪問点数）
x_1 y_1　（x_1 は 訪問点の x 座標、 y_1 訪問点の y 座標）
x_2 y_2　（x_2 は 訪問点の x 座標、 y_2 訪問点の y 座標）
・・・
x_n y_n　（x_n は 訪問点の x 座標、 y_ 訪問点の y 座標）
*/


import java.util.*;
import java.awt.Point;

class Main {
    // 2点間の距離
    static double distancePoint(Point p, Point q) {
        // return Math.sqrt((p.x-q.x)*(p.x-q.x)+(p.y-q.y)*(p.y-q.y));
        return p.distance(q);
    }
    // 経路の表示
    static void info(int n, List<Point> route) {
        for (int i=0; i<n; i++) {
            System.out.println(route.get(i).x + " " + route.get(i).y);
        }
    }
    // pointsを並べ替えた経路
    static List<Point> tsp(int n, List<Point> points) {
        List<Point> resultRoute = new ArrayList<>(); // 結果を保存
        List<Point> openPoints = new ArrayList<>(points); // 未訪問の点の一覧
        resultRoute.add(openPoints.remove(0));
        while (!openPoints.isEmpty()) {
            // a: 今いる点, b: 移動候補の点
            Point a = resultRoute.get(resultRoute.size()-1);
            Point b = null;
            // 全ての未訪問の点について、aとの距離を調べ、最も距離の短い点をbとする
            for (Point p : openPoints) {
                if (b == null || distancePoint(a, p) < distancePoint(a, b)) {
                    b = p;
                }
            }
            resultRoute.add(b);
            openPoints.remove(b);
        }
        return resultRoute;
    }
    public static void main(String[] args) {
        // 入力処理
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0)); // 最初の点として(0, 0)を追加
        for (int i=0; i<n; i++) {
            Point p = new Point(scanner.nextInt(), scanner.nextInt());
            points.add(p);
        }

        // 座標を並べ替えた経路を作る
        List<Point> resultRoute = tsp(n+1, points);

        // 経路を表示する
        info(n+1, resultRoute);
    }
}