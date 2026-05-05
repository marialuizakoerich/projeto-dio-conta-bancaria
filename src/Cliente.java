public class Cliente {


    private String nome;
    private String cpf;
    private String telefone;
    private Conta conta;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirDados() {
        System.out.println("=== Dados do Cliente ===");
        System.out.printf("Nome: %s \n", nome);
        System.out.printf("CPF: %s \n", cpf);
        System.out.printf("Telefone: %s \n", telefone);
    }

}
