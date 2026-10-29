public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Polo";
        meuCarro.ano = 2023;
        meuCarro.cor = "Vermelho";

        // Exibir ficha técnica
        meuCarro.exibeFichaTecnica();

        // Calcular idade do carro
        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");
    }
}