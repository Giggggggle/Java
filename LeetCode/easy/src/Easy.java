import java.awt.image.BandCombineOp;

public class Easy {
    public static void main(String[] args) {
        long a =11241;
        int result = reverse((int)a);
        boolean isreverse = isPalindrome((int)a);
        System.out.println(result);
        System.out.println(isreverse);
    }

    /*反转整数: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
    * 输入: 123 -123 120
    * 输出: 321 -321 21
    * 注意：假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。
    *       请根据这个假设，如果反转后整数溢出那么就返回 0。
    * 算法：将数反转之后判断是否溢出
    * 时间复杂度：O(lg(x))，x中大约有lg(x)位数字。
    * 空间复杂度：O(1)
    * */
    public static int reverse(int x) {
        long answer = 0;    //若溢出则int存不下
        while(x != 0) {
            answer = answer * 10 + x % 10;
            x = x / 10;
        }
        //判断结果是否溢出
        if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE)
            return 0;
        return (int)answer;
        //如果溢出则(int)answer != answer;
        //return (int)answer == answer ? (int)answer : 0;
    }

    /*回文数：判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    * 输入: 121 -121 10
    * 输出: true false false
    * 进阶：你能不将整数转为字符串来解决这个问题吗？
    * 算法：将整数后半段反转后与前半部分比较
    * 时间复杂度：O(lg(x)),对于每次迭代，我们会将输入除以10
    * 空间复杂度：O(1)
    * */
    public static boolean isPalindrome(int x) {
        //如果整数是负数或者非0最后一位为0，则该整数不可能是回文数
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int revervedNum = 0;
        while (x > revervedNum) {
            revervedNum = revervedNum * 10 + x % 10;
            x = x / 10;
        }
        //奇数则recveredNum会比x多一位，通过/10就可以去除
        return x == revervedNum || x == revervedNum / 10;
    }

    /*最长公共前缀：编写一个函数来查找字符串数组中的最长公共前缀。
    * 如果不存在公共前缀，返回空字符串 ""。
    * 输入：["flower","flow","flight"] ["dog","racecar","car"]
    * 输出："fl" ""
     * 说明：所有输入只包含小写字母 a-z
    * */
    public static String longestCommonPrefix(String[] strs) {
        String commonStr = "";

        return commonStr;
    }

}