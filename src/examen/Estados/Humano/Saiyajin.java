package examen.Estados.Humano;

import examen.Ataque;
import examen.Estados.Estado;

public class Saiyajin implements Humano {

    @Override
    public Ataque obtenerAtaque() {
        Ataque ataque= new Ataque("Kamehameha", 15);

        return ataque;
    }
}
