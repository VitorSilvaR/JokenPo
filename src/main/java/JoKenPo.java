public class JoKenPo {
    
    public static String jogar(String item1, String item2) {
        String retorno = "empate";
        
        if(item1.equals("pedra") && item2.equals("tesoura") || item1.equals("tesoura") && item2.equals("pedra")){
            retorno = "pedra";
        }
        else if(item1.equals("papel") && item2.equals("tesoura") || item1.equals("tesoura") && item2.equals("papel")){
            retorno = "tesoura";
        }else if(item1.equals("papel") && item2.equals("pedra") || item1.equals("pedra") && item2.equals("papel")){
            retorno = "papel";
        }
        
        return retorno;
    }
        
}