package classes;

public class Produto {

    private int codigo;
    private String nome;
    private Float valor;
    private int quantidadeEstoque;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Float getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public int removerQuantidadeEstoque(int quantidade) {
        return quantidadeEstoque = quantidadeEstoque - quantidade;
    }


   /*  @Override
    public String toString() {
        return "Nome: " + nome;
    } */
}