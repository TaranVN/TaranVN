public class Z3 {
	public static void main(String N[])
	{
		if(N.length==2) {
			int x = Integer.parseInt(N[0]);
			int y = Integer.parseInt(N[1]);
			System.out.println(N[0]+" + "+N[1]+" = "+(x+y));
		}
		else {
			System.out.println("Неверное количество параметров");
		}
	}
}

