package condicionales;

public class Condicionales {
   
    public static void main(String[] args) {
       
         Metodos condicion = new Metodos();
        condicion.setIgual(10,8);
        condicion.setMayor(12,20);
        condicion.setMenor(55, 121);
        
        condicion.setMaximo(5, 2);
        condicion.setMinimo(7,3);
        condicion.setRaizCuadrada(81, 9);
        condicion.setFucionCuadratica(5, 3, 2);
        condicion.setResta(15, 8);
        condicion.setSuma(25, 84);
        condicion.setMultiplicacion(5, 7);
        condicion.setDivision(25, 5);
        
        condicion.setAND(true, false);
        condicion.setOR(true, false);
        condicion.setNOT(true, false);
        
    }
    
}
