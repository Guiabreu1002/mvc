package br.com.catolica.mvc.View;

import br.com.catolica.mvc.Enum.TipoUsuarioEnum;

import java.util.Scanner;

public class UsuarioView {

    public String inputNome () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        scanner.close();
        return nome;
    }
    public String inputEmail () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();
        scanner.close();
        return email;
    }

    public TipoUsuarioEnum inputTipo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipo de Usuario: ");
        System.out.println("[1] ADM");
        System.out.println("[2] NORMAL");
        System.out.println("Escolher: ");
        int tipo = scanner.nextInt();
        scanner.close();
        if (tipo == 1)
            return TipoUsuarioEnum.ADM;
        else if (tipo == 2)
            return TipoUsuarioEnum.NORMAL;
        else
            return null;
    }

}
