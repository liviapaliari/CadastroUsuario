package br.bosch.CadastroUsuario.Service;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    Scanner scanner = new Scanner(System.in);
    ConsumoAPI consumoAPI = new ConsumoAPI();
    ConverteDados converteDados = new ConverteDados();

    public void exibeMenu() throws IOException, InterruptedException {
        System.out.println("--- Cadastro de Usuário ---");
//        System.out.print("Nome: ");
//        String nome = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        System.out.println(converteDados.converteJsonParaEndereco(consumoAPI.obterDados(cep)));
    }
}