public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo :D");
        
        // Enteros
        byte edad = 127;
        short anio = 2017;
        int id = 100001;
        long id_twitter = 123123123123123123L; // se debe poner L despues del numero

        // Decimales
        float diametro = 34.35F; //Se debe postponer F para declarar el float
        double precio = 45.12312312312312312312;

        // Caracter
        char genero = 'F'; // Usar comillas simples
  
        // Logicos
        boolean isVisible = true; 
        boolean funciona = false;

        // Naming
        // Para constantes usar mayusculas y "_" para separa palabras
        byte VALOR_MAXIMO = 3;
        
        // Casteo
        // Casteo Implicito 
        byte b = 6;
        short s = b;

        b = (byte) s;

        int i = 1;
        double d = 2.5;
        i = (int) d;

        // Arreglos

        int[] arregloInt = new int[3];
        double[] arregloDouble;

        int[][] array2D = new int[2][3];
        int[][][] array3D = new int[3][3][2];

        // inicializar arreglo con valores, se puede asignar dinamicamente
        char[][] days = {{'M','T','T'}, {}};

        for (char[] c : days) {
          System.out.println(c);
        }
       

    }
}
