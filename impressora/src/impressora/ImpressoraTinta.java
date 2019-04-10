package impressora;

public class ImpressoraTinta extends ImpressoraGenerica {
	
	public ImpressoraTinta (int autonomiaNominal) {
		super(autonomiaNominal);
	}
	
	@Override
    public void efetuarImpressao(String string){
		System.out.println("Imprimindo como impressora jato de tinta : "+string);
	}
	
	public int getAutonomiaNominal() {
		return autonomiaNominal;
	}

}
