package impressora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grafica GRA;
		Documento DOC;
		char ans;
		int aut;
		int pag;
		String str;
		System.out.println("Informe sobre o documento");
		System.out.println("Número de páginas :");
		pag = sc.nextInt();
		System.out.println("Texto :");
		str = sc.next();

		DOC = new Documento(pag, str);

		System.out.println("Você vai imprimir com laser ou tinta?(L/T)");
		ans = sc.next().charAt(0);

		if (ans == 'L') {
			ImpressoraGenerica ig = new ImpressoraLaser();
			GRA=new Grafica(0.7,ig);
			GRA.orcarImpressao(DOC);
			GRA.imprimir(DOC);
		} else

		if (ans == 'T') {
			
			System.out.println("Informe autonomia nominal");
			aut = sc.nextInt();
			ImpressoraGenerica ig = new ImpressoraTinta(aut);
			GRA=new Grafica(0.5,ig);
			GRA.orcarImpressao(DOC);
			GRA.imprimir(DOC);
		} else {

			System.out.println("Reposta inválida");
		}
		sc.close();
	}

}
