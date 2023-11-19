// найти среднее арифметическое положительных элементов параллели
// главной диагонали, расположенной выше над диагональю

public class Z24 {
	public static void main(String[] args) {
		int n = 9,  x = 0;
		double arith;
		double sum = 0;
		int [][] array = new int [n][n];
		for (int i = 0; i < array.length; i++) {  
            for (int j = 0; j < array.length; j++) {
            	array[i][j] = ((int)(Math.random() * (20) - 10));
            	System.out.print("[" + array[i][j] + "]");
            	if (array[i][j] > 0 && i < j) {
            		x = x + 1;
            		sum = sum + array[i][j];
            	}
            }
            System.out.println();
		}
		arith = sum/x;
		System.out.print("Среднее арифметическое: " + arith);
	}
}	
