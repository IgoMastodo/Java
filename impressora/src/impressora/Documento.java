package impressora;

public class Documento {
	private final int paginas;
	private final String texto;
	
	public Documento(int paginas, String texto) {
		super();
		this.paginas = paginas;
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	
	public int getPaginas() {
		return paginas;
	}

	
	
}
