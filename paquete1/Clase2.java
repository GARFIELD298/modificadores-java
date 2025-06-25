package paquete1;

public class Clase2 extends Clase1{
    //Clase2 hereda de Clase1 y ambas estan en el mismo paquete
    //por eso Clase2 Puede usar los datos de Clase1 como si fueran suyos

    public void setData(){
        this.x = 12; //public 
        this.y = 9; //protec
        setZ(18); //private
        this.w = 18; //default

    }

    public String getData(){
            return "Datos de Clase2: x= " + this.x + " y= " + this.y + "z=" + getZ();
    }
    
}