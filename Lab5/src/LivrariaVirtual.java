
public abstract class LivrariaVirtual {

	private Livro[] acervo;
	private int tamanhoAcervo;
	private int precoPorLivroEmReais;

	public LivrariaVirtual() {

		this.acervo = new Livro[1000];
		this.tamanhoAcervo = 0;

	}

	private boolean possuiLivro(Livro livro){
		
		for(Livro itemAcervo : this.acervo){
		    if (itemAcervo == livro){
		    	return true;
		    }if (itemAcervo == null){
		    	break;
		    }
		}
		return false;
	}
	
	public void incluirLivroNoAcervo(Livro livro){
	
		this.acervo[tamanhoAcervo]=livro;
		
	}
	public abstract String receberPagamento(float valor);
	
	public String efetuarVenda(Livro livro, int quantidade){
		if(possuiLivro(livro)==true){//tem que usar .equals()
		
			return " RECIBO "+receberPagamento(getPrecoPorLivroEmReais());
		}else return "Livro não encontrado";
	}
	
	public int getTamanhoAcervo() {
		return tamanhoAcervo;
	}

	public void setTamanhoAcervo(int tamanhoAcervo) {
		this.tamanhoAcervo = tamanhoAcervo;
	}

	public int getPrecoPorLivroEmReais() {
		return precoPorLivroEmReais;
	}

	public void setPrecoPorLivroEmReais(int precoPorLivroEmReais) {
		this.precoPorLivroEmReais = precoPorLivroEmReais;
	}

}
