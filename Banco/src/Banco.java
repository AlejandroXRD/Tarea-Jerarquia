import Jerarquia.*;

public class Banco {
	public static int DineroBanco = 500;
	public static int saldoCliente=200;
	public static int extraido=0;
	
	public static boolean encendido =true;
	
	public static int ExtraerCNT(int cnt) throws ErrorDeRetiroException{
		if(encendido==true) {
			if(extraido<5) {
				if(saldoCliente>=cnt) {
					if(DineroBanco>=cnt) {
						saldoCliente -=cnt;
						DineroBanco -=cnt;
						extraido++;
						return cnt;
					}
					else {
						throw new InsuficienciaDeBilletesException();
					}
				}
				else {
					throw new InsuficenciaDeSaldoException();
				}
			}
			else {
				throw new ServidorEnMantenimientoException();
			}
		}else {
				throw new NoHayLuzException();
		}
		
		
	}
}
