import java.util.*;

public class cuerdas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena:");
        String s = sc.nextLine();

        
        System.out.println("Prefijos:");
        generarYMostrarPrefijos(s);
        System.out.println("\nSufijos:");
        generarYMostrarSufijos(s);
        System.out.println("\nSubcadenas:");
        generarYMostrarSubcadenas(s);
        System.out.println("\nSubsecuencias:");
        generarYMostrarSubsecuencias(s, "");
    }

    static void generarYMostrarPrefijos(String s) {
        System.out.println("λ");
        for(int i = 1; i <= s.length(); i++) {
            System.out.println(s.substring(0, i));
        }
    }

    static void generarYMostrarSufijos(String s) {
        System.out.println("λ");
        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(i));
        }
    }

    static void generarYMostrarSubcadenas(String s) {
        System.out.println("λ");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }

    static void generarYMostrarSubsecuencias(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        generarYMostrarSubsecuencias(s.substring(1), ans + s.charAt(0));
        generarYMostrarSubsecuencias(s.substring(1), ans);
    }
}

