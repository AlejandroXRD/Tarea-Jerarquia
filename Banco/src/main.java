import java.util.*;

import Jerarquia.ErrorDeRetiroException;

public class main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dinero = 0;
		
		int cantidad=0;
		int errores=0;
		
		while(true) {
			System.out.println("Dinero: "+dinero+" Saldo: "+Banco.saldoCliente);
			try {
				System.out.println("Extraiga la cantidad deseada");
				String temp = scan.next();
				cantidad = Integer.valueOf(temp);
				dinero +=Banco.ExtraerCNT(cantidad);
			}
			catch(ErrorDeRetiroException ex) {
				System.out.println(ex.getMessage());
				errores++;
				if(errores>4) {
					Banco.encendido=false;
				}
			}
		}
	}
}
