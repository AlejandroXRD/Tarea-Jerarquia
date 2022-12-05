import java.io.*;

public class InsuficienciaDeBilletesException extends ErrorDeFondosException {
	public InsuficienciaDeBilletesException() {
		super("No se encuentran billetes de la numeracion deseada.");
	}
	public InsuficienciaDeBilletesException(String mss) {
		super(mss);
	}

}
