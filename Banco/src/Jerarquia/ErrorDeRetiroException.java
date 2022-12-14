package Jerarquia;

import java.io.*;

public class ErrorDeRetiroException extends Exception{
	public ErrorDeRetiroException() {
		super("Ha ocurrido un error en el retiro del dinero");
	}
	public ErrorDeRetiroException(String mss) {
		super(mss);
	}

}
