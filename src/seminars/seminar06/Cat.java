package seminars.seminar06;

public class Cat {
    private String name;
    private String poroda;
    private int age;
    private String owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", poroda: " + poroda + ", owner: " + owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Cat){
            Cat cat = (Cat) obj;
            return name.equals(cat.name) && age == cat.age && poroda.equals(cat.poroda) && owner.equals(cat.owner);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*age + 13*poroda.hashCode() + 17*owner.hashCode();
    }
}
