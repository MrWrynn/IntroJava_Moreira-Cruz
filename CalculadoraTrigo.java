import java.util.Scanner;

class CalculadoraTrigonometrica {
    public static void main(String[] args)
    {
        Scanner lr= new Scanner(System.in);
        double num1=0;
        System.out.println("Escriba el número de la operación que desea realizar");

        System.out.println("(1) Para Operaciones trigonométricas básicas");
        System.out.println("(2) Para Operaciones trigonométricas inversas");
        System.out.println("(3) Para Operaciones trigonométricas  hiperbólicas");
        char opcion = lr.next().charAt(0);

        switch(opcion)
        {
            case '1':
                System.out.println("Operaciones trigonométricas básicas");
                System.out.println("Ingrese el ángulo: ");
                num1=lr.nextDouble();
                double angle = Math.toRadians(num1);
                System.out.println("Seno: " + Math.sin(angle));
                System.out.println("Coseno: " + Math.cos(angle));
                System.out.println("Tangente: " + Math.tan(angle));
                break;
            case '2':
                System.out.println("Operaciones trigonométricas inversas");
                System.out.println("Ingrese el valor: ");
                num1=lr.nextDouble();
                double Arcoseno = Math.asin(num1);
                double angulo1 = Math.toDegrees(Arcoseno);
                System.out.println("Arcoseno: "+(angulo1));
                double Arcocoseno = Math.acos(num1);
                double angulo2 = Math.toDegrees(Arcocoseno);
                System.out.println("Arcocoseno: "+(angulo2));
                double Arcotangente = Math.atan(num1);
                double angulo3 = Math.toDegrees(Arcotangente);
                System.out.println("Arcotangente: "+(angulo3));
                break;
            case '3':
                System.out.println("Operaciones trigonométricas hiperbólicas");
                System.out.println("Ingrese el ángulo: ");
                num1=lr.nextDouble();
                double e=Math.E;
                double numeradorcosh= Math.pow(e, num1)-Math.pow(e, -num1);
                double numeradorsinh= Math.pow(e, num1)+Math.pow(e, -num1);
                double cosh=(numeradorcosh/2);
                double sinh=(numeradorsinh/2);
                double tanh=(numeradorcosh/numeradorsinh);
                System.out.println("Cosh: "+cosh);
                System.out.println("Sinh: "+sinh);
                System.out.println("Tanh: "+tanh);
                break;
            

        }
    }

}
