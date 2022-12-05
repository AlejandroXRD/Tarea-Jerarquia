import java.io.*;

public class NoHayLuzException extends ErrorDeConexionException{
	public NoHayLuzException() {
		super("El servidor se encuentra sin luz.");
	}
	public NoHayLuzException(String mss) {
		super(mss);
	}

}
