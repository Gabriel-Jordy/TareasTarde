package condicionales;

public class Metodos {
    
    Integer num1 = 0, num2 = 0;
    Double no1=0.0, no2=0.0, no3=0.0;
    Boolean f = true;
    Boolean e = false;
    
    double d=0,x1=0,x2=0;
    public void setIgual(int x, int y) {
        this.num1 = x;
        this.num2 = y;
        if (num1 == num2) {
            System.out.println("Los Numeros Son Iguales");

        } else {
            System.out.println("Los Numeros Son Diferentes");
        }
    }

    public void setMayor(int x, int y) {
         this.num1 = x;
        this.num2 = y;
        if (num1 > num2) {
            System.out.println("El numero 1 es Mayor");

        } else {
            System.out.println("El Numero 1 es Menor");
        }
    }

    public void setMenor(int x, int y) {
        
         this.num1 = x;
        this.num2 = y;
        if (num1 < num2) {
            System.out.println("El numero 1 es Menor");
        } else {
            System.out.println("El Numero 1 es Mayor");
        }
    }
    public void setMaximo(int x, int y) {
         this.num1 = x;
        this.num2 = y;
        if (num1 > num2) {
            System.out.println("El numero 1 es Maximo");

        } else {
            System.out.println("El Numero 1 es Minimo");
        }
    }
    public void setMinimo(int x, int y) {
      this.num1 = x;
        this.num2 = y;
        if (num1 < num2) {
            System.out.println("El numero 1 es Minimo");
        } else {
            System.out.println("El Numero 1 es Maximo");
        }
    }
    public void setRaizCuadrada(int x, int y){
        this.num1 = x;
        this.num2 = y;
        System.out.println("La Raiz Cuadrada del primer numero es: "+Math.sqrt(num1));
        System.out.println("La Raiz Cuadrada del Segundo numero es: "+Math.sqrt(num2));
    }
    public void setFucionCuadratica(double a, double b, double c){
         
        this.no1 = a;
        this.no2 = b;
        this.no3 = c;
        
        if(d<0){
            System.out.println("La Solucion No es REAL");
        }else{
            x1=(-b+Math.sqrt(d)/2*a);
            x2=(-b-Math.sqrt(d)/2*a);
            
            System.out.println("La formula es: "+x1+" "+x2);
        }
    }
    public void setResta(int x, int y){
       this.num1 = x;
        this.num2 = y;
        int rest;
        rest=x-y;
        System.out.println("La resta es: "+rest);
    }
    public void setSuma(int x, int y){
        this.num1 = x;
        this.num2 = y;
        int sum;
        sum=x+y;
        System.out.println("La suma es: "+sum);
    }
    public void setMultiplicacion(int x, int y){
         this.num1 = x;
        this.num2 = y;
        int multi;
        multi=x*y;
        System.out.println("La Multiplicacion es: "+multi);
    }
    public void setDivision(int x, int y){
         this.num1 = x;
        this.num2 = y;
        float divi;
        divi=x*y;
        System.out.println("La Division es: "+divi);
    }
     public void setAND(boolean f, boolean e){
         
          boolean a1 = f && f;
          boolean a2 = f && e;
          boolean a3 = e && f;
          boolean a4 = e && e;
          System.out.println();
          System.out.println("Tabla de verdad de la conjunción AND");
          System.out.println( f + "  - " + f + "  = " + a1 );
          System.out.println( f + "  - " + e + " = " + a2 );
          System.out.println( e + " - " + f + "  = " + a3 );
          System.out.println( e + " - " + e + " = " + a4 );
    }
   public void setOR(boolean f, boolean e){
         
          boolean a1 = f || f;
          boolean a2 = f || e;
          boolean a3 = e || f;
          boolean a4 = e || e;
          System.out.println();
          System.out.println("Tabla de verdad de la conjunción OR");
          System.out.println( f + "  - " + f + "  = " + a1 );
          System.out.println( f + "  - " + e + " = " + a2 );
          System.out.println( e + " - " + f + "  = " + a3 );
          System.out.println( e + " - " + e + " = " + a4 );
    }
   public void setNOT(boolean f, boolean e){
         
          boolean a1 =  !f ;
          boolean a2 =  !e ;
          System.out.println();
          System.out.println("Tabla de verdad de la conjunción NOT");
          System.out.println( f + " = " + a1 );
          System.out.println( e + " = " + a2 );
          
    }
}
