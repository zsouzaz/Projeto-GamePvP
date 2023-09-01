package GamePvP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MainGame {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Bem vindo ao game!");
        Scanner entrada = new Scanner(System.in);
        Scanner nomeVeic = new Scanner(System.in);
        ArrayList<Carro> player1 = new ArrayList(3);
        ArrayList<Carro> player2 = new ArrayList(3);
        int cont = 1;
        int verifica;
        String nome;
        boolean game = true;
        int ganhador = 0;
        int carroAtira;
        int qualCarro;
        int contSaude;
        int i;
        int acabaJogo;
        
        
        // CRIAÇÃO DOS TIMES
        
        
        System.out.print("Players, monte sua equipe. Voces tem direito a escolher 3 carros entre tanque ou atirador.");
        System.out.print("\n\nPLAYER 1.");
        
        // PLAYER 1 MONTA SUA EQUIPE
        
        while (cont < 4) {
            System.out.print("\nEscolha o modelo do seu " + cont + " carro. Digite 1 para tanque ou 2 para atirador: ");
            verifica = entrada.nextInt();
            while (verifica != 1 && verifica != 2) {
                System.out.print("\nNumero invalido, digite novamente(1 ou 2).");
                verifica = entrada.nextInt();
            }

            if (verifica == 1) {
                System.out.print("Informe o nome do seu carro tanque: ");
                nome = nomeVeic.nextLine();
                Tanque tanque = new Tanque(nome);
                player1.add(tanque);
                System.out.println(cont + " veiculo criado.");
            }
            if (verifica == 2) {
                System.out.print("Informe o nome do seu carro atirador: ");
                nome = nomeVeic.nextLine();
                Atirador atirador = new Atirador(nome);
                player1.add(atirador);
                System.out.println(cont + " veiculo criado.");
            }
            cont++;
        }
        
        // PLAYER 2 MONTA SUA EQUIPE
        
        System.out.print("\n\nPLAYER 2.");
        cont = 1;
        while (cont < 4) {
            
            System.out.print("\nEscolha o modelo do seu " + cont + " carro. Digite 1 para tanque ou 2 para atirador: ");
            verifica = entrada.nextInt();
            while (verifica != 1 && verifica != 2) {
                System.out.print("Numero invalido, digite novamente(1 ou 2).");
                verifica = entrada.nextInt();
            }

            if (verifica == 1) {
                System.out.print("Informe o nome do seu carro tanque: ");
                nome = nomeVeic.nextLine();
                Tanque tanque = new Tanque(nome);
                player2.add(tanque);
                System.out.print(cont + " veiculo criado.");
            }
            if (verifica == 2) {
                System.out.print("Informe o nome do seu carro atirador: ");
                nome = nomeVeic.nextLine();
                Atirador atirador = new Atirador(nome);
                player2.add(atirador);
                System.out.print(cont + " veiculo criado.");
            }
            cont++;
        }
        
        System.out.println("\nVeiculos criados. O jogo comeca com o player 1 atacando.");
        
        
        //  JOGO COMEÇA COM PLAYER 1        
        // PLAYER 1 ESCOLHE O CARRRO QUE VAI ATIRAR.
        
        
        
        
        while(game == true){                                
            System.out.println("VEZ DO PLAYER 1");
            System.out.print("\nPlayer 1, esta e a municao dos seus carros: ");
            cont = 1;
            while (cont <=3){
                System.out.println("\nMunicao carro " + cont + ": " + player1.get(cont - 1).mostraMunicao());
                cont++;
            }
            System.out.println("Escolha qual carro voce quer pra atirar 1, 2 ou 3: ");
            carroAtira = entrada.nextInt();
            while (carroAtira != 1 && carroAtira != 2 && carroAtira != 3) {
                System.out.print("\nNumero invalido, digite novamente.");
                carroAtira = entrada.nextInt();
            }                    
            
            switch(carroAtira) {
            case 1 -> {                                          
                System.out.println("\nPlayer 2, esta e a saude dos seus carros: ");
                contSaude = 1;
                while (contSaude <= 3) {
                    player2.get(contSaude - 1).mostraStatus();
                    System.out.println("\n");
                    contSaude++;
                }
                System.out.print("\nQual carro voce gostaria de levar o dano? Carro 1, 2 ou 3? ");
                qualCarro = entrada.nextInt(); 
                while (qualCarro != 1 && qualCarro != 2 && qualCarro != 3) {
                    System.out.print("\nNumero invalido, digite novamente.");
                    qualCarro = entrada.nextInt();
                }                
                player1.get(carroAtira - 1).atirar( player2.get(qualCarro - 1));
                acabaJogo = 0;
                for (i=0; i<=2; i++) {
                    if (player2.get(i).vivo == true){
                        acabaJogo++;
                    }
                }
                if (acabaJogo != 3) {
                    game = false;
                    ganhador = 1;
                }                               
                break;
                }

            case 2 -> {
                System.out.println("\nPlayer 2, esta e a saude dos seus carros: ");
                contSaude = 1;
                while (contSaude <= 3) {
                    player2.get(contSaude - 1).mostraStatus();
                    System.out.println("\n");
                    contSaude++;
                }
                System.out.print("\nQual carro voce gostaria de levar o dano? Carro 1, 2 ou 3? ");
                qualCarro = entrada.nextInt(); 
                while (qualCarro != 1 && qualCarro != 2 && qualCarro != 3) {
                    System.out.print("\nNumero invalido, digite novamente.");
                    qualCarro = entrada.nextInt();
                }                
                player1.get(carroAtira - 1).atirar( player2.get(qualCarro - 1));
                acabaJogo = 0;
                for (i=0; i<=2; i++) {
                    if (player2.get(i).vivo == true){
                        acabaJogo++;
                    }
                }
                if (acabaJogo != 3) {
                    game = false;
                    ganhador = 1;
                }
                break;
                }
            case 3 -> {  
                System.out.println("\nPlayer 2, esta e a saude dos seus carros: ");
                contSaude = 1;
                while (contSaude <= 3) {
                    player2.get(contSaude - 1).mostraStatus();
                    System.out.println("\n");
                    contSaude++;
                }
                System.out.print("\nQual carro voce gostaria de levar o dano? Carro 1, 2 ou 3? ");
                qualCarro = entrada.nextInt(); 
                while (qualCarro != 1 && qualCarro != 2 && qualCarro != 3) {
                    System.out.print("\nNumero invalido, digite novamente.");
                    qualCarro = entrada.nextInt();
                }                
                player1.get(carroAtira - 1).atirar( player2.get(qualCarro - 1));
               acabaJogo = 0;
                for (i=0; i<=2; i++) {
                    if (player2.get(i).vivo == true){
                        acabaJogo++;
                    }
                }
                if (acabaJogo != 3) {
                    game = false;
                    ganhador = 1;
                }
                break;
                }
            }                
            if (game == false) {
                break;
            }    
                                                            
    
            // PLAYER 2 ESCOLHE QUAL CARRO VAI ATIRAR.
            
            
            System.out.println("\nVEZ DO PLAYER 2");

            System.out.println("\nPlayer 2, esta e a municao dos seus carros: ");
            cont = 1;
            while (cont <=3){
                System.out.println("Municao carro " + cont + ": " + player2.get(cont - 1).mostraMunicao());
                cont++;
            }
            System.out.println("Escolha qual carro voce quer pra atirar 1, 2 ou 3: ");
            carroAtira = entrada.nextInt();
            while (carroAtira != 1 && carroAtira != 2 && carroAtira != 3) {
                System.out.print("\nNumero invalido, digite novamente.");
                carroAtira = entrada.nextInt();
            }
            
            switch(carroAtira) {
                case 1 -> {
                    System.out.println("\nPlayer 1, esta e a saude dos seus carros: ");
                    contSaude = 1;
                    while (contSaude <= 3) {
                        player1.get(contSaude - 1).mostraStatus();
                        System.out.println("\n");
                        contSaude++;
                    }
                    System.out.print("\nQual carro voce gostaria de levar o dano? Carro 1, 2 ou 3? ");
                    qualCarro = entrada.nextInt();
                    while (qualCarro != 1 && qualCarro != 2 && qualCarro != 3) {
                        System.out.print("\nNumero invalido, digite novamente.");
                        qualCarro = entrada.nextInt();
                    }
                    player2.get(carroAtira - 1).atirar( player1.get(qualCarro - 1));
                    acabaJogo = 0;
                    for (i=0; i<=2; i++) {
                        if (player2.get(i).vivo == true){
                        acabaJogo++;
                        }
                    }
                    if (acabaJogo != 3) {
                        game = false;
                        ganhador = 2;
                    }
                    }
                case 2 -> {
                    System.out.println("\nPlayer 1, esta e a saude dos seus carros: ");
                    contSaude = 1;
                    while (contSaude <= 3) {
                        player1.get(contSaude - 1).mostraStatus();
                        System.out.println("\n");
                        contSaude++;
                    }
                    System.out.print("\nQual carro voce gostaria de levar o dano? Carro 1, 2 ou 3? ");
                    qualCarro = entrada.nextInt();
                    while (qualCarro != 1 && qualCarro != 2 && qualCarro != 3) {
                        System.out.print("\nNumero invalido, digite novamente.");
                        qualCarro = entrada.nextInt();
                    }
                    player2.get(carroAtira - 1).atirar( player1.get(qualCarro - 1));
                    acabaJogo = 0;
                    for (i=0; i<=2; i++) {
                        if (player2.get(i).vivo == true){
                        acabaJogo++;
                        }
                    }
                    if (acabaJogo != 3) {
                        game = false;
                        ganhador = 2;
                    }
                }
                case 3 -> {
                    System.out.println("\nPlayer 1, esta e a saude dos seus carros: ");
                    contSaude = 1;
                    while (contSaude <= 3) {
                        player1.get(contSaude - 1).mostraStatus();
                        System.out.println("\n");
                        contSaude++;
                    }
                    System.out.print("\nQual carro voce gostaria de levar o dano? Carro 1, 2 ou 3? ");
                    qualCarro = entrada.nextInt();
                    while (qualCarro != 1 && qualCarro != 2 && qualCarro != 3) {
                        System.out.print("\nNumero invalido, digite novamente.");
                        qualCarro = entrada.nextInt();
                    }
                    player2.get(carroAtira - 1).atirar( player1.get(qualCarro - 1));
                    acabaJogo = 0;
                    for (i=0; i<=2; i++) {
                        if (player2.get(i).vivo == true){
                        acabaJogo++;
                        }
                    }
                    if (acabaJogo != 3) {
                        game = false;
                        ganhador = 2;
                    }
                }
            }
        }
        
        // FIM DE JOGO.
        
        if (game == false && ganhador == 1) {
            System.out.print("\n\nFIM DE JOGO! Player 1 foi o vencedor\n");
        }
        if (game == false && ganhador == 2) {
            System.out.print("\n\nFIM DE JOGO! Player 2 foi o vencedor\n");
        }        
    }    
}
