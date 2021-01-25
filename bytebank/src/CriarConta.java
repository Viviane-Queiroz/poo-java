package bytebank;

public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		// instance an object of type Conta
		// the variable primeiraConta does not contain an object, but a reference to it
		primeiraConta.saldo = 200;
		System.out.println("Primeira conta: " + primeiraConta.saldo);
	
		primeiraConta.saldo += 100;
		System.out.println("Primeira conta com bonus: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Segunda conta: " + segundaConta.saldo);
	}
}
