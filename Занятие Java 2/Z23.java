// заполнить матрицу случайными элементами и найти среднее 
// геометрическое положительных элементов в каждом столбце матрицы

import java.util.Vector;
public class Z23 {
	public static void main(String[] args) {
		int [][] matrix = new int [9][9];
		for (int i = 0; i < matrix.length; i++) {  
            for (int j = 0; j < matrix.length; j++) {
            	matrix[i][j] = ((int)Math.round(Math.random()*(20)  -10));
            	System.out.print("[" + matrix[i][j] + "]");      		
            }
            System.out.println();
		}
		Vector B = new Vector(); 
		int n = 0;
		int g = 1;
		double x;
		for (int j = 0; j < matrix.length; j++) {
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][j] >= 1 ) {
					n = n + 1;
					g = g * matrix[i][j];
				}
			}
			x = Math.pow(g, 1.0/n);
			B.add(x);
			n = 0;
			g = 1;
		}
		System.out.println();
		System.out.print(B + " ");
	}
}
