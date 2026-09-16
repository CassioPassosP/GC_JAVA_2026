public class AudioBook extends Midia{
    private String narrator;

    public AudioBook( String title, int timeInMinutes, String narrator) {
        super(title, timeInMinutes);
        this.narrator = narrator;
    }

    @Override
    public String displayInformation() {
        return "Titulo: " + super.getTitle() + "\n" +
               "Duracao: " + super.getTimeInMinutes() + "\n" +
               "Narrador: " + getNarrator() + "\n";
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
}
