public class SmartPhone extends ProdutoEletronico {

    private String marca;

    public SmartPhone(String produto, int preco, String marca) {
        super(produto, preco);
        this.marca = marca;
    }

    @Override
    void ligar() {
        System.out.println("Ligando " + produto + "\n" + marca + "\n" + "Preço " + preco);

    }

    @Override
    void desligar() {

        System.out.println("Desligando " + produto + "\n" + marca + "\n" + "Preço " + preco);

    }

}
