public class ValorAvaliacao {
	private float valor;
	private MedidaAvaliacao medida;
	
	public ValorAvaliacao(MedidaAvaliacao medida) {
		valor = 0.0f;
		this.medida = medida;
		this.valor = valor;
	}

	public boolean setValor(float valor) {
		if (valor > medida.getMenorValor() && valor < medida.getMaiorValor()) {
			this.valor = valor;
			return true;
		}
		else {
			System.out.println("Atribuição impossível");
			return false;
		}
	}

	public float getValor() {
		return valor;
	}

	public MedidaAvaliacao getMedida() {
		return medida;
	}

	public boolean equals(ValorAvaliacao avaliacao) {
		boolean medidasIguais = false;

		if (getMedida().getNome().equals(avaliacao.getMedida().getNome()) 
			&& getMedida().getMaiorValor() == avaliacao.getMedida().getMaiorValor() 
			&& getMedida().getMenorValor() == avaliacao.getMedida().getMenorValor()) {
			medidasIguais = true;
		}
		return medidasIguais;
	}
}