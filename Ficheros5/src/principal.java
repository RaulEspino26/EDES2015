import java.io.*;
public class principal {
	static BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		libreria l=new libreria();
		int opc;
			do{
				do{
				System.out.println("¿Que opción quiere?\n"+
						"1- Añadir libro\n"+
						"2- Calculo del ganancias\n"+
						"3- Salir");
				opc=Integer.parseInt(leer.readLine());
				if(opc>1 && opc>3)
					System.out.println("No existe esa opción");
				}while(opc<1 || opc>3);
			switch(opc){
			case 1: l.pedirdatos();
			l.rellenar();break;
			case 2:
				l.Pfinal();break;
			case 3: 
				System.out.println("Salimos del programa. Hasta luego");break;
			}
			}while(opc!=3);

	}

}
