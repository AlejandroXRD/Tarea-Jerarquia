import java.io.*;

public class RealizandoRellenoDeFondosException extends ErrorDeRetiroException{
	public RealizandoRellenoDeFondosException() {
		super("En estos momentos se estan depositando los fondos de forma manual.");
	}
	public RealizandoRellenoDeFondosException(String mss) {
		super(mss);
	}

}
