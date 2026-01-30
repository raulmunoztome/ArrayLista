import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLista {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Verde");
		colors.add("Amarillo");
		colors.add("Negro");
		//borramos por indice y por valor
		colors.remove(colors.get(colors.size()-1));
		colors.remove("Amarillo");
	
		for(String elemento : colors) {
			System.out.print(elemento+", ");
		}
		System.out.println("tamaño del arraylist: "+colors.size());
		
		LinkedList<String> colors2 = new LinkedList<>();
		
		colors2.add("Fosforito");
		colors2.add("brilli brilli");
		colors2.add("Rosa");
		//Borro por posicion
		colors2.remove(colors2.size()-1);
		//Borro por valor:
		colors2.remove("Fosforito");
		
		for(String elemento2 : colors2) {
			System.out.print(elemento2+", ");
		}
		System.out.println();
		System.out.println("Tamaño del LinkedList: "+colors2.size());
		
		String[] colors3 = new String[10];
		
		int pos = 0;
		
		colors3[pos] = "Rojo PSOE";
		++pos;
		colors3[pos] = "Verde esperanza";
		
		for(String element : colors3) {
			if(element != null) System.out.print(element+", ");

		}
		System.out.println();
		System.out.println("Tamañao del array: "+colors3.length);
		//
	
	}
	

}
