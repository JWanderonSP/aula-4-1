import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc=new Scanner(System.in);
        int freio=0;
        String nome;
        String sobrenome;
        String telefone;
        /*
         Faça um programa em Java para simular uma parte do funcionamento de uma agenda de contatos. 
         Você deverá ter as opções de incluir uma pessoa
        listar todas as pessoas cadastradas.
        Cada pessoa terá nome, sobrenome e telefone de contato.
         O número máximo de contatos que podem ser salvos é definido por você.  
Após finalizar o programa, compartilhe-o em sua conta do GitHub.
         */
        System.out.println("Caro usuário vamos montar sua agenda?");
        System.out.println("");
        System.out.println("Você deseja guardar quantos contatos?");
        freio=sc.nextInt();
        Agenda[] lista =new Agenda[freio];
        for(int i=0;i<freio;i++){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            Agenda nag=new Agenda(); 
        System.out.println("Por favor digite o nome do contato: ");
        nome=sc.next();
        nag.setNome(nome);
        System.out.println("Por favor digite o sobrenome do contato: ");
        sobrenome=sc.next();
        nag.setSobrenome(sobrenome);
        System.out.println("Por favor digite o Telefone do contato: ");
        telefone=sc.next();
        nag.setTelefone(telefone);
        lista[i]=nag;
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    for (Agenda agenda : lista) {
        System.out.println("");
        System.out.println("Nome: "+agenda.getNome());
        System.out.println("Sobrenome: "+agenda.getSobrenome());
        System.out.println("Telefone: "+agenda.getTelefone());
    }
       
        }

    }

