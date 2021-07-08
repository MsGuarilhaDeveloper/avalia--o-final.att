package classes;

// import java.time.LocalDate;

public class Vendas {

    private String dataVenda;
    private String produtoVendido;
    private int quantidadeVendida;

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

}


/* var date2 = new Date();
var sfd = new SimpleDateFormat("dd/MM/yyyy");
 System.out.println("sdf: " + sdf.format(date2)); */