public abstract class ProdutoEletronico {
    protected String produto;
    protected int preco;

    public ProdutoEletronico(String produto, int preco) {
        this.produto = produto;
        this.preco = preco;
     }

    abstract void ligar();

    abstract void desligar();
}
