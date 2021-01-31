import java.io.Serializable;

public class Aircrafts implements Serializable {
    private Long id;
    private String name;
    private String model;
    private int business_class_capacity;
    private int economy_class_capacity;
    public Aircrafts(){}
    public Aircrafts(Long id, String name, String model, int business_class_capacity, int economy_class_capacity) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.business_class_capacity = business_class_capacity;
        this.economy_class_capacity = economy_class_capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBusiness_class_capacity() {
        return business_class_capacity;
    }

    public void setBusiness_class_capacity(int business_class_capacity) {
        this.business_class_capacity = business_class_capacity;
    }

    public int getEconomy_class_capacity() {
        return economy_class_capacity;
    }

    public void setEconomy_class_capacity(int economy_class_capacity) {
        this.economy_class_capacity = economy_class_capacity;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", business_class_capacity=" + business_class_capacity +
                ", economy_class_capacity=" + economy_class_capacity +
                '}';
    }
}
