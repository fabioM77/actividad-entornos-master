
import java.util.*;
public class programa {
//quiero probar si puedo hacer modificaciones en proyectos en los cuales soy colaboradora, 
	//rellenar matriz y mostrarlo.
	public static void main(String[] args) {
		
		Scanner nc = new Scanner(System.in);
	
		int [] [] matriz = new int [2] [2];
		
		//rellenamos la matriz.
		
		for (int i=0; i<matriz.length;i++ ){
			
			for(int j=0; j<matriz[0].length; j++){
			
				System.out.print("dame la posicion matriz["+i+"]["+j+"]:");
				matriz[i][j]= nc.nextInt();
			}
		}
		
		//mostrmaos las posiciones de la matriz.
		for (int i=0; i<matriz.length;i++ ){
			
			for(int j=0; j<matriz[0].length; j++){
				
				System.out.println("en la posicion matriz["+i+"]["+j+"] hay un:" +matriz[i][j]);	
			}
		}
			

	}

}
