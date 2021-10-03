
package javaapplication1;

import static java.lang.Math.random;
import java.util.Scanner;

public class JogoDaVelha {
    
       static String [][] jogo = new String [3][3];
       static String simbolo;
       static String simbolo2;
       static boolean segundoUsuario;
       static String resposta;
       static int cx,cy;
       static boolean repeat = false;
        
       static Scanner scan = new Scanner (System.in);
    
    public static void imprimirTabuleiro(){
        for (int j = 0; j < 3; j++) {
                                for (int k = 0; k < 3; k++) {
                                    if(k!=2)
                                        System.out.print(jogo[j][k] + "|");
                                    else 
                                        System.out.print(jogo[j][k]);
                                }
                                System.out.println(" ");
                            }
        
        System.out.println("Deseja jogar novamente?[S/N]");
        String a = scan.next();
        if(a.equalsIgnoreCase("S")){
            repeat = true;
        }
    }   
       
    public static void main(String[] args) {
     
        
        System.out.println("Olá Jogador!");
        System.out.println("Estou carregando o seu jogo... Aguarde.");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                jogo[i][j] = " ";
            }
        }
        // x=1 , bola = 2;
        
        System.out.println("Jogo carregado!");
        
        System.out.println("Com qual deseja jogar? [X|O] ");
        simbolo = scan.next();
        simbolo = simbolo.toUpperCase();
        System.out.println("Deseja jogar com outro usuário?[S/N]");
        resposta = scan.next();
         
        if(resposta.equalsIgnoreCase("S")){
            segundoUsuario = true;
        }else{
            segundoUsuario = false;
        }
        
         if(simbolo.equalsIgnoreCase("X")){
            simbolo2 = "O";
        }else{
            simbolo2 = "X";
        }
        
        if (segundoUsuario == true){
            for(int i=0;i<5;i++){
                System.out.println("Usuário 1 onde deseja jogar?");
                cx = scan.nextInt(); cy = scan.nextInt();

                while(!jogo[cx][cy].equalsIgnoreCase(" ")){
                    System.out.println("Está casa já está ocupada! Escolha uma nova");
                     cx = scan.nextInt(); cy = scan.nextInt();
                }
                jogo[cx][cy] = simbolo;
                
                if(i>=2){
                    if( (jogo[0][0].equalsIgnoreCase(simbolo)) && (jogo[1][1].equalsIgnoreCase(simbolo))){ //diagonal principal
                        if(jogo[2][2].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                           
                            break;
                        }
                    }else if ((jogo[0][2].equalsIgnoreCase(simbolo)) && (jogo[1][1].equalsIgnoreCase(simbolo))){ //diagonal secundaria
                        if(jogo[2][0].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][0].equalsIgnoreCase(simbolo)) && (jogo[1][0].equalsIgnoreCase(simbolo))){ //primeira coluna
                        if(jogo[2][0].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][1].equalsIgnoreCase(simbolo)) && (jogo[1][1].equalsIgnoreCase(simbolo))){ //segunda coluna
                         if(jogo[2][1].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][2].equalsIgnoreCase(simbolo)) && (jogo[1][2].equalsIgnoreCase(simbolo))){ //terceira coluna
                        if(jogo[2][2].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][0].equalsIgnoreCase(simbolo)) && (jogo[0][1].equalsIgnoreCase(simbolo))){ //primeira linha
                        if(jogo[0][2].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[1][0].equalsIgnoreCase(simbolo)) && (jogo[1][1].equalsIgnoreCase(simbolo))){ //segunda linha
                        if(jogo[1][2].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[2][0].equalsIgnoreCase(simbolo)) && (jogo[2][1].equalsIgnoreCase(simbolo))){ //terceira linha
                        if(jogo[2][2].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }
                }
                
                if(i == 4){
                    System.out.println("O jogo empatou!!");
                    break;
                }
                
                System.out.println("Usuário 2 onde deseja jogar?");
                cx = scan.nextInt(); cy = scan.nextInt();

                while(!jogo[cx][cy].equalsIgnoreCase(" ")){
                    System.out.println("Está casa já está ocupada! Escolha uma nova");
                     cx = scan.nextInt(); cy = scan.nextInt();
                }
                jogo[cx][cy] = simbolo2;
                
                 if(i>=2){
                    if( (jogo[0][0].equalsIgnoreCase(simbolo2)) && (jogo[1][1].equalsIgnoreCase(simbolo2))){ //diagonal principal
                        if(jogo[2][2].equalsIgnoreCase(simbolo2)){
                            System.out.println("Usuário 2 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][2].equalsIgnoreCase(simbolo2)) && (jogo[1][1].equalsIgnoreCase(simbolo2))){ //diagonal secundaria
                        if(jogo[2][0].equalsIgnoreCase(simbolo2)){
                            System.out.println("Usuário 2 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][0].equalsIgnoreCase(simbolo2)) && (jogo[1][0].equalsIgnoreCase(simbolo2))){ //primeira coluna
                        if(jogo[2][0].equalsIgnoreCase(simbolo2)){
                            System.out.println("Usuário 2 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][1].equalsIgnoreCase(simbolo2)) && (jogo[1][1].equalsIgnoreCase(simbolo2))){ //segunda coluna
                         if(jogo[2][1].equalsIgnoreCase(simbolo2)){
                            System.out.println("Usuário 2 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][2].equalsIgnoreCase(simbolo2)) && (jogo[1][2].equalsIgnoreCase(simbolo2))){//terceira coluna
                        if(jogo[2][2].equalsIgnoreCase(simbolo2)){
                            System.out.println("Usuário 2 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][0].equalsIgnoreCase(simbolo2)) && (jogo[0][1].equalsIgnoreCase(simbolo2))){//primeira linha
                        if(jogo[0][2].equalsIgnoreCase(simbolo2)){
                            System.out.println("Usuário 2 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[1][0].equalsIgnoreCase(simbolo2)) && (jogo[1][1].equalsIgnoreCase(simbolo2))){//segunda linha
                        if(jogo[1][2].equalsIgnoreCase(simbolo2)){
                            System.out.println("Usuário 2 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[2][0].equalsIgnoreCase(simbolo2)) && (jogo[2][1].equalsIgnoreCase(simbolo2))){//terceira linha
                        if(jogo[2][2].equalsIgnoreCase(simbolo2)){
                            System.out.println("Usuário 2 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }
                }
                 
                System.out.println("Coordenadas atuais: ");
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if(k!=2)
                            System.out.print(jogo[j][k] + "|");
                        else 
                            System.out.print(jogo[j][k]);
                    }
                    System.out.println(" ");
                }
                
            }
     
            
        }else{
            
            
            do{
            for (int i = 0; i < 5; i++) {
                
            
   
                System.out.println("Usuário 1 onde deseja jogar?");
                    cx = scan.nextInt(); cy = scan.nextInt();

                    while(!jogo[cx][cy].equalsIgnoreCase(" ")){
                        System.out.println("Está casa já está ocupada! Escolha uma nova");
                         cx = scan.nextInt(); cy = scan.nextInt();
                    }
                    jogo[cx][cy] =simbolo;
                    
                    if(i>=2){
                    if( (jogo[0][0].equalsIgnoreCase(simbolo)) && (jogo[1][1].equalsIgnoreCase(simbolo))){ //diagonal principal
                        if(jogo[2][2].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][2].equalsIgnoreCase(simbolo)) && (jogo[1][1].equalsIgnoreCase(simbolo))){ //diagonal secundaria
                        if(jogo[2][0].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][0].equalsIgnoreCase(simbolo)) && (jogo[1][0].equalsIgnoreCase(simbolo))){ //primeira coluna
                        if(jogo[2][0].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][1].equalsIgnoreCase(simbolo)) && (jogo[1][1].equalsIgnoreCase(simbolo))){ //segunda coluna
                         if(jogo[2][1].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][2].equalsIgnoreCase(simbolo)) && (jogo[1][2].equalsIgnoreCase(simbolo))){ //terceira coluna
                        if(jogo[2][2].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][0].equalsIgnoreCase(simbolo)) && (jogo[0][1].equalsIgnoreCase(simbolo))){ //primeira linha
                        if(jogo[0][2].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[1][0].equalsIgnoreCase(simbolo)) && (jogo[1][1].equalsIgnoreCase(simbolo))){ //segunda linha
                        if(jogo[1][2].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[2][0].equalsIgnoreCase(simbolo)) && (jogo[2][1].equalsIgnoreCase(simbolo))){ //terceira linha
                        if(jogo[2][2].equalsIgnoreCase(simbolo)){
                            System.out.println("Usuário 1 ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }
                }
                    
                if( i == 4){
                    System.out.println("O jogo empatou!!");
                    break;
                }    


                    System.out.println("Jogada do computador: ");
                        cx = (int)( Math.random() * 10);
                        while( cx >2){
                            cx = (int)( Math.random() * 10);
                        }

                        cy = (int)( Math.random() * 10);
                        while( cy >2){
                            cy = (int)( Math.random() * 10);
                        }

                        while(!jogo[cx][cy].equalsIgnoreCase(" ")){
                        cx = (int)( Math.random() * 10);
                        while( cx >2){
                            cx = (int)( Math.random() * 10);
                        }

                        cy = (int)( Math.random() * 10);
                        while( cy >2){
                            cy = (int)( Math.random() * 10);
                        }
                    }
                        jogo[cx][cy] = simbolo2;
                        System.out.println("Coordenada x - " + cx + ", Coordenada y - " + cy);
                        
                   if(i>=2){
                    if( (jogo[0][0].equalsIgnoreCase(simbolo2)) && (jogo[1][1].equalsIgnoreCase(simbolo2))){ //diagonal principal
                        if(jogo[2][2].equalsIgnoreCase(simbolo2)){
                            System.out.println("Computador ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][2].equalsIgnoreCase(simbolo2)) && (jogo[1][1].equalsIgnoreCase(simbolo2))){ //diagonal secundaria
                        if(jogo[2][0].equalsIgnoreCase(simbolo2)){
                            System.out.println("Computador ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][0].equalsIgnoreCase(simbolo2)) && (jogo[1][0].equalsIgnoreCase(simbolo2))){ //primeira coluna
                        if(jogo[2][0].equalsIgnoreCase(simbolo2)){
                            System.out.println("Computador ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][1].equalsIgnoreCase(simbolo2)) && (jogo[1][1].equalsIgnoreCase(simbolo2))){ //segunda coluna
                         if(jogo[2][1].equalsIgnoreCase(simbolo2)){
                            System.out.println("Computador ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][2].equalsIgnoreCase(simbolo2)) && (jogo[1][2].equalsIgnoreCase(simbolo2))){//terceira coluna
                        if(jogo[2][2].equalsIgnoreCase(simbolo2)){
                            System.out.println("Computador ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[0][0].equalsIgnoreCase(simbolo2)) && (jogo[0][1].equalsIgnoreCase(simbolo2))){//primeira linha
                        if(jogo[0][2].equalsIgnoreCase(simbolo2)){
                            System.out.println("Computador ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[1][0].equalsIgnoreCase(simbolo2)) && (jogo[1][1].equalsIgnoreCase(simbolo2))){//segunda linha
                        if(jogo[1][2].equalsIgnoreCase(simbolo2)){
                            System.out.println("Computador ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }else if ((jogo[2][0].equalsIgnoreCase(simbolo2)) && (jogo[2][1].equalsIgnoreCase(simbolo2))){//terceira linha
                        if(jogo[2][2].equalsIgnoreCase(simbolo2)){
                            System.out.println("Computador ganhou o jogo!");
                            System.out.println("Coordenadas atuais: ");
                            imprimirTabuleiro();
                            break;
                        }
                    }
                }
                 
                System.out.println("Coordenadas atuais: ");
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if(k!=2)
                            System.out.print(jogo[j][k] + "|");
                        else 
                            System.out.print(jogo[j][k]);
                    }
                    System.out.println(" ");
                }
        }
        }while(repeat);
        
    }
}
}
