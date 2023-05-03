package modelo;

import java.util.List;

public class Farmacia {
	
	private List<Filial> filiais;

	public List<Filial> getFiliais() {
		return filiais;
	}
	
	public Farmacia(List<Filial> filiais) {
		super();
		this.filiais = filiais;
	}


	public void setFiliais(List<Filial> filiais) {
		this.filiais = filiais;
	}

	
	
}
