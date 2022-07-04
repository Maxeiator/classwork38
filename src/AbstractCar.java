public abstract class AbstractCar {
    private String mark;
    private String cabin;
    private int age;
    private int price;
    private String color;

    public AbstractCar(String mark,String cabin,int age,int price,String color) {
        this.mark = mark;
        this.cabin = cabin;
        this.age = age;
        this.price = price;
        this.color = color;
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCabin() {
        return cabin;
    }
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "mark ='" + mark + '|' +
                ", cabin ='" + cabin + '|' +
                ", age =" + age + '|' +
                ", price =" + price + '|' +
                ", color =" + color + "\n";
    }
}
