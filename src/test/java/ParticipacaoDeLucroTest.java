import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ParticipacaoDeLucroTest {

    // criar o metodo de test: command + n

    private ParticipacaoDeLucro participacaoDeLucro = new ParticipacaoDeLucro();


    @Test
    public void deveRetornarParticipacaoDeLucrosDoAnalista() throws Exception {

        Float valor = participacaoDeLucro.recuperaParticipacaoDeLucroPorCargo("Analista");
        assertThat(valor, is(new Float(1000)));
    }

    @Test
    public void deveRetornarParticipacaoDeLucrosDoTrainee() throws Exception {

        Float valor = participacaoDeLucro.recuperaParticipacaoDeLucroPorCargo("Trainee");
        assertThat(valor, is(new Float(10)));
    }
}
