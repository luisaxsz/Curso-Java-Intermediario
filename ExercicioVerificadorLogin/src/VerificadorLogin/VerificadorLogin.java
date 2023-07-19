package VerificadorLogin;

import java.util.Scanner;

public class VerificadorLogin {
	public static void main(String[] args) {
		String usuario = "Admin";
		String senha = "12345";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o usuario: ");
		String inputUsuario = scan.next();
		System.out.println("Insira Senha: ");
		String inputSenha = scan.next();
		
		if(inputUsuario.equals(usuario) && inputSenha.equals(senha)) {
			System.out.println("Acesso Liberado");
		}else {
			System.out.println("Senha ou Usuario inválido");
		}
	}
}
