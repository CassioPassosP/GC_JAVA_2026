package velhoStreveRefactor.interfaces;

public interface Tool {

    String Make(String material, int durabilidade, int forca);

    int Repair(String material, int durabilidadeAtual, int quantidade);
}
