
package vehiculo;

/**
 *Clase que representa un vehículo.
 * Los objetos de esta clase tienen atributos para almacenar la información necesaria y operar con ésta.
 * @author IES Aguadulce
 */
public class VehiculoBermudezGarciaJoseAntonio2223 {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /* Constructor sin argumentos */

  /**
   *Constructor sin parámetros, simplemente reservará memoria para el objeto
   * 
   */

    public VehiculoBermudezGarciaJoseAntonio2223 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
  /**
   *Crea un objeto VehiculoBermudezGarciaJoseAntonio2223 con un nombre,precio y stock
   * @param nom nombre-marca del vehículo
   * @param precio precio del vehículo
   * @param stock stock de vehículos
   */
  public VehiculoBermudezGarciaJoseAntonio2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   // Método para asignar el nombre del vehiculo

  /**
   * Asigna el nombre del vehiculo
   * @param nom nombre que se asignará
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    // Método que me devuelve el nombre del vehiculo

  /**
   *Devuelve el nombre del vehículo
   * @return nombre del vehículo
   */
    public String obtenerNombre()
    {
        return nombre;
    }

    // Método que me devuelve el stock de vehiculos disponible en cada momento

  /**
   *Devuelve el stock que existe 
   * @return cantidad de vehículos
   */
     public int obtenerStock ()
    {
        return stock;
    }

    /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     */

  /**
   *Compra una cantidad de vehículos sumándolos al stock que hubiera anteriormente
   * @param cantidad de vechiculos comprados
   * @throws Exception si la cantidad es inferior a 0
   */

    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(stock + cantidad);
    }

  /**
   *Vende una cantidad de vehículos actualizando el stock
   * @param cantidad de vehículos a vender
   * @throws Exception si la cantidad es menor o igual a 0 o si fuera mayor que el stock actual
   */
  public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(stock - cantidad);
    }

  /** 
   * Devuelve el precio del vehículo
   * @return el precio
   */
  public double getPrecio() {
    return precio;
  }

  /** 
   * Asigna el precio del vehículo
   * @param precio el precio que será asignado
   */
  public void setPrecio(double precio) {
    this.precio = precio;
  }

  /** 
   * Devuelve el precio del IVA
   * @return  precio del IVA
   */
  public double getPrecioIVA() {
    return precioIVA;
  }

  /** 
   * Asigna el precio del IVA
   * @param precioIVA el precio del IVA que será asignado
   */
  public void setPrecioIVA(double precioIVA) {
    this.precioIVA = precioIVA;
  }

  /** 
   * Asigna el stock de vehículos
   * @param stock el stock que será asignado
   */
  public void setStock(int stock) {
    this.stock = stock;
  }
    
}  
   
    

