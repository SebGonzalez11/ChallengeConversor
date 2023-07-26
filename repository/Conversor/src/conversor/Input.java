package conversor;

import javax.swing.JOptionPane;

public class Input extends Acciones {
	
	public static void main(String[] args) {
		int opcion;
		do {
		// declaracion de la variable cantidad correspondiente a dinero
		

		
		// array de las opciones principales a convertir del programa
		String[] opciones = { "Monedas", "Temperatura" };
														
		// cuadro de dialogo para seleccionar cualquier opcion del array anterior
		String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión:", 
	//titulo de la ventana				              			lista    opcion predeterminada
				"Conversor", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		//Inicio del switch
		switch(seleccion) {
		
		case "Monedas":{
			
			//Validacion de entrada **SOLO NUMEROS**
			
			double cantidadDinero = 0.0;
	        boolean esNumerico = false;

	        while (!esNumerico) {
	        	
	        	//Excepcion
	            try {
	                String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir: ");
	                cantidadDinero = Double.parseDouble(input);
	                esNumerico = true;
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "¡Valor no válido!", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }
			
			//Array de opciones
			String[] conversionesDeMoneda = {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", 
					"De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euros a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"};
			
			//Seleccion de una opcion del array conversionesDeMoneda
			String seleccionMonedas = (String) JOptionPane.showInputDialog(null, "Elija las modenadas que deseas convertir tu dinero:","Monedas",
					JOptionPane.QUESTION_MESSAGE, null, conversionesDeMoneda, conversionesDeMoneda[0]);
			
			switch(seleccionMonedas) {
			
			case "De Pesos a Dólar":{
				Acciones moneda = new Acciones();
				moneda.PesoDolar(cantidadDinero);
				JOptionPane.showMessageDialog(null,"Tienes $" + moneda.resultado + " Dolares");
				break;
			}
			
			case "De Pesos a Euro":{
				Acciones moneda = new Acciones();
				moneda.PesoEuro(cantidadDinero);
				JOptionPane.showMessageDialog(null,"Tienes " + moneda.resultado + " Euros");
				break;
			}
			
			case "De Pesos a Libras":{
				Acciones moneda = new Acciones();
				moneda.PesoLibras(cantidadDinero);
				JOptionPane.showMessageDialog(null,"Tienes " + moneda.resultado + " Libras");
				break;
			}
			
			case "De Pesos a Yen":{
				Acciones moneda = new Acciones();
				moneda.PesoYen(cantidadDinero);
				JOptionPane.showMessageDialog(null,"Tienes " + moneda.resultado + " Yenes");
				break;
			}
			
			case "De Pesos a Won Coreano":{
				Acciones moneda = new Acciones();
				moneda.PesoWon(cantidadDinero);
				JOptionPane.showMessageDialog(null,"Tienes " + moneda.resultado + " Wones");
				break;
			}
			
			case "De Dólar a Pesos":{
				Acciones moneda = new Acciones();
				moneda.DolarPeso(cantidadDinero);
				JOptionPane.showMessageDialog(null,"Tienes " + moneda.resultado + " Pesos");
				break;
			}
			
			case "De Euros a Pesos":{
				Acciones moneda = new Acciones();
				moneda.EuroPeso(cantidadDinero);
				JOptionPane.showMessageDialog(null,"Tienes " + moneda.resultado + " Pesos");
				break;
			}
			
			case "De Libras a Pesos":{
				Acciones moneda = new Acciones();
				moneda.LibraPeso(cantidadDinero);
				JOptionPane.showMessageDialog(null,"Tienes " + moneda.resultado + " Pesos");
				break;
			}
			
			case "De Yen a Pesos":{
				Acciones moneda = new Acciones();
				moneda.YenPeso(cantidadDinero);
				JOptionPane.showMessageDialog(null,"Tienes " + moneda.resultado + " Pesos");
				break;
			}
			
			case "De Won Coreano a Pesos":{
				Acciones moneda = new Acciones();
				moneda.WonPeso(cantidadDinero);
				JOptionPane.showMessageDialog(null,"Tienes " + moneda.resultado + " Pesos");
				break;
			}
			
			}} // fin del caso  seleccion de monedas
			break;
		 // fin del caso Monedas
		
		case "Temperatura":{
			
			//Validacion de entrada **SOLO NUMEROS**
			
			double tempIngresada = 0.0;
	        boolean esNumerico = false;

	        while (!esNumerico) {
	        	
	        	//Excepcion
	            try {
	                String input = JOptionPane.showInputDialog("Ingrese la temperatura que desea convertir: ");
	                tempIngresada = Double.parseDouble(input);
	                esNumerico = true;
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "¡Valor no válido!", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	        
	      //Array de opciones
			String[] conversionesDeTemperatura = {"Celcius a Fahrenheit", "Celcius a Kelvin", "Fahreheit a Celcius", 
					"Fahreheit a Kelvin", "Kelvin a Celcius", "Kelvin a Fahreheit"};
			
			//Seleccion de una opcion del array conversionesDeTemperatura
			String seleccionTemperatura = (String) JOptionPane.showInputDialog(null, "Elija la opción que desee:","Temperaturas", 
					JOptionPane.QUESTION_MESSAGE, null, conversionesDeTemperatura, conversionesDeTemperatura[0]);
			
			switch(seleccionTemperatura) {
			
			case "Celcius a Fahrenheit":{
				Acciones temperaturaIngresada = new Acciones();
				temperaturaIngresada.CaF(tempIngresada);
				JOptionPane.showMessageDialog(null, temperaturaIngresada.resultado + " Fahrenheit");
				break;
			}
			
			case "Celcius a Kelvin":{
				Acciones temperaturaIngresada = new Acciones();
				temperaturaIngresada.CaK(tempIngresada);
				JOptionPane.showMessageDialog(null,temperaturaIngresada.resultado + " Kelvin");
				break;
			}
			
			case "Fahreheit a Celcius":{
				Acciones temperaturaIngresada = new Acciones();
				temperaturaIngresada.FaC(tempIngresada);
				JOptionPane.showMessageDialog(null,temperaturaIngresada.resultado + " Celcius");
				break;
			}
			
			case "Fahreheit a Kelvin":{
				Acciones temperaturaIngresada = new Acciones();
				temperaturaIngresada.Fak(tempIngresada);
				JOptionPane.showMessageDialog(null,temperaturaIngresada.resultado + " Kelvin");
				break;
			}
			
			case "Kelvin a Celcius":{
				Acciones temperaturaIngresada = new Acciones();
				temperaturaIngresada.KaC(tempIngresada);
				JOptionPane.showMessageDialog(null,temperaturaIngresada.resultado + " Celcius");
				break;
			}
			
			case "Kelvin a Fahreheit":{
				Acciones temperaturaIngresada = new Acciones();
				temperaturaIngresada.KaF(tempIngresada);
				JOptionPane.showMessageDialog(null,temperaturaIngresada.resultado + " Fahrenheit");
				break;
			}
			
			} //Fin del switch seleccionTemperatura
			
		} //Fin del sitch Temperatura
			
			
			
		} // Fin de switch seleccion
		
		 opcion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?");
		
		}while(opcion == JOptionPane.YES_OPTION);
		
		if (opcion == JOptionPane.YES_OPTION) {
		    // El usuario hizo clic en "Sí"
		} else if (opcion == JOptionPane.NO_OPTION) {
		    // El usuario hizo clic en "No"
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
		} else {
		    // El usuario cerró el cuadro de diálogo o hizo clic en "Cancelar"
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
		}}

	} //Fin de main

 //Fin de la clase input
