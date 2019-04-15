
public class LivrariaVirtualViaBoleto extends LivrariaVirtual {
	public String receberPagamento(float valor){
		return "Pagamento efetuado via boleto : R$"+valor;
	}
}
