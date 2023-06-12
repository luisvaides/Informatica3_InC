import java.util.*;

public class cuerdas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena:");
        String s = sc.nextLine();

        
        System.out.println("Prefijos:");
        Prefijos(s);
        System.out.println("\nSufijos:");
        Sufijos(s);
        System.out.println("\nSubcadenas:");
        Subcadenas(s);
        System.out.println("\nSubsecuencias:");
        Subsecuencias(s, "");
    }

    static void Prefijos(String s) {
        System.out.println("λ");
        for(int i = 1; i <= s.length(); i++) {
            System.out.println(s.substring(0, i));
        }
    }

    static void Sufijos(String s) {
        System.out.println("λ");
        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(i));
        }
    }

    static void Subcadenas(String s) {
        System.out.println("λ");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }

    static void Subsecuencias(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        Subsecuencias(s.substring(1), ans + s.charAt(0));
        Subsecuencias(s.substring(1), ans);
    }
}

