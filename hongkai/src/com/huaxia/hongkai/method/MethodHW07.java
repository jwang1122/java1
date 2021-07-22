package com.huaxia.hongkai.method;

/**
 * * Write a Java method to display the first 50 pentagonal numbers. A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon, but, unlike the first two, the patterns involved in the construction of pentagonal numbers are not rotationally symmetrical.

![Pentagonal Number Definition](java-method-image-exercise-7.png)

$$ pentagonal(i) = \frac 1 2 i \cdot (3 \cdot i - 1)$$
Expected Output:

```
1     5     12    22    35    51    70    92    117   145
176   210   247   287   330   376   425   477   532   590
651   715   782   852   925   1001  1080  1162  1247  1335
1426  1520  1617  1717  1820  1926  2035  2147  2262  2380
2501  2625  2752  2882  3015  3151  3290  3432  3577  3725 
```
 * @author Hongkai Z
 *
 */

public class MethodHW07 {
	
	private static double findPentagonalNum(int num) {
		return 0.5 * num * (3 * num - 1);
	}
	
	private static void writeBlank(int subtract) {
		int maxBlank = 6;
		for (int j = maxBlank; j > subtract; j--) {
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		int written = 0;
		for (int i = 0; i < 50; i++) {
			double write = findPentagonalNum(i+1);
			String writeStr = String.format("%.0f", write);
			System.out.print(writeStr);
			writeBlank(writeStr.length());
			written++;
			if (written > 9) {
				System.out.println();
				written = 0;
			}
		}
	}

}
