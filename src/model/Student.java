package model;

public class Student {
    private String name;
    private String email;
    private String group;

    public Student(){

    }
    public Student(String name, String email, String group) {
        this.name = name;
        this.email = email;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    @Override
    public String toString() {
        System.out.println(this.name + " " + this.email + " " + this.group);
        return null;
    }
}
