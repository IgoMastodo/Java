package entities;

public class ContaBancaria {
 
	private String name;
	private int password;
	private double balance=0;
	private  int accountNumber;

	public ContaBancaria(String name, int password, double balance, int accountNumber) {
		super();
		this.name = name;
		this.password = password;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	public ContaBancaria(String name, int password, int accountNumber) {
		super();
		this.name = name;
		this.password = password;
		this.accountNumber = accountNumber;
	}
	public boolean transferir(){
		return false;
		
	}
	@Override
	public String toString() {
		return "Nome: " +
				name + 
				" , Senha" +
				password + 
				" , Saldo" +
				balance ;
	}
	
	


}
