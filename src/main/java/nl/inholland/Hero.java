package nl.inholland;

public class Hero {
    String id;
    String name;
    String category;

    public Hero(String id, String name, String category){
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Hero(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

}
