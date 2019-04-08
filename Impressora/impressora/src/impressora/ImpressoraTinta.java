package impressora;

public class ImpressoraTinta extends ImpressoraGenerica {
	
	@Override
    public void efetuarImpressao(String string){
		System.out.println("Imprimindo como impressora jato de tinta"+string);
	}

}
