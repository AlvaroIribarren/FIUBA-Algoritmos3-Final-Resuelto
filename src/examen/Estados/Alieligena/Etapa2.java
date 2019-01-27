package examen.Estados.Alieligena;

import examen.Ataque;

public class Etapa2 implements Alieligena {
    @Override
    public Ataque obtenerAtaque() {

        Ataque ataque= new Ataque("Supernova", 20);

        return ataque;
    }
}
