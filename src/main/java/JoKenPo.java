
public class JoKenPo {
    
	public static String jogar(FormatoDaMao opcaoDoJogador1, FormatoDaMao opcaoDoJogador2) {
		if (opcaoDoJogador1 == opcaoDoJogador2)
			return "empate";
		
		if (opcaoDoJogador1.ganhaDa(opcaoDoJogador2) )
			return opcaoDoJogador1.toString();
		else
			return opcaoDoJogador2.toString();
	}
}