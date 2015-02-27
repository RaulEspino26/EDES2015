import java.io.*;






public class PruebaBanco {
	public static BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
	public static int pedirnumero()throws IOException
	{  int n;
	   
		do{System.out.println("Introduzca el número de cuenta:");
		   n=Integer.parseInt(leer.readLine());}while(n<=0);
		return n;
	}
	public static double pedirsaldo(String cad)throws IOException
	{  double s;
		do{System.out.println("Introduzca "+cad+":");
		   s=Double.parseDouble(leer.readLine());}while(s<=0);
		return s;
	}
	public static int menu1()throws IOException
	{  
		int opc;
		do{System.out.println("1.- Cuenta Interés \n2.- Cuenta Recargo \n3.- Salir");
		   opc=Integer.parseInt(leer.readLine());
		  }while(opc<1 ||opc>3);
		return opc;
	}
	public static int menu2() throws NumberFormatException, IOException
	{
		int opc;
		do{System.out.println("1.- Ingreso \n 2.- Consulta de saldo \n 3.- Reintegro \n 4.-Trasferencia \n5.- Salir");
	 	   opc=Integer.parseInt(leer.readLine());
	     }while(opc<1 || opc>5);
		return opc;
	}
	public static void main(String []arg)throws IOException
	{   int n,opc,opc2;
		double s,cant;
 	    do{opc=menu1();
		   switch(opc)
		   { case 1: n=pedirnumero();
		   			 s=pedirsaldo("Saldo Inicial");
		   			 CuentaInteres c1 =new CuentaInteres(n,s);
		   			 do{opc2=menu2();
		   			    switch(opc2)
		   			    { case 1: 
		   			              c1.ingresar(pedirsaldo("Cantidad a Ingresar:"));
		   			              break;
		   			      case 2: System.out.println("El saldo de su cuenta es: "+c1.versaldo());
		   			              break;
		   			      case 3:c1.retirar(pedirsaldo("Cantidad a retirar:"));
		   			             break;
		   			      case 4: System.out.println("Introduzca los datos de la cuenta banacaria a la que transferir el dinero:"); 
		   			             n=pedirnumero();
			   			         s=pedirsaldo("Saldo Inicial");     
		   			             CuentaBancaria c=new CuentaBancaria(n,s);
		   			             cant=pedirsaldo("Cantidad a trasferir:");
		   			    	     c1.transferencia(cant, c);
		   			    	     System.out.println("El saldo de la cuenta a la que se ha trasferido el dienro es:"+c.versaldo());
		   			    	     break;
		   			    }          
		   			 }while (opc2!=5);
		   			 break;
		   case 2:	n=pedirnumero();
 			        s=pedirsaldo("Saldo Inicial");
 			        CuentaRecargo c2=new CuentaRecargo(n,s);
 			        do{opc2=menu2();
 			           switch(opc2)
 			           { case 1: c2.ingresar(pedirsaldo("Cantidad a Ingresar:"));
			                     break;
 			             case 2: System.out.println("El saldo de su cuenta es: "+c2.versaldo());
 			                     break;
 			             case 3: if(c2.retirar(pedirsaldo("Cantidad a Retirar:"))==true)
		                    	        System.out.println("Reintegro realizado");
		                         break;
 			             case 4: System.out.println("Introduzca los datos de la cuenta banacaria a la que transferir el dinero:"); 
   			                     n=pedirnumero();
	   			                 s=pedirsaldo("Saldo Inicial");     
   			                     CuentaBancaria c=new CuentaBancaria(n,s);
   			                     cant=pedirsaldo("Cantidad a trasferir:");
   			    	             c2.transferencia(cant, c);
   			    	             System.out.println("El saldo de la cuenta a la que se ha trasferido el dienro es:"+c.versaldo());
   			    	             break;
 			           }          
 			          }while (opc2!=5);
 			        break;	     
		}
    }while(opc!=4);
}
}
