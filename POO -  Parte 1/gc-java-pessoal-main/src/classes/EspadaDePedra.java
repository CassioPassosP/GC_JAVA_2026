package classes;

public class EspadaDePedra {
    private String cabo;
    private  String material;
    int durabilidade;
    int dano;
    String fio;

    public EspadaDePedra(){

    }

    public EspadaDePedra(String cabo, String material, int durabilidade, int dano, String fio) {
        this.cabo = cabo;
        this.material = material;
        this.durabilidade = durabilidade;
        this.dano = dano;
        this.fio = fio;
    }

    public String getCabo() {
        return cabo;
    }

    public void setCabo(String cabo) {
        this.cabo = cabo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Espada de pedra criada!";
    }
}
