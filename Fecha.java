package ejemplofecha;
public class Fecha {
    private int dia;
    private int mes;
    private int anyo;

    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }
    
    public Fecha(){
        this(1,1,1900);
    }

  
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = (dia>=1 && dia<32)? dia:1;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = (mes>=1 && mes<=12)? mes:1;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = (anyo>=1900 && anyo<2020)? anyo:2000;
    }
    
    public String toString(String sep){
        return dia + sep + mes + sep + anyo;
    }
    
    public String toString(){
        return toString("/");
    }
    
    
}
