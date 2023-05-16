//import static org.junit.Assert.assertEquals;
//import java.util.Date;
//import org.junit.Before;
//import org.junit.Test;
//
//public class ControleDeAcessoTest {
//    private ControleDeAcesso controle;
//
//    @Before
//    public void setUp() {
//        controle = new ControleDeAcesso();
//    }
//
//    @Test
//    public void testPrimeiroAcesso() {
//        int codigo = 123;
//        controle.registrarAcesso(codigo);
//        assertEquals(1, controle.getRegistros().size());
//        assertEquals(new Date(), controle.getRegistros().get(codigo));
//    }
//
//    @Test
//    public void testAcessoRepetido() {
//        int codigo = 456;
//        controle.registrarAcesso(codigo);
//        controle.registrarAcesso(codigo);
//        assertEquals(1, controle.getRegistros().size());
//    }
//}
import static org.junit.Assert.assertEquals;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;

public class ControleDeAcessoTest {
    private ControleDeAcesso controle;

    @Before
    public void setUp() {
        controle = new ControleDeAcesso();
    }

    @Test
    public void testPrimeiroAcesso() {
        int codigo = 123;
        controle.registrarAcesso(codigo);
        assertEquals(1, controle.getRegistros().size());
        assertEquals(new Date(), controle.getRegistros().get(codigo));
    }

    @Test
    public void testAcessoRepetido() {
        int codigo = 456;
        controle.registrarAcesso(codigo);
        controle.registrarAcesso(codigo);
        assertEquals(1, controle.getRegistros().size());
    }

    @Test
    public void testAcessoInvalido() {
        int codigo = 789;
        controle.registrarAcesso(codigo);
        assertEquals(1, controle.getRegistros().size());
        assertEquals(new Date(), controle.getRegistros().get(codigo));
    }
}
