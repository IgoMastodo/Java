package impressora;

public class ImpressoraGenerica {

	protected int autonomiaNominal; // Total de p�ginas que podem ser impressas entre cada reposi��o de "tinta"

	private int totalPaginasImpressas; // N�mero de p�ginas impressas desde a �ltima "recarga"

	public ImpressoraGenerica(int autonomiaNominal) {
		super();
		this.autonomiaNominal = autonomiaNominal;
		totalPaginasImpressas = 0;
	}

	protected void efetuarImpressao(String string) {

	}

	public void imprimirDocumento(Documento documento) {

		if (documento.getPaginas() + this.totalPaginasImpressas > this.autonomiaNominal) {
			System.out.println("Numero de paginas excedido");
		}else

		efetuarImpressao(documento.getTexto());
		setTotalPaginasImpressas(documento.getPaginas());
	}

	public int getAutonomiaRestantePercentual() {
		return 100 * getAutonomiaRestante() / getAutonomiaNominal();
	}

	public int getAutonomiaRestante() {
		return getAutonomiaNominal() - this.totalPaginasImpressas;
	}

	public int getTotalPaginasImpressas() {
		return totalPaginasImpressas;
	}

	public void setTotalPaginasImpressas(int totalPaginasImpressas) {
		this.totalPaginasImpressas = totalPaginasImpressas;
	}

	public int getAutonomiaNominal() {
		return autonomiaNominal;
	}

	public void setAutonomiaNominal(int autonomiaNominal) {
		this.autonomiaNominal = autonomiaNominal;
	}

}
