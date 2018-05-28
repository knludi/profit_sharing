

public class ParticipacaoDeLucro {


    public Float recuperaParticipacaoDeLucroPorCargo(String cargo) {

        if(cargo.equals("Analista")) {
            return Float.valueOf(1000);
        }

        if(cargo.equals("Trainee")) {
            return Float.valueOf(10);
        }

        return Float.valueOf(0);
    }

    // criar a classe de test: command + shift + t


}
