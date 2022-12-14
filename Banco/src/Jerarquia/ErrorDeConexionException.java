package Jerarquia;

import java.io.*;

public class ErrorDeConexionException extends ErrorDeRetiroException{
	public ErrorDeConexionException() {
		super("No se encuentra en conexion con el servidor.");
	}
	public ErrorDeConexionException(String mss) {
		super(mss);
	}

}
