package impressora;

public class ImpressoraLaser extends ImpressoraGenerica {

    private final static int AUTONOMIA_NOMINAL = 10000;

    public ImpressoraLaser() {
        super(AUTONOMIA_NOMINAL);
    }


	@Override
    public void efetuarImpressao(String string){
		System.out.println("Imprimindo como impressora Laser : "+string);
	}
}
