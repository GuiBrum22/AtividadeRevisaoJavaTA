package AtidadeRevisao1;

import java.util.Scanner;

public class ExemplosRevisao {
 Scanner sc = new Scanner(System.in);
    
 
 //Criar metodos da classe
 public void exemplo1(){
    //Criar projeto para ler 2 notas e a frequência
    // e falar se ele esta aprovado ou reprovado
    //1. ler a primeira nota
    System.out.println("Informe a primeira nota do aluno");
    int nota1 = sc.nextInt();
    //2. ler a segunda nota 
    System.out.println("Informe a segunda nota do aluno");
    int nota2 = sc.nextInt();
    //3. calcular a media das notas
    double media = (nota1+nota2)/2;
    //4. mostrar a media calculada
    System.out.println("A media do aluno foi de " +media);
    //5. didgite o total de aulas
    System.out.println("Professor, informe o total de aulas dadas");
    int aulasDadas = sc.nextInt();
    //6. informar a quantidade de faltas do aluno
    System.out.println("Professor, informe n° de faltas do aluno ");
    int nfaltas = sc.nextInt();
    //7. CALCULAR A PORCENTAGEM DE FREQUENCIA
    double frequencia = (aulasDadas-nfaltas)/100*aulasDadas;
    //8. mostrar a porcentagem da frequencia
    System.out.println("A frequencia do aluno foi de " +frequencia+"%");
    //9. falar se o aluno passou ou nao (media>=50 e frequencia>=75)
    if (media>= 50 && frequencia>= 75) {
        System.out.println("O aluno foi Aprovado!");
    } else if(media<50 && frequencia>=75){
        System.out.println("O aluno ficou de recuperação");
    }else{
        System.out.println("O aluno foi Reprovado!");
    }


 }
}
