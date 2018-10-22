//: reusing/Beetle.java
// The full process of initialization.

// Orden de inicialización: ***
// 1- Variables static desde la clase base hasta las hijas
// 2- Instrucción del bloque main antes de creación objeto "Beetle()"
// CREACION OBJETO Beetle()
// 3- Variables (no static) del constructor
// 4- Código del constructor de la clase base
// 5- Variables (no static) del resto de clases hijas
// 6- Código de los constructores del resto de clases hijas



class Insect {

    private int i = 9; // *** 3
    protected int j;  // *** 3
    private  int x3 =
        printInit("static Insect.x3 initialized"); // *** 3

    private static int x1 =
        printInit("static Insect.x1 initialized"); // *** 1(a)
    
    Insect() {
        System.out.println("i = " + i + ", j = " + j);  // *** 4
        j = 39;
    }   
    
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect {

    private int k = printInit("Beetle.k initialized"); // *** 5
    private static int x2 =
        printInit("static Beetle.x2 initialized"); // *** 1(b)

    public Beetle() {
        System.out.println("k = " + k); // *** 6
        System.out.println("j = " + j);
    }

    public static void main(String[] args) {
        System.out.println("Beetle constructor"); // *** 2
        Beetle b = new Beetle();
    }
} /* Output:
static Insect.x1 initialized
static Beetle.x2 initialized
Beetle constructor
i = 9, j = 0
Beetle.k initialized
k = 47
j = 39
*///:~
