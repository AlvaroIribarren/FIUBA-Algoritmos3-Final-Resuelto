package examen;

public class Ataque {
	private String nombreDeAtaque;
	private int danio;


	public Ataque(String nombreDeAtaque, int danio) {
		this.nombreDeAtaque = nombreDeAtaque;
		this.danio = danio;
	}

	public void daniarA(Personaje personaje) {
		personaje.restarVida(danio);
	}
}
