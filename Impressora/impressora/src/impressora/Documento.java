package impressora;

public class Documento {
	int paginas;
	String texto;
	
	public Documento(int paginas, String texto) {
		super();
		this.paginas = paginas;
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
}
