package Models;

public class Circulo {
	
	private double Raio;
	
	public Circulo(double raio) {
		this.Raio = raio;
	}
	
	public double CalcularArea() {
		double area = Math.PI * Math.pow(Raio, 2);
		return area;
	}
	
	public double CalcularPerimetro() {
		double perimetro = (2 * Math.PI) * this.Raio;	
		return perimetro;
	}
	
	public String toString() {
		return "Área do cículo: " + String.format("%.2f", CalcularArea()) + "\nPerímetro do círculo: " + String.format("%.2f", CalcularPerimetro()) + "\nRaio do círuclo: " + this.Raio;
	}
	
}
