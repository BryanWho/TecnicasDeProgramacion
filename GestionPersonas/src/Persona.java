public class Persona {
    private byte edad;
    private String nombre;
    private double salario;
    private boolean feliz;
    private String colorFavorito;

/* CONSTRUCTOR

 * TODAS las clases en Java tienen un constructor implícito
 * ese constructor implícito NO recibe parámetros
 * Es decir, que existe, pero no lo vemos.
 * Yo puedo definir mis propios constructores
 * El constructor es un método
 * ** El modificador de acceso es public
 * ** tiene exactamente el mismo nombre de la clase
 * ** puede recibir uno o más parámetros
 * ** el constructor NO retorna nada, ni siquiera void-
*/
    public Persona(byte edad, String nombre, double salario, boolean feliz, String colorFavorito){
        this.edad = edad;
        this.nombre = nombre;
        this.salario = salario;
        this.feliz = feliz;
        this.colorFavorito = colorFavorito;
    }

    // TODAS las clases en Java heredan de Object
    // el método toString está en la clase Object
    @Override
    public String toString() {
        return "Persona [colorFavorito=" + colorFavorito + ", edad=" + edad + ", feliz=" + feliz + ", nombre=" + nombre
                + ", salario=" + salario + "]";
    }

}
