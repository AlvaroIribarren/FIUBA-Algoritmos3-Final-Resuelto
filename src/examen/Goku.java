package examen;

import examen.Estados.Humano.Humano;
import examen.Estados.Humano.Saiyajin;
import examen.Estados.Humano.SuperSaiyajin;

public class Goku extends Personaje {

	private Humano estado;

	public Goku(){
		super();
		this.estado = new Saiyajin();
	}

	public void furia(){
		this.estado = new SuperSaiyajin();
	}

	public void atacar(Freezer enemigo){
		enemigo.recibirAtaque(estado.obtenerAtaque());
	}

	public void atacar(Goku goku){}


}
