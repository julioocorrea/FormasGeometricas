package Models;

public class Triangulo {
	
	private double Lado1;
	private double Lado2;
	private double Base;
	
	public Triangulo(double lado1, double lado2, double base) {
		this.Lado1 = lado1;
		this.Lado2 = lado2;
		this.Base = base;
	}
	
	public String DefinirClassificacaoDoTriangulo() {
		if (this.Lado1 == this.Lado2 && this.Lado2 == this.Base) {
			return "Equilatero";
		}
		else if (this.Lado1 == this.Lado2 && this.Lado1 != this.Base) {
			return "Isosceles";
		}
		else if (this.Lado1 == this.Base && this.Lado1 != this.Lado2) {
			return "Isosceles";
		}
		else if (this.Lado2 == this.Base && this.Lado2 != this.Lado1) {
			return "Isosceles";
		}
		else {
			return "Escaleno";
		}
	}
	
	public Double CalcularArea() {
		if (DefinirClassificacaoDoTriangulo().equals("Escaleno")) {
			double S = (this.Lado1 + this.Lado2 + this.Base) / 2;
			double eq = S*((S-this.Lado1)*(S-this.Lado2)*(S-this.Base));
			double area = Math.sqrt(eq);
			return area;
		}
		
		else if (DefinirClassificacaoDoTriangulo().equals("Isosceles")) {
			double eq = Math.pow(this.Lado1, 2) - (Math.pow(this.Base, 2) / 4);
			double altura = Math.sqrt(eq);
			double area = (0.5) * ((altura) * (this.Base));
			return area;
		}
		else {
			double area = ((Math.pow(Lado1, 2)) * Math.sqrt(3)) / 4;
			return area;
		}		
	}
	
	public double CalcularPerimetro() {
		return this.Lado1 + this.Lado2 + this.Base;
	}
	
	public String toString() {
		return "Classificação do Triângulo: " + DefinirClassificacaoDoTriangulo() + "\nÁrea do Triângulo: " + String.format("%.2f", CalcularArea()) + "\nPerímetro do Triângulo: " + CalcularPerimetro();
	}
	
}
