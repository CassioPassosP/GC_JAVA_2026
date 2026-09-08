package velhoStreveRefactor.classes;

import velhoStreveRefactor.enums.Materials;

public class AbstractTool {
    private String name;
    private int durability;
    private Materials materials;

    public AbstractTool(String name, int durability, Materials materials) {
        this.name = name;
        this.durability = durability;
        this.materials = materials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }
}
