/**
 * @author Dell
 * @create 2019-06-02 15:02
 */
//埃拉托斯特尼筛法在每次找到一个素数时，将能被素数整除的数排除掉
public class Solution {
    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrimes[i])
                continue;
            count++;
            //从i * i开始，因为如果k < i，那么k * i在之前就已经被去除过了
            for (long j = (long) (i) * i; j < n; j += i)
                notPrimes[(int) j] = true;
        }
        return count;
    }
}
