
package vehiculo;

/**
 *Clase main del proyecto,  crea un objeto de la clase Vehiculo con unos parámetros y realiza 
 * acciones de vender y comprar
 * @author IES Aguadulce
 */
public class Main {
    
  /**
   * método principal para la ejecución del proyecto
   * @param args
   */
  public static void main(String[] args) {
        //declaración objeto
        VehiculoBermudezGarciaJoseAntonio2223 miVehiculoBermudezGarciaJoseAntonio2223;
        int stockActual; 
        //instanciación del objeto
        miVehiculoBermudezGarciaJoseAntonio2223 = new VehiculoBermudezGarciaJoseAntonio2223("Seat",18000,100);
       
        operativaVehiculosBermudezGarciaJoseAntonio2223(miVehiculoBermudezGarciaJoseAntonio2223, 50);
        stockActual = miVehiculoBermudezGarciaJoseAntonio2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }
  
/**
 * método que engloba las acciones de comprar y vender
 * @param miVehiculo objeto de la clase VehiculoBermudezGarciaJoseAntonio2223
 * @param cantidad cantidad para comparar o vender
 */
  private static void operativaVehiculosBermudezGarciaJoseAntonio2223(VehiculoBermudezGarciaJoseAntonio2223 miVehiculo, int cantidad) {
    /*
    Intenta vender 20 unidades, si no hubiera cantidad suficiente o el número fuera negatio saltará la excepción y no se modificará el stock
    */
    try
    {
      System.out.println("Venta de Vehiculos");
      miVehiculo.vender(20);
    } catch (Exception e)
    {
      System.out.print("Fallo al vender");
    }
    /*
    Intenta comprar 100 unidades, si la cantidad fuera menor a 0 saltará la excepción y no se modificará el stock
    */
    try
    {
      System.out.println("Compra de Vehiculos");
      miVehiculo.comprar(100);
    } catch (Exception e)
    {
      System.out.print("Fallo al comprar");
    }
  }

}
    
