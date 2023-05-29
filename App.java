import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double media;
    
    
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite a nota da avaliação 1: ");
        double N1 = leitor.nextDouble();

        System.out.println("Digite a nota da avaliação 2: ");
        double N2 = leitor.nextDouble();

        System.out.println("Digite a nota da avaliação 3: ");
        double N3 = leitor.nextDouble();

        System.out.println("Digite a nota da avaliação 4: ");
        double N4 = leitor.nextDouble();
        media = (N1+N2+N3+N4)/4;
        String mediaAluno = getMedia(media);
        System.out.println(mediaAluno);

    }

    public static String getMedia(double media) {

        if ( media >= 7) {
            return "O Aluno está Aprovado!";

        } else if (media >= 5 && media <7) {

            return "O Aluno está em Recuperação!";

        }else {

            return "O Aluno está Reprovado!";
        }
    }
}

