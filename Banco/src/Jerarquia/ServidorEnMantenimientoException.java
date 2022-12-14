package Jerarquia;

import java.io.*;

public class ServidorEnMantenimientoException extends ErrorDeConexionException{
	public ServidorEnMantenimientoException() {
		super("El servidor se encuentra en mantenimiento ahora mismo.");
	}
	public ServidorEnMantenimientoException(String mss) {
		super(mss);
	}

}
