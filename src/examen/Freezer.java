package examen;

import examen.Estados.Alieligena.Alieligena;
import examen.Estados.Alieligena.Etapa1;
import examen.Estados.Alieligena.Etapa2;

public class Freezer extends Personaje {
	
	private  Alieligena estado;
	
	public Freezer(){
		super();
		this.estado= new Etapa1();
	}
	
	public void atacar(Goku enemigo){
		enemigo.recibirAtaque(this.estado.obtenerAtaque());
	}

	public void atacar(Freezer freezer){}

	@Override
	public void recibirAtaque(Ataque ataque) {
		ataque.daniarA(this);
		actualizarEstado();
	}

	public void actualizarEstado(){
		if(this.vida <= 40){
			this.estado= new Etapa2();
		}
		else{
			this.estado= new Etapa1();
		}
	}
	
	
}
