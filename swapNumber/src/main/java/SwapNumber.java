/**
 * Created by ScorpionOrange on 2016/10/07.
 * 两个数字交换位置，以及异或运算符的使用
 */
public class SwapNumber {
    public static void main(String[] args)
    {
        int a = 3;
        int b = 5;
        System.out.println("交换前：");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("交换后：");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("使用方法二交换后：");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
