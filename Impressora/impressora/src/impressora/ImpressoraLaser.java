package impressora;

public class ImpressoraLaser extends ImpressoraGenerica {
   
	
	@Override
    public void efetuarImpressao(String string){
		System.out.println("Imprimindo como impressora Laser"+string);
	}
}
