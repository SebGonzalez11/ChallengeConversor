package conversor;

public class Acciones {
	double cantidad, valorDolar = 0.059, valorEuro = 0.053, valorLibras = 0.046, valorYen = 8.35, 
			valorWonCoreano = 75.73, valorPesoDolar = 16.99, valorPesoEuro = 18.9, valorPesoLibras = 21.84,
					valorPesoYen = 0.12, valorPesoWon = 0.013, resultado;
	
	
	public void PesoDolar(double cantidad) {
		this.resultado = cantidad * valorDolar; 
	}
	
	public void PesoEuro(double cantidad) {
		this.resultado = cantidad * valorEuro; 
	}
	
	public void PesoLibras(double cantidad) {
		this.resultado = cantidad * valorLibras; 
	}
	
	public void PesoYen(double cantidad) {
		this.resultado = cantidad * valorYen; 
	}
	
	public void PesoWon(double cantidad) {
		this.resultado = cantidad * valorWonCoreano; 
	}
	
	public void DolarPeso(double cantidad) {
		this.resultado = cantidad * valorPesoDolar; 
	}
	
	public void EuroPeso(double cantidad) {
		this.resultado = cantidad * valorPesoEuro; 
	}
	
	public void LibraPeso(double cantidad) {
		this.resultado = cantidad * valorPesoLibras; 
	}
	
	public void YenPeso(double cantidad) {
		this.resultado = cantidad * valorPesoYen; 
	}
	
	public void WonPeso(double cantidad) {
		this.resultado = cantidad * valorPesoWon; 
	}
	
	
	
	//Acciones para temperatura
	
	public void CaF(double tempIngresada) {
		this.resultado = (tempIngresada * 1.8) + 32;
	}
	
	public void CaK(double tempIngresada) {
		this.resultado = tempIngresada + 273.15;
	}
	
	public void FaC(double tempIngresada) {
		this.resultado = (tempIngresada - 32) / 1.8;
	}
	
	public void Fak(double tempIngresada) {
		this.resultado = (tempIngresada + 459.67) / 1.8;
	}
	
	public void KaC(double tempIngresada) {
		this.resultado = tempIngresada- 273.15;
	}
	
	public void KaF(double tempIngresada) {
		this.resultado = 9 * tempIngresada - 459.67;
	}
	
}
