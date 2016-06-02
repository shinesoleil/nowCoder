//对于一个矩阵，请设计一个算法，将元素按“之”字形打印。具体见样例。
//        给定一个整数矩阵mat，以及他的维数nxm，请返回一个数组，其中元素依次为打印的数字。
//        测试样例：
//        [[1,2,3],[4,5,6],[7,8,9],[10,11,12]],4,3
//        返回：[1,2,3,6,5,4,7,8,9,12,11,10]

import java.util.*;

public class ZigzagPrinter {
  public int[] printMatrix(int[][] mat, int n, int m) {
    int[] res = new int[n * m];
    int count = 0;

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < m; j++) {
          res[count] = mat[i][j];
          count++;
        }
      } else {
        for (int j = m-1; j >= 0; j--) {
          res[count] = mat[i][j];
          count++;
        }
      }
    }

    return res;
  }

  public static void main(String[] args) {
    ZigzagPrinter zigzagPrinter = new ZigzagPrinter();
  }
}
