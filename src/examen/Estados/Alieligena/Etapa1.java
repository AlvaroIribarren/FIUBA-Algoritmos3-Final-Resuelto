package examen.Estados.Alieligena;

import examen.Ataque;

public class Etapa1 implements Alieligena {
    @Override
    public Ataque obtenerAtaque() {
        Ataque ataque= new Ataque("Cosegan", 10);

        return ataque;
    }
}
