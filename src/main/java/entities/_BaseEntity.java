package entities;

public abstract class _BaseEntity {
    private int id;

    public _BaseEntity() {
    }
    public _BaseEntity(int id) {
        this.id = id;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
