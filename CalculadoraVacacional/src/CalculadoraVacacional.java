/*
 * Menu Calculadora
 * 1. Ingresar datos
 * 2. Suma
 * 3. Resta
 * 4. Multiplicación
 * 5. División
 * 6. Salir
 * 
 * No puede usar las opciones 2 a la 5 sin o ha ingresado datos
 * El programa debe permitirme ingresar datos cuantas veces quiera
 */
import java.util.Scanner;
public class CalculadoraVacacional {
    Scanner sc = new Scanner(System.in);
    double numero1 = 0;
    double numero2 = 0;
    boolean datosIngresados = false;

    public static void main(String[] args) throws Exception {
        CalculadoraVacacional obj = new CalculadoraVacacional();
        byte opcion = 0;
        do{
            obj.imprimirMenu();
            System.out.println("Ingrese una opción");
            opcion = Byte.parseByte(obj.sc.nextLine());
            if(opcion == 2 || opcion == 3  || opcion == 4 || opcion == 5){
                if(obj.datosIngresados == false){
                    System.out.println("No puede ingresar esta opción porque no se han ingresado datos");
                }else{
                    obj.ejecutarOpcion(opcion);
                }
            }else{
                obj.ejecutarOpcion(opcion);
            }
        }while(opcion != 6);
        
        
    }
    
    public void imprimirMenu(){
        System.out.println(" ------------------------------\n"+
            "|* Menu Calculadora            |\n"+
        " ------------------------------\n"+
        "   * 1. Ingresar datos\n"+
        "   * 2. Suma\n"+
        "   * 3. Resta\n"+
        "   * 4. Multiplicación\n"+
        "   * 5. División\n"+
        "   * 6. Salir\n"+
        " ------------------------------\n");
    }

    public void ejecutarOpcion(byte opc){
        switch(opc){
            case 1:
                System.out.println("Ingresó a la opción 1. Ingrese datos");
                ingresarDatos();
                break;
            
            case 2:
                System.out.println("Ingresó a la opción 2. Suma");
                double totalSuma = sumar(numero1, numero2);
                System.out.println(numero1 + " + " + numero2 + " = " + totalSuma);
                break;
            
            case 3:
                System.out.println("Ingresó a la opción 3. Resta");
                double totalResta = restar(numero1, numero2);
                System.out.println(numero1 + " + " + numero2 + " = " + totalResta);
                break;
            
            case 4:
                System.out.println("Ingresó a la opción 4. Multiplicación");
                double totalMultiplicacion = multiplicar(numero1, numero2);
                System.out.println(numero1 + " + " + numero2 + " = " + totalMultiplicacion);
                break;
            
            case 5:
                System.out.println("Ingresó a la opción 5. División");
                double totalDivision = dividir(numero1, numero2);
                System.out.println(numero1 + " + " + numero2 + " = " + totalDivision);
                break;
            
            case 6:
                System.out.println("Ingresó a la opción 6. Salir");
                System.exit(0);
                break;

            default:
                System.out.println("Opción incorrecta");
        }
    }

    public void ingresarDatos(){
        System.out.println("Ingrese el primer número");
        numero1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el segundo número");
        numero2 = Double.parseDouble(sc.nextLine());
        datosIngresados = true;
    }

    public double sumar(double x, double y){
        double resultado = 0;
        resultado = x + y;
        return resultado;
    }

    public double restar(double x, double y){
        double resultado = 0;
        resultado = x - y;
        return resultado;
    }

    public double multiplicar(double x, double y){
        double resultado = 0;
        resultado = x * y;
        return resultado;
    }

    public double dividir(double x, double y){
        double resultado = 0;
        if(y == 0){
            System.out.println("No se puede dividir entre cero");
        }else{
            resultado = x / y;
        }
        return resultado;
    }
}