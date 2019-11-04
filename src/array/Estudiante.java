package array;

public class Estudiante {
	private int carne;
	private Double numcredito;
	private Double vcredito;
	private Double pordescuento;
	private Double veces;
	private Double matricula;

	

	public Estudiante(int carne, Double numcredito, Double vcredito, Double pordescuento, Double veces,
			Double matricula) {
		super();
		this.carne = carne;
		this.numcredito = numcredito;
		this.vcredito = vcredito;
		this.pordescuento = pordescuento;
		this.veces = veces;
		this.matricula = matricula;
	}

	public Double getMatricula() {
		return matricula;

	}

	public void setMatricula(Double matricula) {
		this.matricula = matricula;
	}

	public int getCarne() {
		return carne;
	}

	public void setCarne(int carne) {
		this.carne = carne;
	}

	public Double getNumcredito() {
		return numcredito;
	}

	public void setNumcredito(Double numcredito) {
		this.numcredito = numcredito;
	}

	public Double getVcredito() {
		return vcredito;
	}

	public void setVcredito(Double vcredito) {
		vcredito = vcredito;
	}

	public Double getPordescuento() {
		return pordescuento;
	}

	public void setPordescuento(Double pordescuento) {
		this.pordescuento = pordescuento;
	}

	public Double getVeces() {
		return veces;
	}

	public void setVeces(Double veces) {
		this.veces = veces;
	}

	@Override
	public String toString() {
		return "Estudiante [carne=" + carne + ", numcredito=" + numcredito + ", vcredito=" + vcredito
				+ ", pordescuento=" + pordescuento + ", veces=" + veces + ", matricula=" + matricula + "]";
	}


	

}
