package Pattern;

public class Main {

	public static void main(String[] args) {
		//Instancia abaixo figuras concretas e um desenho
		Figura fig1 = new Quadrado();
		Figura fig2 = new Circulo();
		Figura fig3 = new Quadrado();
		Figura desenho = new Desenho();
		
		//desenha as figuras individuais
		fig1.desenhar();
		System.out.println();
		fig2.desenhar();
		System.out.println();
		fig3.desenhar();
		System.out.println();
		
		//adiciona figuras para compor o desenho
		desenho.adicionarFigura(fig1);
		desenho.adicionarFigura(fig2);
		desenho.adicionarFigura(fig3);
		
		desenho.desenhar();
		
		desenho.removerFigura(fig1);
		
		System.out.println();
		
		desenho.desenhar();
		
		//Mostra que adicionar figuras não funciona para as classes circulo e quadrado
		System.out.println();
		fig1.adicionarFigura(fig2);
		fig1.desenhar();
		System.out.println();
		fig2.adicionarFigura(fig3);
		
	}

}
