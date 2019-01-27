package examen.Estados.Humano;

import examen.Ataque;
import examen.Estados.Estado;

public class SuperSaiyajin implements Humano {
    @Override
    public Ataque obtenerAtaque() {

        Ataque ataque= new Ataque("GenkiDama", 30);

        return ataque;
    }
}
