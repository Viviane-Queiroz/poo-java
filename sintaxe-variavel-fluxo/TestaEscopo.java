public class TestaEscopo { 

    public static void main(String[] args) { 
    
    System.out.println("Testando condicionais"); 
    
     
    
    int idade = 20; 
    
    int quantidadePessoas = 3; 
    
     
    boolean acompanhado = quantidadePessoas >= 2; //does not accept 0/1 
    
     
    if (idade >= 18 && acompanhado) { 
    
        System.out.println("Seja bem-vindo!"); 
        
        } else { 
        
        System.out.println("Você não pode entrar."); 
        } 
    } 
} 