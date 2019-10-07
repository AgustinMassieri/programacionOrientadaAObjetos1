package domain;

public class Empleado {
	private int cantidadDeFaltas = 0;
	private double valorDelBonoPorPresentismo = 0;
	private double valorDelBonoPorResultados = 0;
	private double neto = 0;
	private Categoria categoria = null;
	private Presentismo bonoPorPresentismo = null; 
	private Resultados bonoPorResultados = null;

	@Override
	public String toString() {
		return "Empleado [cantidadDeFaltas=" + cantidadDeFaltas + ", valorDelBonoPorPresentismo="
				+ valorDelBonoPorPresentismo + ", valorDelBonoPorResultados=" + valorDelBonoPorResultados + ", neto="
				+ neto + ", categoria=" + categoria + " Sueldo = " + getSueldo() + "]";
	}

	public Empleado(Categoria categoria, Presentismo bonoPorPresentismo, Resultados bonoPorResultados) {
		cantidadDeFaltas = 0;
		setCategoria(categoria);
		setBonoPorPresentismo(bonoPorPresentismo);
		setBonoPorResultados(bonoPorResultados);
	}

	public int getCantidadDeFaltas() {
		return cantidadDeFaltas;
	}

	public void setCantidadDeFaltas(int cantidadDeFaltas) {
		if(cantidadDeFaltas >= 0)
			this.cantidadDeFaltas = cantidadDeFaltas;
		
		setValorDelBonoPorPresentismo(bonoPorPresentismo.getValor(this));
	}

	public double getValorDelBonoPorPresentismo() {
		return valorDelBonoPorPresentismo;
	}

	private void setValorDelBonoPorPresentismo(double valorDelBonoPorPresentismo) {
		this.valorDelBonoPorPresentismo = valorDelBonoPorPresentismo;
	}

	public double getValorDelBonoPorResultados() {
		return valorDelBonoPorResultados;
	}

	private void setValorDelBonoPorResultados(double valorDelBonoPorResultados) {
		this.valorDelBonoPorResultados = valorDelBonoPorResultados;
	}

	public double getNeto() {
		return neto;
	}

	private void setNeto(double neto) {
		this.neto = neto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
		setNeto(categoria.getNeto());
	}

	public Presentismo getBonoPorPresentismo() {
		return bonoPorPresentismo;
	}

	public void setBonoPorPresentismo(Presentismo bonoPorPresentismo) {
		this.bonoPorPresentismo = bonoPorPresentismo;
		setValorDelBonoPorPresentismo(bonoPorPresentismo.getValor(this));
	}

	public Resultados getBonoPorResultados() {
		return bonoPorResultados;
	}

	public void setBonoPorResultados(Resultados bonoPorResultados) {
		this.bonoPorResultados = bonoPorResultados;
		setValorDelBonoPorResultados(bonoPorResultados.getValor(this));
	}
	
	public void incrementarFaltas() {
		setCantidadDeFaltas(cantidadDeFaltas + 1);
	}
	
	public double getSueldo() {
		double valorDelSuelo = neto + valorDelBonoPorPresentismo + valorDelBonoPorResultados;
		return valorDelSuelo;
	}
	
}
	