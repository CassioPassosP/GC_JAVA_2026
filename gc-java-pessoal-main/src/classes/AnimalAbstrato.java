package classes;

public abstract class AnimalAbstrato {
    private String name;

    public AnimalAbstrato (String name){
        this.name = name;
    }

    public abstract void emitirSom();

    public String getName(){
        return name;
    }
}
