// Cliente.java
package banco.dominio;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String sobrenome;
    private ArrayList<Conta> contas;


    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        contas = new ArrayList<>();
    }


    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta getConta(int indice) {
        return contas.get(indice);
    }

    public int getNumeroDeContas() {
        return contas.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
