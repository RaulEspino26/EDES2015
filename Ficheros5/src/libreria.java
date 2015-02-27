/*

una libreria precisa un programa informático para anotar las ventas realizadas y las ganancias obtenidas
de cada libro maneja la siguiente información:
 -código
 -titulo
 -autor
 -precio
la libreria pretende utilizar un fichero .txt como modo de almacenamineto permanente com omodo de tratar dicho
fichero, realizar el programa con las características dichas anteriormente que permita al librero generar el 
fichero de texto en el que vaya incluyendo todas las ventas y además tenga una opción en la que calcular el 
importe total recaudado en ese momento
Será necesario la implementación de una clase libro con las propiedades y métodos que correspondan.

*/
import java.io.*;
public class libreria {

	BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
		private int codigo;
		private String titulo;
		private String autor;
		private double precio;
		
		public void pedirdatos() throws NumberFormatException, IOException{
			do{
				System.out.println("Introduzca el código del libro");
				codigo=Integer.parseInt(leer.readLine());
			}while(codigo<0);
			
			do{
				System.out.println("Introduzca el titulo del libro");
				titulo=leer.readLine();
			}while(titulo.length()==0);
			
			do{
				System.out.println("Introduzca el autor del libro");
				autor=leer.readLine();
			}while(autor.length()==0);
			
			do{
				System.out.println("Introduzca el precio del libro");
				precio=Double.parseDouble(leer.readLine());
			}while(precio<0.0);
		}
		
		public void rellenar() throws IOException{
			FileWriter fw=new FileWriter("libreria.txt",true);
			PrintWriter pw=new PrintWriter(fw);
			pw.println("codigo: "+codigo);
			pw.println("titulo: "+titulo);
			pw.println("autor: "+autor);
			pw.println("precio: "+precio);
			fw.close();
			pw.close();
		}
		//Método para calcular el precio final de las ventas del señor
		public void Pfinal() throws IOException{
			double t = 0;
			File f=new File("libreria.txt");
			
			
				FileReader fr=new FileReader("libreria.txt");
				BufferedReader br=new BufferedReader(fr);
				while(br.readLine()!=null){
					for(int i=0;i<2;i++){
						br.readLine();
					}
				
					String cad;
					cad=br.readLine();
					cad=cad.substring(8);
					System.out.println(cad);
					double p2=Double.parseDouble(cad);
					t=t+p2;	
						
				}
				
						
					fr.close();
					br.close();
					System.out.println("Las ventas totales son: "+t);
			}
			
			
			
			
			
			
		

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
}
