package impressora;

public class ImpressoraGenerica {
	protected int modelo;
	protected int autonomiaNominal;
	private int autonomiaRestante;
	private int totalPaginasImpressas;
	private double porcentagem;
	
	
	public ImpressoraGenerica(int modelo, int autonomiaNominal) {
		super();
		this.modelo = modelo;
		this.autonomiaNominal = autonomiaNominal;
	}

	protected void efetuarImpressao(String string){
		  
	}
	
	public void imprimirDocumento(Documento documento){
		
		
		
		if(autonomiaRestante-documento.getPaginas()>=0){
			efetuarImpressao(documento.getTexto());
		}

		porcentagem=this.autonomiaRestante*100/this.autonomiaNominal;
		this.totalPaginasImpressas+=documento.getPaginas();
	}

	
	
	
	public int getAutonomiaRestante() {
		return autonomiaRestante;
	}

	public void setAutonomiaRestante(int autonomiaRestante) {
		this.autonomiaRestante = autonomiaRestante-totalPaginasImpressas;
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
		autonomiaRestante= autonomiaNominal;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
   
}
