import java.util.Scanner;

public class ejemploExamen{
	public static void main(String[] args) {
		//Realizar un array bidimensional irregular en el que cada fila contiene los números menores o iguales que el numero de fila
		int filas;
		Scanner sc = new Scanner(System.in);
		//Pedimos el numero de filas y reservamos
		System.out.println("Introduzca el numero de filas: ");
		filas = sc.nextInt();

		int matriz [][] = new int[filas][];
		//Ahora le reservamos espacio
		for(int i=0; i<matriz.length; i++){
			matriz [i] = new int[i+1];//matriz [i] son las filas, en new int[i+1] reservamos el numero de columnas (antes del = las filas, después las columnas)
		}
		//Ahora rellenamos el array
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[i].length; j++){
				matriz[i][j] = matriz[i].length-j-1;
			}
		}
		//Ahora lo mostramos por pantalla
		for(int i=0; i<matriz.length;i++){
			for(int j=0; j<matriz[i].length; j++){
				System.out.print(matriz[i][j]+" ");
			}
		System.out.println();
		}
	}
}