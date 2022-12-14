package Jerarquia;

import java.io.*;

public class ErrorDeFondosException extends ErrorDeRetiroException {
	public ErrorDeFondosException() {
		super("No existen fondos para realizar su operacion.");
	}
	public ErrorDeFondosException(String mss) {
		super(mss);
	}

}
