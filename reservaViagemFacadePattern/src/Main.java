import com.digitalhouse.model.Viagem;
import com.digitalhouse.service.impl.FacadeViagem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FacadeViagem facade = new FacadeViagem();

        Viagem viagem = new Viagem();

        viagem = facade.buscar("Campinas", LocalDate.of(2023,2,15));

       viagem.getHoteis();
       viagem.getVoo();
    }
}