package ejemplofecha;

public class EjemploFecha {

    public static void main(String[] args) {
        
        Fecha f1 = new Fecha(5,9,200);
        System.out.println(f1);
        System.out.println(new Fecha(2,5,2003));
        System.out.println(f1.toString("."));
 
       
    }
    
}
