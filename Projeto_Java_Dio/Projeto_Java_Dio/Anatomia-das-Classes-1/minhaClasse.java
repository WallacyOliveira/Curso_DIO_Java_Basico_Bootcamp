public class minhaClasse{

    public static void main (String[] args){        
    System.out.println("Olá turma, sejam bem-vindos!");

    String primeiroNome = "Wallacy";
    String segundoNome = "Oliveira";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método = "  + primeiroNome.concat(" ").concat(segundoNome);


    }


    
}
