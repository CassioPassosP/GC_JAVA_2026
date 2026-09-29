public class Main {
    public static void main(String[] args) {
        Midia musica = new Midia("Bohemian Rhapsody", 6);
        AudioBook meuFilme = new AudioBook("Inception", 148, "Christopher Nolan");
        Film meuAudiobook = new Film("O Hobbit", 670, "Mauro Ramos");

        System.out.println(musica.displayInformation());
        System.out.println(meuFilme.displayInformation());
        System.out.println(meuAudiobook.displayInformation());
    }
}