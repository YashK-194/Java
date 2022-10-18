import java.util.ArrayList;
import java.util.List;

public class InterfaceList {

	public static void main(String[] args) {
		
		List<String> orders = new ArrayList<String>();
		orders.add("Apple");
		orders.add("Grapes");
		orders.add("Mango");
		orders.add("Banana");
		orders.add("Cherry");
		orders.add("Strawberries");
		
		System.out.println(orders);
		System.out.println(orders.size());
				
		for(String order : orders) {
			System.out.println(order);
		}

	}

}
