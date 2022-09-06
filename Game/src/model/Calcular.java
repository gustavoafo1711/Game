package model;

import java.util.Random;

public class Calcular {
	private int dificuldade;
	private int valor1;
	private int valor2;
	private int operacao;
	private int resultado;

	public Calcular(int dificuldade) {

		Random rand = new Random();

		this.operacao = rand.nextInt(3); // 0- somar; 1- diminuir; 2- multiplicar;
		this.dificuldade = dificuldade;

		if (dificuldade == 1) {
			// fácil
			this.valor1 = rand.nextInt(10); // 0 à 9
			this.valor2 = rand.nextInt(10); // 0 à 9
		} else if (dificuldade == 2) {
			// médio
			this.valor1 = rand.nextInt(100); // 0 à 99
			this.valor2 = rand.nextInt(100); // 0 à 99
		} else if (dificuldade == 3) {
			// difícil
			this.valor1 = rand.nextInt(1000); // 0 à 999
			this.valor2 = rand.nextInt(1000); // 0 à 999
		} else if (dificuldade == 4) {
			// muito difícil
			this.valor1 = rand.nextInt(10000); // 0 à 9999
			this.valor2 = rand.nextInt(10000); // 0 à 9999
		} else {
			// ultra
			this.valor1 = rand.nextInt(100000); // 0 à 99999
			this.valor2 = rand.nextInt(100000); // 0 à 99999
		}

	}

	public int getDificuldade() {
		return dificuldade;
	}

	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getOperacao() {
		return operacao;
	}

	public int getResultado() {
		return resultado;
	}

	public String toString() {
		String op;
		if (this.getOperacao() == 0) {
			op = "Somar";
		} else if (this.getOperacao() == 1) {
			op = "Subtrair";
		} else if (this.getOperacao() == 2) {
			op = "Multiplicar";
		} else {
			op = "Operação desconhecida";
		}

		return "Valor 1: " + this.getValor1() + 
			   "\nValor 2: " + this.getValor2() +
			   "\nDificuldade: "+ this.getDificuldade() + 
			   "\nOperação: " + op;
	}

	public boolean somar(int resposta) {
		this.resultado = this.getValor1() + this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta correta");
			certo = true;
		} else {
			System.out.println("Resposta errada");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}

	public boolean diminuir(int resposta) {
		this.resultado = this.getValor1() - this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta correta");
			certo = true;
		} else {
			System.out.println("Resposta errada");
		}
		System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}

	public boolean multiplicar(int resposta) {
		this.resultado = this.getValor1() * this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta correta");
			certo = true;
		} else {
			System.out.println("Resposta errada");
		}
		System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}

}
