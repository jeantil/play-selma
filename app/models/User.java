package models;

import org.joda.time.DateTime;

public class User{
    public User() {
    }

    public User(String name, Integer age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    private String name;
    private Integer age;
    private String id;
    private String created;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
