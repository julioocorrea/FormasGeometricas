package Models;

public class Quadrilatero {
	
	private double Lado1;
	private double Lado2;
	
	public Quadrilatero(double lado1, double lado2) {
		this.Lado1 = lado1;
		this.Lado2 = lado2;
	}
	
	public String VerificarQuadrilatero() {
		if (this.Lado1 != 0 && this.Lado2 != 0) {
			if (this.Lado1 == this.Lado2) {
				return "Quadrado";
			}
			else {
				return "Retangulo";
			}
		}
		else {
			return "Invalido";
		}
	}
	
	public double CalcularArea() {
		if(VerificarQuadrilatero().equals("Quadrado")) {
			double areaQuadrado = Math.pow(this.Lado1, 2);
			return areaQuadrado;
		}
		else if (VerificarQuadrilatero().equals("Retangulo")) {
			double areaRetangulo = this.Lado1 * this.Lado2;
			return areaRetangulo;
		}
		else {
			return 0;
		}
	}
	
	public double CalcularPerimetro() {
		double perimetro = this.Lado1 + this.Lado2;
		return perimetro;
	}
	
	public String toString() {
		return "Tipo do quadrilátero: " + VerificarQuadrilatero() + "\nÁrea do quadrilátero: " + String.format("%.2f", CalcularArea()) + "\nPerímetro do quadrilátero: " + CalcularPerimetro();
	}
	
}
