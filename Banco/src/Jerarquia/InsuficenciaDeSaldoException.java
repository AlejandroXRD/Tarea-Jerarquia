package Jerarquia;

import java.io.*;

public class InsuficenciaDeSaldoException extends ErrorDeRetiroException{
	public InsuficenciaDeSaldoException() {
		super("No tiene ese dinero en su cuenta.");
	}
	public InsuficenciaDeSaldoException(String mss) {
		super(mss);
	}

}
