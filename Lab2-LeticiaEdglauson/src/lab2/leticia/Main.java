/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.leticia;

import java.util.ArrayList;
import java.util.Scanner;


/*
* Aluna: Letícia Andrade e Edglauson
* Matrícula: 161080243
*/


public class Main {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Professor> professores = new ArrayList<>();
    static ArrayList<Caminhoneiro> caminhoneiros = new ArrayList<>();
    static ArrayList<Taxista> taxistas = new ArrayList<>();
    static ArrayList<Medico> medicos = new ArrayList<>();

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        do {
            System.out.println("1 - Cadastrar contribuintes");
            System.out.println("2 - Impostos");
            System.out.println("3 - Listar todos os contribuintes");

            int op = Integer.parseInt(ler.nextLine());
            switch (op) {
                case 1:
                    double carro = 0.00, casa = 0.00;
                    
                    
                    
                    System.out.println("Nome: ");
                    String nome = ler.nextLine();
                    System.out.println("Escolha uma profissão: 1 - Professor 2 - Médico 3 - Taxista 4 - Caminhoneiro");
                    int profissao = Integer.parseInt(ler.nextLine());
                    
                    System.out.println("Você possui casa? 1 - Sim ou 2 - Não");
                    op = Integer.parseInt(ler.nextLine());
                    if (op == 1) {
                        System.out.println("Digite o valor da casa: ");
                        casa = Double.parseDouble(ler.nextLine());

                    }
                    System.out.println("Você possui carro? 1 - Sim ou 2 - Não");
                    op = Integer.parseInt(ler.nextLine());
                    if (op == 1) {
                        System.out.println("Digite o valor do carro: ");
                        carro = Double.parseDouble(ler.nextLine());
                    }
                    
                    
                    switch (profissao) {
                        case 1:
                            Professor professor = new Professor(nome, casa + carro);
                            System.out.println("Digite o gasto em materiais: ");
                            professor.setDesconto(Double.parseDouble(ler.nextLine()));
                            System.out.println("Qual o seu salário? ");
                            professor.setSalario(Double.parseDouble(ler.nextLine()));
                            professores.add(professor);
                            break;
                        case 2:
                            Medico medico = new Medico(nome, casa + carro);
                            System.out.println("Quantos pacientes foram atendidos por ano? ");
                            medico.setnPacientes(Integer.parseInt(ler.nextLine()));
                            System.out.println("Qual a sua despesa com congressos? ");
                            medico.setDespesas(Double.parseDouble(ler.nextLine()));
                            medicos.add(medico);
                            break;
                        case 3:
                            Taxista taxista = new Taxista(nome, casa + carro);
                            System.out.println("Quantos KM rodados? ");
                            taxista.descontoPorKM(Double.parseDouble(ler.nextLine()));
                            System.out.println("Quantos pacientes foram transportados em um ano? ");
                            taxista.setnPassageiros(Integer.parseInt(ler.nextLine()));
                            taxistas.add(taxista);
                            break;
                        case 4:
                            Caminhoneiro caminhoneiro = new Caminhoneiro(nome, casa + carro);
                            System.out.println("Quantos KM rodados? ");
                            caminhoneiro.descontoPorKM(Double.parseDouble(ler.nextLine()));
                            System.out.println("Número de toneladas transportadas em um ano? ");
                            caminhoneiro.setnToneladas(Double.parseDouble(ler.nextLine()));
                            caminhoneiros.add(caminhoneiro);

                            break;
                    }
                    break;
                case 2:
                    System.out.println("Digita o número do contribuinte: ");
                    mostrarContribuinte(Integer.parseInt(ler.nextLine()));
                    break;
                case 3:
                    mostrarRiquezas();
                    break;
            }

        } while (true);

    }

    public static void mostrarContribuinte(int numero) {

        for (Professor p : professores) {

            if (p.getNumero() == numero) {
                p.setImposto();
                System.out.print("Professor - Nome: " + p.getNome() + " - Numero: " + p.getNumero() + " - Desconto: " + p.getDesconto() + " - Imposto: " + p.getImposto()+"\n");
                break;
            }
        }
        for (Caminhoneiro p : caminhoneiros) {

            if (p.getNumero() == numero) {
                 p.setImposto();
                System.out.print("Caminhoneiro - Nome: " + p.getNome() + " - Numero: " + p.getNumero() + " - Desconto: " + p.getDesconto() + " - Imposto: " + p.getImposto()+"\n");
                break;
            }
        }
        for (Medico p : medicos) {

            if (p.getNumero() == numero) {
                 p.setImposto();
                System.out.print("Medico - Nome: " + p.getNome() + " - Numero: " + p.getNumero() + " - Desconto: " + p.getDesconto() + " - Imposto: " + p.getImposto()+"\n");
                break;
            }
        }
        for (Taxista p : taxistas) {

            if (p.getNumero() == numero) {
                 p.setImposto();
                System.out.print("Taxista - Nome: " + p.getNome() + " - Numero: " + p.getNumero() + " - Desconto: " + p.getDesconto() + " - Imposto: " + p.getImposto()+"\n");
                break;
            }
        }

    }

    public static void mostrarRiquezas() {

        System.out.println("\nPROFESSORES\nMédia: "+Professor.media);
        for (Professor p : professores) {
            System.out.print(p.getNome() + " - Bens acumulados:" + p.getBensAcumulados() + " - Número:" + p.getNumero() + " - ");
            if (p.getBensAcumulados() > Professor.media*1.5d) {
                System.out.println("Valor de riqueza excessivo!\n");
            } else {
                System.out.println("Valor de riqueza não é excessivo!\n");
            }
            
            
            System.out.println("\n\n");
        }

        System.out.println("\nCAMINHONEIROS\nMédia: "+Caminhoneiro.media);
        for (Caminhoneiro p : caminhoneiros) {
            System.out.print(p.getNome() + " - Bens acumulados:" + p.getBensAcumulados() + " - Número:" + p.getNumero() + " - ");
            if (p.getBensAcumulados() > Caminhoneiro.media) {
                System.out.println("Valor de riqueza excessivo!\n");
            } else {
                System.out.println("Valor de riqueza não é excessivo!\n");
            }
            System.out.println("\n\n");
        }

        System.out.println("\nMÉDICOS\nMédia: "+Medico.media);
        for (Medico p : medicos) {
            System.out.print(p.getNome() + " - Bens acumulados:" + p.getBensAcumulados() + " - Número:" + p.getNumero() + " - ");
            if (p.getBensAcumulados() > Medico.media) {
                System.out.println("Valor de riqueza excessivo!\n");
            } else {
                System.out.println("Valor de riqueza não é excessivo!\n");
            }
            
            
            System.out.println("\n\n");
        }

        System.out.println("\nTAXISTAS\nMédia: "+Taxista.media);
        for (Taxista p : taxistas) {
            System.out.print(p.getNome() + " - Bens acumulados:" + p.getBensAcumulados() + " - Número:" + p.getNumero() + " - ");
            if (p.getBensAcumulados() > Taxista.media) {
                System.out.println("Valor de riqueza excessivo!\n");
            } else {
                System.out.println("Valor de riqueza não é excessivo!\n");
            }

            System.out.println("\n\n");            
        }

    }

}
