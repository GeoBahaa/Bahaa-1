import java.util.ArrayList;


public class PointOfSale {

private int x = 5;	
	
ArrayList <Integer> intList = new ArrayList <Integer> ();

	public PointOfSale () {
		intList.add(5);
		intList.add(9);
		intList.add(11);
		intList.add(38);
		intList.add(24);
		
		for (int i=0; i<intList.size(); i++) {
			System.out.println(intList.get(i));
			
		}
		
	}
	
	public int getX () {
		return x;
	}
	
	public void setX (int num, String password) {
		if (password.equals("Open")) {
			x = num;
		}
	}

}