import java.io.IOException;

public class Principal {


    public static void main(String[] args) throws IOException {

        Leitura leitura;
        leitura = new Leitura();

        leitura.obterNumeroFuncionarios();
        leitura.obterMargemDeLucroEmpresa();
        leitura.obterCargoFuncionario();

//        if (leitura.validarSeExisteParcicipacao()) {
//            leitura.obterCargoFuncionario();
//            leitura.obterPerformanceAnualFuncionario();
//        }
        }

    }

