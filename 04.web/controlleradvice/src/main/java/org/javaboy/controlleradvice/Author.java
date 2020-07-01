package org.javaboy.controlleradvice;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/7 15:42
 */
public class Author {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
