package TEST;

/**
 * 素数：可以被1和自己整除的数。
 * https://zhidao.baidu.com/question/83344542.html
 * @author jiche
 *
 */
public class Sushu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
        for (int i = 2; i <= 100; i++) // 1不是素数，所以直接从2开始循环
        {
            j = 2;
            while (i % j != 0 && i % 1 == 0) {
                j++; // 测试2至i的数字是否能被i整除，如不能就自加
            }
            if (j == i) // 当有被整除的数字时，判断它是不是自身
            {
                System.out.println(i); // 如果是就打印出数字
            }
        }
    }
}
