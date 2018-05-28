import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

    private int numeroFuncionarios = 0;
    private int numeroCargoFuncionario = 0;
    private float margemDeLucroEmpresa = 0;
    private BufferedReader respostaConsole = new BufferedReader(new InputStreamReader(System.in));


    public void obterMargemDeLucroEmpresa() throws IOException {

        boolean margemDeLucroObtidoComSucesso = false;

        System.out.println("Informe a margem de lucro da empresa no ano: ");

        while(!margemDeLucroObtidoComSucesso) {
            try {
                margemDeLucroEmpresa = Float.parseFloat(respostaConsole.readLine());
                margemDeLucroObtidoComSucesso = true;

            } catch (NumberFormatException nfe) {
                System.err.println("O número de funcionários deve ser real, por favor tente novamente!");
            }
        }

    }


    public void obterNumeroFuncionarios() throws IOException {

        boolean numeroFuncionariosObtidoComSucesso = false;

        System.out.println("Bem vindo ao TOTIUORKIS PROFTISHARING CALCULATOR! \nPor favor, informe o número de Funcionários da empresa: ");

        while(!numeroFuncionariosObtidoComSucesso) {
            try {
               numeroFuncionarios = Integer.parseInt(respostaConsole.readLine());
                numeroFuncionariosObtidoComSucesso = true;

            } catch (NumberFormatException nfe) {
                System.err.println("O número de funcionários deve ser Inteiro, por favor tente novamente!");
            }
        }

    }

    public Resposta obterCargoFuncionario() throws IOException {
        boolean numeroCargoFuncionariosObtidoComSucesso = false;

        System.out.println("Por favor, informe número correspondente ao cargo do fucionário:" +
                "\n 1 - Trainee" +
                "\n 2 - Analista" +
                "\n 3 - Gerente");

        while(!numeroCargoFuncionariosObtidoComSucesso) {
            try {
                numeroCargoFuncionario = Integer.parseInt(respostaConsole.readLine());
                numeroCargoFuncionariosObtidoComSucesso = true;

            } catch (NumberFormatException nfe) {
                System.err.println("O cargo do funcionário deve ser um número:" +
                        "\n 1 - Trainee" +
                        "\n 2 - Analista" +
                        "\n 3 - Gerente" +
                        "\n Por favor tente novamente!");
            }
        }
        return new Resposta();
    }


    public boolean validarSeExisteParcicipacao() {
        return false;
    }



    public void obterPerformanceAnualFuncionario() {
    }
}


//Trainee, Analista e Gerente
