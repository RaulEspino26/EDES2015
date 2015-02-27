




public class CuentaBancaria
{
	private int numeroCC;
	private double saldo;
	
	CuentaBancaria(int n, double s)
	{
		numeroCC=n;
		saldo=s;
	}
	protected void ingresar(double cant)
	{
		saldo+=cant;
	}
	protected boolean retirar(double cant)
	{
		if(saldo>=cant)
			{saldo-=cant;
			 return true;
			}
		else { System.out.println("No hay saldo suficiente.");
			   return false;
		     }
	}
	protected double versaldo()
	{return saldo;}
	protected void transferencia(double cant, CuentaBancaria c)
	{  
		if(retirar(cant)==true)
		   c.ingresar(cant);	
	}
}
