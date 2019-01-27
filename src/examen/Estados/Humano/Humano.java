package examen.Estados.Humano;

import examen.Ataque;
import examen.Estados.Estado;

    public interface Humano extends Estado {

        public Ataque obtenerAtaque();
}
