package dev.wellington;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente wellington = new Cliente();
		wellington.setNome("Wellington");
		
		Conta cc = new ContaCorrente(wellington);
		Conta poupanca = new ContaPoupanca(wellington);

		cc.depositar(100);
		cc.transferir(90, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Banco banco = new Banco();
		banco.setContas(List.of(cc, poupanca));
		banco.imprimirContas();

	}

}
