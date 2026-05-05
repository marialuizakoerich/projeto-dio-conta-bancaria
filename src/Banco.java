import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Conta> contas = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listarClientes() {
        System.out.println("=== Clientes do Banco ===");
        for (Cliente cliente: clientes) {
            System.out.printf("Cliente: %s \n", cliente.getNome());
        }
    }

    public Cliente cadastrarCliente(String nome, String cpf, String telefone) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        this.clientes.add(cliente);
        System.out.printf("Cliente cadastrado com sucesso: %s \n", nome);
        return cliente;
    }


    }







