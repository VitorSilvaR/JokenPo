
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JoKenPoTest {
    
    @Test
    public void jogarPedraGanha(){
        assertEquals("pedra", JoKenPo.jogar(FormatoDaMao.PEDRA,FormatoDaMao.TESOURA));
        assertEquals("pedra", JoKenPo.jogar(FormatoDaMao.TESOURA,FormatoDaMao.PEDRA));
    }
    
    @Test
    public void jogarPapelGanha(){
        assertEquals("papel", JoKenPo.jogar(FormatoDaMao.PAPEL,FormatoDaMao.PEDRA));
        assertEquals("papel", JoKenPo.jogar(FormatoDaMao.PEDRA,FormatoDaMao.PAPEL));
    }

    @Test
    public void jogarTesouraGanha(){
        assertEquals("tesoura", JoKenPo.jogar(FormatoDaMao.TESOURA, FormatoDaMao.PAPEL));
        assertEquals("tesoura", JoKenPo.jogar(FormatoDaMao.PAPEL, FormatoDaMao.TESOURA));
    }
    
    @Test
    public void jogarEmpate(){
        assertEquals("empate", JoKenPo.jogar(FormatoDaMao.TESOURA,FormatoDaMao.TESOURA));
        assertEquals("empate", JoKenPo.jogar(FormatoDaMao.PAPEL,FormatoDaMao.PAPEL));
        assertEquals("empate", JoKenPo.jogar(FormatoDaMao.PEDRA,FormatoDaMao.PEDRA));
    }
    
}
