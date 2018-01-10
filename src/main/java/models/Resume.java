package models;
import java.util.ArrayList;

public class Resume {
    private String title;
    private String name;
    private String location;
    private String employmentDate;
    private final String content;
    private static ArrayList<Resume> instances = new ArrayList<>();

    public Resume (String content, String title, String name, String location, String employmentDate){
        this.content = content;
        this.title = title;
        this.name = name;
        this.location = location;
        this.employmentDate = employmentDate;
        instances.add(this);
    }

    public String getContent() {
        return content;
    }
    public String getTitle() {
        return title;
    }
    public String getName() {
        return name;

    }public String getLocation() {
        return location;

    }public String getEmploymentDate() {
        return employmentDate;

    }

    public static ArrayList<Resume> getAll(){
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }



}