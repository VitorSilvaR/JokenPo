
import junit.framework.Assert;

import  org.junit.Test;

public class JoKenPoTest {
    
    @Test
    public void jogarPedraGanha(){
        Assert.assertEquals("pedra", JoKenPo.jogar("pedra","tesoura"));
        Assert.assertEquals("pedra", JoKenPo.jogar("tesoura","pedra"));
    }
    
    @Test
    public void jogarPapelGanha(){
        Assert.assertEquals("papel", JoKenPo.jogar("papel","pedra"));
        Assert.assertEquals("papel", JoKenPo.jogar("pedra","papel"));
    }

    @Test
    public void jogarTesouraGanha(){
        Assert.assertEquals("tesoura", JoKenPo.jogar("tesoura", "papel"));
        Assert.assertEquals("tesoura", JoKenPo.jogar("papel", "tesoura"));
    }
    
    @Test
    public void jogarEmpate(){
        Assert.assertEquals("empate", JoKenPo.jogar("tesoura","tesoura"));
        Assert.assertEquals("empate", JoKenPo.jogar("papel","papel"));
        Assert.assertEquals("empate", JoKenPo.jogar("pedra","pedra"));
    }
    
}
