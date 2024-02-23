import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc=new Calculatrice();
        
        while (true) {
            System.out.println("Choisissez une opération :");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quitter");
            
            int choix = scanner.nextInt();
            
            if (choix == 5) {
                break;
            }
            
            System.out.println("Entrez le premier nombre :");
            double a = scanner.nextDouble();
            System.out.println("Entrez le deuxième nombre :");
            double b = scanner.nextDouble();
            
            try {
                switch (choix) {
                    case 1:
                        System.out.println("Résultat : " + calc.addition(a, b));
                        break;
                    case 2:
                        System.out.println("Résultat : " + calc.soustraction(a, b));
                        break;
                    case 3:
                        System.out.println("Résultat : " + calc.multiplication(a, b));
                        break;
                    case 4:
                        System.out.println("Résultat : " + calc.division(a, b));
                        break;
                    default:
                        System.out.println("Choix invalide !");
                }
            } catch (ArithmeticException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}