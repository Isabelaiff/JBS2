import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ControleDeAcesso {
    private Map<Integer, Date> registros;

    public ControleDeAcesso() {
        registros = new HashMap<>();
    }


    public void registrarAcesso(int codigo) {
        Date dataAtual = new Date();
        if (registros.containsKey(codigo)) {
            System.out.println("Obrigado pela visita");
        } else {
            registros.put(codigo, dataAtual);
            System.out.println("Bem-vindo, acesso liberado");
        }
        System.out.println("Data do evento: " + dataAtual);
    }

    public Map<Integer, Date> getRegistros() {
        return registros;
    }
}
