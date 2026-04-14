import java.util.Scanner;

public class Netflix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tipoPlano, idadeUsuario;
        String nacionalidadeUsuario;

        System.out.println("Digite a opção do seu plano (1 a 3):");
        tipoPlano = sc.nextInt();
        
        switch (tipoPlano) {
            case 1:
                System.out.println("**1 (Básico):** \"Resolução 720p - 1 tela disponível.\"");
                break;
                
            case 2:
                System.out.println("**2 (Padrão):** \"Resolução 1080p (Full HD) - 2 telas disponíveis.\"");
                break;
                
            case 3:
                System.out.println("**3 (Premium):** \"Resolução 4K + HDR - 4 telas disponíveis.\"");
                break;
                
            default:
                System.out.println("**Default:** \"Código de plano inválido.\"");;
            }

                        
        System.out.println("Digite sua idade:");
        idadeUsuario = sc.nextInt();
        
        if (idadeUsuario < 12) {
            System.out.println("Categoria: Adolescente (Séries Teen e Aventura).");
        } else if (idadeUsuario >= 12 && idadeUsuario <= 17) {
            System.out.println("\"Categoria: Adolescente (Séries Teen e Aventura).\"");
        } else {
            System.out.println("Categoria: Adulto (Filmes de Ação e Documentários).");
        }
        
        System.out.println("Digite sua nacionalidade:");
        nacionalidadeUsuario = sc.next();

        if (nacionalidadeUsuario.equalsIgnoreCase("Brasil")) {
            System.out.println("\"Destaque: Assista agora produções originais brasileiras!\"");
        }

        sc.close();

    }
}