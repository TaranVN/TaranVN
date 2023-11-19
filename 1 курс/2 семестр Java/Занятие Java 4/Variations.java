import java.util.ArrayList;
public class Variations {
	private ArrayList<Car> m;
	
	public Variations() {
		m = new ArrayList<Car>();
	}
	
	public void Add(Car auto) {
		m.add(auto);
	}
	
	public String toString() {
		String str = "";
		for (int i=0; i<m.size(); i++) {
			str+=m.get(i);
			str+="\n\n";
		}
		return str;
	}

}