package impressora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpressoraGenerica IT = new ImpressoraTinta();
		ImpressoraGenerica IL = new ImpressoraLaser();
		Grafica G = new Grafica(IT, 1.0f);
	
	
	
	}

}
