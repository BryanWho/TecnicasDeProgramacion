import java.util.Scanner;

public class App {
    public static void ejercicio1(int a,int b, int c){
        System.out.println("EJERCICIO 1");
        System.out.println("-----------------------------------------------------");
        System.out.println("a = " + a +", b = "+b+", c = "+c);
        System.out.println("a+b+c                   = " + a+b+c);
        System.out.println("2*b+3*(a-c)             = "+ 2*b+3*(a-c));
        System.out.println("a/b                     = " + a/b);
        System.out.println("a%b                     = " + a%b);
        System.out.println("a*b/c                   = " + a*b/c);
        System.out.println("a*(b/c)                 = " + a*(b/c));
        System.out.println("(a*c)%b                 = " + (a*c)%b);
        System.out.println("a*(c%b)                 = " + a*(c%b));
        System.out.println("(3*a-2*b)%(2*a-c)       = " + (3*a-2*b)%(2*a-c));
        System.out.println("2*(a/5+(4-b*3))%(a+c-2) = " + 2*(a/5+(4-b*3))%(a+c-2));
        System.out.println("(a-3*b)%(c+2*a)/(a-c)   = " + (a-3*b)%(c+2*a)/(a-c));
        System.out.println("a-b-c*2                 = " + (a-b-c*2));
      }
    
      public static void ejercicio2(double x, double y, double z){
        System.out.println("EJERCICIO 2");
        System.out.println("-----------------------------------------------------");
        System.out.println("x = "+ x + ", y = " + y + ", z = " + z);
        System.out.println("x+y+z       = "+ x+y+z);
        System.out.println("2*y+3*(x-z) = " + 2*y+3*(x-z));
        System.out.println("x/y         = " + x/y);
        System.out.println("x%y         = " + x%y);
        System.out.println("x/(y+z)     = " + x/(y+z));
        System.out.println("(x/y)+z     = " + (x/y)+z);
        System.out.println("2*x/3*y     = " + 2*x/3*y);
        System.out.println("x*y%z       = " + x*y%z);
        System.out.println("x*(y%z)     = " + x*(y%z));
        System.out.println("3*x-z-2*x   = " + (3*x-z-2*x));
        System.out.println("2*x/5%y     = " + 2*x/5%y);
        System.out.println("x-100%y%z   = " + (x-100%y%z));
        System.out.println("x-y-z*2     = " + (x-y-z*2));
      }
    
      public static void ejercicio3(char c1, char c2, char c3){
        System.out.println("EJERCICIO 3");
        System.out.println("-----------------------------------------------------");
        System.out.println("c1 = " + c1 + ", c2 = " + c2 + ", c3 = " + c3);
        System.out.println("c1+1       = "+ c1+1);
        System.out.println("c1-c2+c3   = " + (c1-c2+c3));
        System.out.println("c2-2       = " + (c2-2));
        System.out.println("c3+'#'     = " + (c3+'#'));
        System.out.println("c1%c3      = " + (c1%c3));
        System.out.println("'2'+'2'    = " + ('2'+'2'));
        System.out.println("(c1/c2*c3) = " + (c1/c2*c3));
        System.out.println("3*c2       = " + (3*c2));
        System.out.println("'3'*c2     = " + ('3'*c2));
      }
    
    
      public static void ejercicio4(){
        System.out.println("EJERCICIO 4");
        System.out.println("-----------------------------------------------------");
        int valor = 0;
        valor = 28;
        valor += 10;
        System.out.println(--valor);
        System.out.println(++valor);
        System.out.println(valor++);
        System.out.println(valor--);
        System.out.println(valor);
      }
    
      public static void ejercicio5(int i, float f, char c){
        System.out.println("EJERCICIO 5");
        System.out.println("-----------------------------------------------------");
        System.out.println("i = " + i + ", f = "+ f + ", c = " + c);
        System.out.println("i>=6 && c!= 'w'            = " + (i>=6 && c!= 'w'));
        System.out.println("i>=6 || c!='w'             = " + (i>=6 || c!='w'));
        System.out.println("f<10 && i > 100            = " + (f<10 && i > 100));
        System.out.println("!(c!='p' || i%2==0)        = " + (!(c!='p' || i%2==0)));
        System.out.println("i+f <= 10                  = " + (i+f <= 10));
        System.out.println("i>=6 && c == 'w' && f == 5 = " + (i>=6 && c == 'w' && f == 5));
        System.out.println("c!= 'p' || i+f <= 10       = " + (c!= 'p' || i+f <= 10));
      }
      
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("1 - para ejercicio 1");
        System.out.println("2 - para ejercicio 2");
        System.out.println("3 - para ejercicio 3");
        System.out.println("3 - para ejercicio 3");
        System.out.println("4 - para ejercicio 4");
        System.out.println("5 - para ejercicio 5");
        int i = sc.nextInt();
        if (i ==1){
          ejercicio1(8,3,-5);
        }
        if (i==2){
          ejercicio2(88, 3.5, -5.2);
        }
        if (i==3){
          ejercicio3('E','5','?');
        }
        if (i==4){
          ejercicio4();
        }
        if (i==5){
          ejercicio5(7,5.5F,'w');
        }        
      }
    }