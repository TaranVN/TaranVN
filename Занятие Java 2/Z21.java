// определить, сколько раз в этом массиве меняется знак

public class Z21 {
	public static void main(String name[]) {
		int array[] = new int[31];
		for (int i = 0; i < 31; i++)
		 {
		array[i] = -100 + (int)Math.round(Math.random()*
		(100 - -100));
	     }
		for (int i = 0; i < 31; i++) {
			System.out.print(i + " - й элемент массива = " + array[i] + "\n"); }
		int count = 0;
		for (int i = 1; i < 30; i++) {
			if((array[i] < 0 && array[i + 1] >= 0) || (array[i] >= 0 && array[i + 1] < 0)) {
				count++; 
			}
		}
		System.out.print("Знак элементов меняется " + count + " раз"); 
	}
}
