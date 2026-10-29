public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Post Malone";
        minhaMusica.artista = "Congratulations";
        minhaMusica.anoLancamento = 2016;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(9.5);
        minhaMusica.avalia(8.8);
        minhaMusica.avalia(7.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}