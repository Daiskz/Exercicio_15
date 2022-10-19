import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quanto você recebe por hora em R$: ");
        double salarioHora = entrada.nextDouble();
        System.out.println("Informe quantas horas você trabalha em um mês: ");
        double horasTrabalhas = entrada.nextDouble();
        double salarioBruto = salarioHora * horasTrabalhas;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
        System.out.println("O seu salário bruto é de: " + salarioBruto + "R$");
        System.out.println("Descontando 11% de imposto de renda é totalizado: " + impostoRenda + "R$");
        System.out.println("Descontando 8% de INSS é totalizado: " + inss + "R$");
        System.out.println("Descontando 5% do sindicato é totalizado: " + sindicato + "R$");
        System.out.println("O seu salário líquido é de: " + salarioLiquido + "R$");
    }
}
