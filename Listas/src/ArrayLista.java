import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLista {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Verde");
		colors.add("Amarillo");
	
		for(String elemento : colors) {
			System.out.print(elemento+", ");
		}
		System.out.println("tamaño del arraylist: "+colors.size());
		
		LinkedList<String> colors2 = new LinkedList<>();
		
		colors2.add("Fosforito");
		colors2.add("brilli brilli");
		colors2.add("Rosa");
		
		for(String elemento2 : colors2) {
			System.out.print(elemento2+", ");
		}
		System.out.println();
		System.out.println("Tamaño del LinkedList: "+colors2.size());
		
		String[] colors3 = new String[10];
		
		colors3[0] = "Rojo PSOE";
		colors3[1] = "Verde esperanza";
		
		for(String element : colors3) {
			System.out.print(element+", ");

		}
		System.out.println();
		System.out.println("Tamañao del array: "+colors3.length);
	
	
	}
	

}
