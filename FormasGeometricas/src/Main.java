import Models.GerenciadorDeElementos;
import Models.Circulo;
import Models.Quadrilatero;
import Models.Triangulo;


public class Main {
	public static void main(String[] args) {
		GerenciadorDeElementos gerenciador = new GerenciadorDeElementos();
		Triangulo t1 = new Triangulo(12, 12, 12);
		Circulo c1 = new Circulo(9);
		Quadrilatero q1 = new Quadrilatero(3, 3);
		
		gerenciador.ObterInformacoes(t1);
		gerenciador.ObterInformacoes(t1, c1);
		gerenciador.ObterInformacoes(t1, c1, q1);
		
	}
}
