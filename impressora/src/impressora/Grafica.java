package impressora;

public class Grafica {

	double precoPorPagina;
	ImpressoraGenerica IG;

	public Grafica(double precoPorPagina, ImpressoraGenerica IG) 
	{
		super();
		this.precoPorPagina = precoPorPagina;
		this.IG = IG;
	}

	public double orcarImpressao (Documento doc) 
	{
		return precoPorPagina*doc.getPaginas();
	}
	void imprimir(Documento doc) {
		IG.imprimirDocumento(doc);
		if (doc.getPaginas() + IG.getTotalPaginasImpressas() > IG.getAutonomiaNominal()) {
			System.out.println("--------------------------------------------");
		}else
		System.out.println("\n------------Recibo------------- \n"+"Valor : "+orcarImpressao(doc)+"R$");
	}

}
