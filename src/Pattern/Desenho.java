package Pattern;

import java.util.ArrayList;
import java.util.List;

public class Desenho extends Figura {
	private List<Figura> desenho;
	
	public Desenho() {
		this.desenho = new ArrayList<>();
	}
	
	@Override
	public void adicionarFigura(Figura figura) {
		this.desenho.add(figura);
	}
	
	@Override
	public void removerFigura(Figura figura) {
		this.desenho.remove(figura);
	}
	
	public void desenhar() {
		for(Figura fig : desenho) {
			fig.desenhar();
		}
	}
}
