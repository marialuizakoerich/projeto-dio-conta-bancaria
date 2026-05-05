# 🏦 Projeto Conta Bancária - DIO

Desafio prático do bootcamp da [Digital Innovation One (DIO)](https://www.dio.me/), com o objetivo de implementar um sistema bancário simples utilizando os conceitos de **Programação Orientada a Objetos (POO)** em Java.

---

## 🎯 Objetivo

Modelar e implementar um sistema bancário com cadastro de clientes, contas correntes e contas poupança, aplicando conceitos como herança, interfaces e encapsulamento.

---

## 🗂️ Estrutura do Projeto

```
projeto-dio-conta-bancaria/
└── src/
    ├── IConta.java          # Interface
    ├── Conta.java           # Classe base abstrata
    ├── ContaCorrente.java   # Herda de Conta
    ├── ContaPoupanca.java   # Herda de Conta
    ├── Cliente.java         # Titular da conta
    ├── Banco.java           # Gerencia clientes e contas
    └── Main.java            # Classe de teste
```

---

## 🧩 Diagrama UML

```
                        ┌──────────────────┐
                        │   «interface»    │
                        │     IConta       │
                        │──────────────────│
                        │ + sacar()        │
                        │ + depositar()    │
                        │ + transferir()   │
                        │ + imprimirInfos()│
                        └────────┬─────────┘
                                 │
                        ┌────────▼─────────┐
                        │    «class»       │
                        │      Conta       │
                        │──────────────────│
                        │ - agencia        │
                        │ - numero         │
                        │ - saldo          │
                        │ - cliente        │
                        └────────┬─────────┘
                                 │
              ┌──────────────────┴──────────────────┐
              │                                     │
   ┌──────────▼──────────┐             ┌────────────▼────────┐
   │      «class»        │             │      «class»        │
   │   ContaCorrente     │             │   ContaPoupanca     │
   │─────────────────────│             │─────────────────────│
   │ + imprimirExtrato() │             │ + imprimirExtrato() │
   └─────────────────────┘             └─────────────────────┘
```

---

## 🔧 Funcionalidades

### 👤 Cliente
| Atributo | Tipo |
|---|---|
| `nome` | String |
| `cpf` | String |
| `telefone` | String |
| `conta` | Conta |

### 🏦 Banco
| Método | Descrição |
|---|---|
| `cadastrarCliente(nome, cpf, telefone)` | Cadastra um novo cliente |
| `adicionarConta(conta)` | Adiciona uma conta ao banco |
| `listarClientes()` | Lista todos os clientes |
| `listarContas()` | Lista todas as contas com extrato |

### 💳 Conta
| Método | Descrição |
|---|---|
| `depositar(valor)` | Deposita um valor na conta |
| `sacar(valor)` | Saca um valor da conta |
| `transferir(valor, contaDestino)` | Transfere para outra conta |
| `imprimirExtrato()` | Imprime o extrato da conta |

---

## 🚀 Como executar

**Pré-requisitos:** Java JDK instalado

```bash
# Clonar o repositório
git clone https://github.com/marialuizakoerich/projeto-dio-conta-bancaria.git

# Entrar na pasta do projeto
cd projeto-dio-conta-bancaria/src

# Compilar
javac *.java

# Executar
java Main
```

---

## 💡 Conceitos utilizados

- **Interface** — `IConta` define o contrato das operações bancárias
- **Herança** — `ContaCorrente` e `ContaPoupanca` herdam de `Conta`
- **Encapsulamento** — atributos privados acessados via getters e setters
- **Polimorfismo** — cada tipo de conta implementa `imprimirExtrato` do seu jeito

---

## 👩‍💻 Autora

Feito por **Maria Luiza Koerich** durante o bootcamp da DIO.

[![GitHub](https://img.shields.io/badge/GitHub-marialuizakoerich-181717?style=flat&logo=github)](https://github.com/marialuizakoerich)
