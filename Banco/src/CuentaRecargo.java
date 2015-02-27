













public class CuentaRecargo extends CuentaBancaria {
	CuentaRecargo(int n,double s)
	{
		super(n,s);
	}
	public boolean retirar(double cant)
    {
		return(super.retirar(cant+3));
    }
}
