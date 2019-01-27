package examen;

import examen.Estados.Estado;

public abstract class Personaje {

    protected int vida;

	
	public Personaje(){
	    this.vida = 100;
	}

    public void recibirAtaque(Ataque ataque) {
        ataque.daniarA(this);
    }

	public void restarVida(int danio) {
		this.vida -= danio;
	}

    public boolean tieneEstaVida(int vida){
	    return this.vida == vida;
    }

    public boolean tieneVidaLlena(){
	    return this.vida==100;
    }

    public void curar(){
	    this.vida=100;
    }
}
