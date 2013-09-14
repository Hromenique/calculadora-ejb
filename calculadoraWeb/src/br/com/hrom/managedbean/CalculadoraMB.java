package br.com.hrom.managedbean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.hro.sessionbeans.Calculadora;

@ManagedBean
public class CalculadoraMB {
	
	@EJB
	private Calculadora calculadora;
	
	private double a;
	private double b;
	private double resultado;
	
	public void soma(){
		this.resultado = this.calculadora.soma(a, b);
	}
	
	public void subtracao(){
		this.resultado = this.calculadora.subtracao(a, b);
	}
	
	public void multiplicacao(){
		this.resultado = this.calculadora.multiplicacao(a, b);
	}
	
	public void divisao(){
		this.resultado = this.calculadora.divisao(a, b);
	}

	public Calculadora getCalculadora() {
		return calculadora;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getResultado() {
		return resultado;
	}

	public void setCalculadora(Calculadora calculadora) {
		this.calculadora = calculadora;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
}
