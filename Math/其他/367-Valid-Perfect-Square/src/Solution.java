/**
 * @author Dell
 * @create 2019-06-05 20:21
 */
//平方序列：1,4,9,16,..
//间隔：3,5,7,...
//间隔为等差数列，使用这个特性可以得到从 1 开始的平方序列。
public class Solution {
    public boolean isPerfectSquare(int num) {
        int subNum = 1;
        while (num > 0) {
            num -= subNum;
            subNum += 2;
        }
        return num == 0;
    }
}
