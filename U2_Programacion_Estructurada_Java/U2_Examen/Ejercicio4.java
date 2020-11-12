package Examen;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Seleccione su cargo");
        System.out.println(" 1.programador junior   2.programador senior    3.jefe de proyecto");
        int num = teclado.nextInt();
        System.out.println("Estado civil " + "  1. Soltero" + " 2. Casado");
        int status = teclado.nextInt();

        if (num == 1 && status == 1) {
            System.out.println("Su sueldo base es " + 950);

            System.out.println("Introduzca sus dietas");
            int diet = teclado.nextInt();
            System.out.println("Su extra por dieta sera " + (diet * 30));
            System.out.println("Su sueldo bruto es de " + ((((diet * 30))) + 950));
            System.out.println("Retencion de IRPF (25%) " + ((((950 + (diet * 30)) * 25 / 100))));
            System.out.println("Su sueldo neto sera " + (((950 + ((950 + (diet * 30))))) - ((((950 + (diet * 30))) * 25 / 100))));
        } else if (num == 1 && status == 2) {
            System.out.println("Su sueldo base es " + 950);

            System.out.println("Introduzca sus dietas");
            int diet = teclado.nextInt();
            System.out.println("Su extra por dieta sera " + (diet * 30));
            System.out.println("Su sueldo bruto es de " + ((((diet * 30))) + 950));
            System.out.println("Retencion de IRPF (20%) " + ((((950 + (diet * 30)) * 20 / 100))));
            System.out.println("Su sueldo neto sera " + (((((950 + (diet * 30))))) - ((((950 + (diet * 30))) * 20 / 100))));
        }
        if (num == 2 && status == 1) {
            System.out.println("Su sueldo base es " + 1200);

            System.out.println("Introduzca sus dietas");
            int diet = teclado.nextInt();
            System.out.println("Su extra por dieta sera " + (diet * 30));
            System.out.println("Su sueldo bruto es de " + (((1200 + (diet * 30)))));
            System.out.println("Retencion de IRPF (25%) " + ((((1200 + (diet * 30)) * 25 / 100))));
            System.out.println("Su sueldo neto sera " + (((((1200 + (diet * 30))))) - ((((1200 + (diet * 30))) * 25 / 100))));
        }
        if (num == 2 && status == 2) {
            System.out.println("Su sueldo base es " + 1200);

            System.out.println("Introduzca sus dietas");
            int diet = teclado.nextInt();
            System.out.println("Su extra por dieta sera " + (diet * 30));
            System.out.println("Su sueldo bruto es de " + (((1200 + (diet * 30)))));
            System.out.println("Retencion de IRPF (20%) " + ((((1200 + (diet * 30)) * 20 / 100))));
            System.out.println("Su sueldo neto sera " + (((((1200 + (diet * 30))))) - ((((1200 + (diet * 30))) * 20 / 100))));
        }
        if (num == 3 && status == 1) {
            System.out.println("Su sueldo base es " + 1600);

            System.out.println("Introduzca sus dietas");
            int diet = teclado.nextInt();
            System.out.println("Su extra por dieta sera " + (diet * 30));
            System.out.println("Su sueldo bruto es de " + (((1600 + (diet * 30)))));
            System.out.println("Retencion de IRPF (25%) " + ((((1600 + (diet * 30)) * 25 / 100))));
            System.out.println("Su sueldo neto sera " + (((((1600 + (diet * 30))))) - ((((1600 + (diet * 30))) * 25 / 100))));
        }
        if (num == 3 && status == 2) {
            System.out.println("Su sueldo base es " + 1600);

            System.out.println("Introduzca sus dietas");
            int diet = teclado.nextInt();
            System.out.println("Su extra por dieta sera " + (diet * 30));
            System.out.println("Su sueldo bruto es de " + (((1600 + (diet * 30)))));
            System.out.println("Retencion de IRPF (20%) " + ((((1600 + (diet * 30)) * 20 / 100))));
            System.out.println("Su sueldo neto sera " + (((((1600 + (diet * 30))))) - ((((1600 + (diet * 30))) * 20 / 100))));
        }
    }
}
