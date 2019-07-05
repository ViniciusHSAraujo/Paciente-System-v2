package enums;

public enum Tarjas {
	VERMELHA_SEM_RETENCAO_RECEITA("Tarja Vermelha sem Retenção da Receita"), VERMELHA_COM_RETENCAO_RECEITA("Tarja Vermelha com Retenção da Receita"), PRETA("Tarja Preta"), AMARELA("Tarja Amarela"), NAO_TARJADOS("Não Tarjados");

	private Tarjas() {
	}

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private Tarjas(String descricao) {
		this.descricao = descricao;
	}
}
