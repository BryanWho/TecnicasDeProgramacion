import java.util.Scanner;

public class GestionBicicletas {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Bicicleta bicicleta1 = new Bicicleta("Specialized", "Ruta", "Rojo", "Ultegra", "Mavic");
        //System.out.println(bicicleta1);
        GestionBicicletas obj = new GestionBicicletas();
        Bicicleta[] listBicicletas = new Bicicleta[2];
        obj.guardarBicicletas(listBicicletas);
        System.out.println("Ingrese Id");
        int idBuscado = Integer.parseInt(obj.sc.nextLine());
        if(obj.buscarBicicleta(idBuscado, listBicicletas == null)){
            System.out.println("No se encuentra");
        }
        else{
            System.out.println("Encontrado");
        }
    }

    public void guardarBicicletas(Bicicleta[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese los datos por &: ");
            System.out.println("Id&marca&modalidad&color&grupo&ruedas");
            String entrada = sc.nextLine();
            String[] datos = entrada.split("&");
            int id = Integer.parseInt(datos[0]);
            String marca = datos[1];
            String tipoModalidad = datos[2];
            String color = datos[3];
            String tipoGrupo = datos[4];
            String marcaRuedas = datos[5];
            Bicicleta bicicletaCopia = new Bicicleta(id, marca, tipoModalidad, color, tipoGrupo, marcaRuedas);
            arreglo[i] = bicicletaCopia;
        }
    }

    public Bicicleta buscarBicicleta(int id, Bicicleta[] arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            if(id == arreglo[i].getId()){
                return arreglo[i];
            }
        }
    }
}
