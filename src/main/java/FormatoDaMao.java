
public enum FormatoDaMao {

	PEDRA("TESOURA"), PAPEL("PEDRA"), TESOURA("PAPEL");

	private String perdedor;

	FormatoDaMao(String nomePerdedor) {
		this.perdedor = nomePerdedor;
	}

	public boolean ganhaDa(FormatoDaMao formato) {
		return FormatoDaMao.valueOf(perdedor) == formato;
	}
	
	@Override
	public String toString() {
		return super.name().toLowerCase();
	}

}
