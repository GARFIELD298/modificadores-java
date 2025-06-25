import paquete1.Clase2;

public class TestingModificadores {
    public static void main(String[] args) {
        Padre papa = new Padre();  
        Hijo chamaco = new Hijo();
        Hijo chamaca = new Hijo();
        Clase2 objeto2 = new Clase2();
        
        //asignar valores a mienbros de la clase Padre
        //asignar valores es un metodo de acceso a los miembros 
        papa.setVariable2(12); //propiedad privada
        papa.variable1 = 25; //propiedad publica

        //leer valores dde los miembros de la clase Padre
        //Leer valores es otro método de acceso a los miembros
        System.err.println("Variable de la variable2: " + papa.getVariable2());
        System.err.println("Valor de variable1: " + papa.variable1);

        chamaco.setVariable3(18);
        chamaco.setVarsPadre();
        System.out.println("Info del chamaco: " + chamaco.toString());

        chamaca.setVariable3(98);
        chamaca.variable1 = 32; //modificacion desde testing
        chamaca.setVariable2(29);
        System.out.println("Info de la chamaca: " + chamaca.toString());

        System.out.println();
        objeto2.x = 500;
        //Esto no se puede hacer por que y es preotectec y testing 
        //esta en otro paquete 
        //objeto2.y = 1000;

        objeto2.setZ(48);
        System.err.println(objeto2.getData());
        
    }
}
