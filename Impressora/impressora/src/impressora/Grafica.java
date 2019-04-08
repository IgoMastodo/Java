package impressora;

public class Grafica {
	
	float precoPorPagina;
	ImpressoraGenerica IG;
	
	public Grafica(float precoPorPagina, ImpressoraGenerica iG) {
		super();
		this.precoPorPagina = precoPorPagina;
		IG = iG;
	}
	

}
