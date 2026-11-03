public class SbOutput {
    public static void main(String[] args){
        String s = "hello";

        //必会API
        System.out.println(s.charAt(0));   //'h'
        System.out.println(s.length());    // 5
        System.out.println(s.substring(1));    //"ello"
        System.out.println(s.substring(1, 3));    //"el"左闭右开
        char[] arr = s.toCharArray();
        String[] parts = "a,b,c".split(",");
        System.out.println(s.equals("hello"));    //true
        System.out.println(s.indexOf('1'));    //2
        System.out.println('7' - '0');    //7
        System.out.println((char) (7 + '0'));    //'7'
        System.out.println(Character.toLowerCase('A'));
        System.out.println(java.util.Arrays.toString(" a b ".trim().split("\\s+")));

        //必默
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println("rev = " + rev);

        //验收题：统计元音
        String line = "Hello World";
        int cnt = 0;
        for (char ch : line.toCharArray()){
            char low = Character.toLowerCase(ch);
            if (low == 'a' || low =='e' || low =='i' || low =='o' || low =='u') cnt++;
        }
        System.out.println("元音个数 = " + cnt);
    }
}
