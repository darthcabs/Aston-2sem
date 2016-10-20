package br.com.fiap.excecoes;


public class Excecoes extends Exception {
	private static final long serialVersionUID = 1L;
	public Excecoes(String message, Exception e) {
		super(message, e);
		if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			System.out.println("Número inválido.");
		} else if (e.getClass().toString().equals("class java.lang.ArithmeticException")) {
			System.out.println("Divisão por 0");
		} else {
			System.out.println(e.getClass().toString());
		}
		this.print();
		e.printStackTrace();
	}
	public Excecoes(String message) {
		System.out.println(message);
	}
	public void print() {
		System.out.println(getMessage());
		System.out.println("PrintStackTrace: ");
	}
}