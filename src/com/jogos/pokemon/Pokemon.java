package com.jogos.pokemon;

import java.util.Random;
import java.util.Scanner;

public class Pokemon {

    public static void GetPokemon() {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Ola, seja muito bem vindo a batalha Pokemon !!\nPara começarmos escolha o seu pokemon !\n1 - Squirtle\n2 - Charmander\n3 - Bulbassaur");

        int getPokemon;
        do {
            getPokemon = scan.nextInt();
            switch (getPokemon) {
                case 1 ->
                        System.out.println("\nMuito bem, você escolheu o Squirtle para lhe acompanhar nessa batalha !\n");
                case 2 ->
                        System.out.println("\nMuito bem, você escolheu o Charmander para lhe acompanhar nessa batalha !\n");
                case 3 ->
                        System.out.println("\nMuito bem, você escolheu o Bulbassaur para lhe acompanhar nessa batalha !\n");
                default -> System.out.println("\nOps, você deve escolher um número entre 1 e 3 !\n");
            }
        } while (getPokemon != 1 & getPokemon != 2 & getPokemon !=3);

        if (getPokemon == 1) {

            int  life = 80;
            int choice;
            do {
                System.out.println("Sua vida atual é " +  life + "\n");
                System.out.println("Escolha seu movimento\n1 - Ataque\n2 - cura");
                choice = scan.nextInt();
                if (choice == 1){
                    System.out.println("\nVocê atacou !");
                    life =  life - (gerador.nextInt(10));
                } else if (choice == 2) {
                    System.out.println("\nVoce se curou !");
                    life =  life + 10;
                    life =  life- (gerador.nextInt(10));
                }else{
                    System.out.println("\nVocê perdeu a sua vez !!\n");
                    life =  life -(gerador.nextInt(15));
                }
            }while ( life >= 0);

            System.out.println("\nInfelizmente você perdeu !!");
        }
        if (getPokemon == 2){

            int life = 75;
            int choice;
            do {
                System.out.println("Sua vida atual é " + life + "\n");
                System.out.println("Escolha seu movimento\n1 - Ataque\n2 - cura");
                choice = scan.nextInt();
                if (choice == 1){
                    System.out.println("\nVocê atacou !");
                    life = life - (gerador.nextInt(15));
                } else if (choice == 2) {
                    System.out.println("\nVoce se curou !");
                    life = life + 5;
                    life = life - (gerador.nextInt(15));
                }else{
                    System.out.println("\nVocê perdeu a sua vez !!\n");
                    life = life -(gerador.nextInt(15));
                }
            }while (life >= 0);

            System.out.println("\nInfelizmente você perdeu !!");
        }
        if (getPokemon == 3){

            int life = 75;
            int choice;
            do {
                System.out.println("Sua vida atual é " + life + "\n");
                System.out.println("Escolha seu movimento\n1 - Ataque\n2 - cura");
                choice = scan.nextInt();
                if (choice == 1){
                    System.out.println("\nVocê atacou !");
                    life = life - (gerador.nextInt(12));
                } else if (choice == 2) {
                    System.out.println("\nVoce se curou !");
                    life = life + 10;
                    life = life - (gerador.nextInt(15));
                }else{
                    System.out.println("\nVocê perdeu a sua vez !!\n");
                    life = life -(gerador.nextInt(15));
                }
            }while (life >= 0);

            System.out.println("\nInfelizmente você perdeu !!");

        }
    }
}
