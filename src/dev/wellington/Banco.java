package dev.wellington;

import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void imprimirContas() {
		for (Conta conta: contas) {
			conta.imprimirInfosComuns();
		}
	}

}
