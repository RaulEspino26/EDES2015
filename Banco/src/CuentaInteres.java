






public class CuentaInteres extends CuentaBancaria
{   
	CuentaInteres(int n, double s)
	{ super(n,s);
	}
	public void ingresar(double cant)
	{
		cant=cant*1.03;
		super.ingresar(cant);
	}
	
}
