public class Film extends Midia{
    private String director;

    public Film(String title, int timeInMinutes, String director) {
        super(title, timeInMinutes);
        this.director = director;
    }

    @Override
    public String displayInformation() {
        return "Titulo: " + super.getTitle() + "\n" +
                "Duracao: " + super.getTimeInMinutes() + "\n" +
                "Diretor: " + getDirector() + "\n";
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
