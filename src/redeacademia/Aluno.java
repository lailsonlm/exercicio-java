package redeacademia;

public class Aluno {
    private String nome;
    private String cpf;
    private int idade;
    private float altura;
    private float peso;
    private boolean status;
    private Pacotes plano;

    
    public Aluno(String nome, String cpf, int idade, float altura, float peso, Pacotes plano) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.plano = plano; 
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Pacotes getPlano() {
        return this.plano;
    }

    public Pacotes setPlano(Pacotes plano) {
        this.plano = plano;
        return null;
    }
    
   
    
    public void listarAlunos() {
        System.out.println("\n----------- ALUNO -------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
                
        if(this.status) {
            System.out.println("Status: Ativo");
        } else {
            System.out.println("Status: Inativo");
        }
        
        System.out.println ("");
        System.out.println("Plano: " + this.plano.getPlano());
        System.out.println("Tipo: " + this.plano.getTipo());
        System.out.println("Valor Mês: R$ " + this.plano.getValor());
        
    }

}
