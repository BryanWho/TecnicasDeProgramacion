public class GestionPersonas {
    public static void main(String[] args) throws Exception {
        byte edad = 10;
        //Persona persona1 = new Persona(edad, "Ana", 200000, true, "Azul");
        //System.out.println(persona1);
        GestionPersonas obj = new GestionPersonas();
        Persona[] listaPersonas = new Persona[2];
        obj.guardarPersonas(listaPersonas);
    }

    public void guardarPersonas(Persona[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese los datos: ");
            System.out.println("Id&edad&nombre&salario&feliz&color favorito");
            String entrada = sc.nextLine();
            String[] datos = entrada.split("&");
            int id = Integer.parseInt(datos[0]);
            byte edad = Byte.parseByte(datos[1]);
            String nombre = datos[2];
            double salario = Double.parseDouble(datos[3]);
            String feliz = datos[4];
            String colorFavorito = datos[5];
        }
    }

    public Persona buscarPersona(){

        return null;
    }
}
