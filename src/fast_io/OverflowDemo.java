//溢出演示
public class OverflowDemo {
    public static void main(String[] args) {
        int b = 100000;
        System.out.println("错误(溢出): " + b * b);          // 1410065408
        System.out.println("正确(转long): " + (long) b * b); // 10000000000
        System.out.println("-7 % 3 = " + (-7 % 3));         // -1
        System.out.println("floorMod = " + Math.floorMod(-7, 3)); // 2
    }
}