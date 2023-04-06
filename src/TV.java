public class TV extends ProdutoEletronico {

    private int tamanho;

    public TV(String produto, int preco, int tamanho) {
        super(produto, preco);
        this.tamanho = tamanho;
    }

    @Override
    void ligar() {
        System.out.println("Ligando " + produto + "\n" + tamanho + " Polegadas" + "\n" + "Preço " + preco);
    }

    @Override
    void desligar() {

        System.out.println("Desligando " + produto + "\n" + tamanho + " Polegadas" + "\n" + "Preço " + preco);
    }

}
