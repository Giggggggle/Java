import java.awt.image.BandCombineOp;

public class Easy {
    public static void main(String[] args) {
        long a = 1534236449;
        int result = reverse((int)a);
        System.out.println(result);
    }

    /*反转整数: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
    * 注意：假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。
    *       请根据这个假设，如果反转后整数溢出那么就返回 0。
    * */
    public static int reverse(int x) {
        long answer = 0;
        while(x != 0) {
            answer = answer * 10 + x % 10;
            x = x / 10;
        }
        if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE)
            return 0;//判断结果是否溢出
        return (int)answer;
    }


}
