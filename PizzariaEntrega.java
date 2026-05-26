//Viniícius 
public class Pizza {

    private String sabor;

    private String tamanho;

    private double precoBase;



    public Pizza(String sabor, String tamanho, double precoBase) {

        this.sabor = sabor;

        this.tamanho = tamanho;

        this.precoBase = precoBase;

    }



    public String getSabor() { return sabor; }

    public void setSabor(String sabor) { this.sabor = sabor; }



    public String getTamanho() { return tamanho; }

    public void setTamanho(String tamanho) { this.tamanho = tamanho; }



    public double getPrecoBase() { return precoBase; }

    public void setPrecoBase(double precoBase) { this.precoBase = precoBase; }



    public double calcularPrecoFinal() {

        return precoBase;

    }



    public void exibirDetalhesPizza() {

        System.out.println("- 1x Pizza " + this.tamanho + " de " + this.sabor + " (R$ " + this.precoBase + ")");

    }

}
public class Cliente {

    private String nome;

    private String telefone;

    private String endereco;



    public Cliente(String nome, String telefone, String endereco) {

        this.nome = nome;

        this.telefone = telefone;

        this.endereco = endereco;

    }



    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }



    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }



    public String getEndereco() { return endereco; }

    public void setEndereco(String endereco) { this.endereco = endereco; }



    public void exibirInfoCliente() {

        System.out.println("Cliente: " + this.nome + " | Tel: " + this.telefone);

        System.out.println("Endereço: " + this.endereco);

    }

}
