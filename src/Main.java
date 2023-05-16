import java.util.Date;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ControleDeAcesso controle = new ControleDeAcesso();

        int codigoAcesso = 123;
        controle.registrarAcesso(codigoAcesso);

        System.out.println("Registros de acesso:");
        for (Map.Entry<Integer, Date> registro : controle.getRegistros().entrySet()) {
            System.out.println("Código: " + registro.getKey() + " - Data: " + registro.getValue());
        }
    }
}
