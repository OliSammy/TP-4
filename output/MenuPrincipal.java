package output;

import java.util.Scanner;

public class MenuPrincipal {
    int opcao;
    Scanner inputString = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    MenuMedico menuMedico = new MenuMedico();

    public MenuPrincipal() {
        menuMedico = new MenuMedico();
    }

    public void Inicio() throws Exception {
        while (true) {
            System.out.println("\nBem-Vindo à Clinica dos Viados");
            System.out.println("\nPara prosseguimos com o programa selecione uma opção abaixo:");
            System.out.println("\n1.Médicos 2.sair\n\n");
            opcao = inputInt.nextInt();
            if (opcao == 2) {
                System.out.println("\nObrigado por usar o programa!");
                break;
            }
            switch (opcao) {
                case 1:
                    menuMedico.mostrarMedicos();
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente!");
                    Inicio();
                    break;
            }
        }
    }
}
