package tuto;

public class Actor {
    private Long id;
    private String name;
    private String title;
    private int age;

    public Actor() {
        this.name = "";
        this.title = "데이터 없음";
        this.age = 0;
    }

    public static Actor emptyActor() {
        return new Actor("", "", 0);
    }

    public Actor(Actor actor) {
        this(actor.name, actor.title, actor.age);
    }

    public Actor(String name, String title, int age) {
        this.name = name;
        this.title = title;
        this.age = age;
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

    public String getTitle() {
        return title;
    }

    public int getAge() {
        return age;
    }

}
