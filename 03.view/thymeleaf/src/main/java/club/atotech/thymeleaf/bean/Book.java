package club.atotech.thymeleaf.bean;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/1/12 17:58
 */
public class Book {
    private Integer id;
    private String name;
    private String autjor;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutjor() {
        return autjor;
    }

    public void setAutjor(String autjor) {
        this.autjor = autjor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", autjor='" + autjor + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(Integer id, String name, String autjor, Double price) {
        this.id = id;
        this.name = name;
        this.autjor = autjor;
        this.price = price;
    }
}
