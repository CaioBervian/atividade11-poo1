package atividade;

public class Piramide {
	private static final float NULL = 0;
	private double raio;
	private double h;
	private int tipo;

	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}

	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public double g() {
	 double g = ((h*h)+ (raio*raio));
	 g = Math.sqrt(g);
	return g;
	}

	public double areatotal() {
		return areabase()+arealateral();
	}

	public double areabase() {
		return (raio+raio)*(raio+raio);
	}

	public double arealateral() {
		return 4*((g()*(raio+raio))/2);
		
	}
	public double areatriangulo() {
		return areatotal()/5;
	}


	public double latas() {
	return (double) ((litros()/18));
	}

	public double preco() {
		
		if(tipo == 1) {
			return (double) (127.90*Math.ceil((latas())));
		}
		if( tipo == 2) {
			return (double) (258.98*Math.ceil((latas())));
		}
		if (tipo == 3) {
			return (double) (344.34*Math.ceil((latas())));
		}
		return NULL;
	}

	public double volume() {
		return (areabase()*h)/3;
	}
	public double litros() {
		return (double) (areatotal()/4.76);
	}
	}