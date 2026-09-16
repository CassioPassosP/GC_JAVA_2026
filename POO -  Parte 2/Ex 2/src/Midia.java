public class Midia {
    private String title;
    private int timeInMinutes;

    public Midia(String title, int timeInMinutes) {
        this.title = title;
        this.timeInMinutes = timeInMinutes;
    }

    public String displayInformation(){
        return "Titulo: " + title + "\n" +
               "Duracao: " + timeInMinutes + "\n";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }
}
