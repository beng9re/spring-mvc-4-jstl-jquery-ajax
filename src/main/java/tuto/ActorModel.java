package tuto;

public class ActorModel {
    private String id;
    private String name;
    private String title;
    private String age;

    public ActorModel() {
        this("", "", "", "");
    }

    public static ActorModel convert(Actor actor) {
        if (actor.getId() == null) {
            return new ActorModel();
        }
        return new ActorModel(String.valueOf(actor.getId())
                , actor.getName()
                , actor.getTitle()
                , String.valueOf(actor.getAge()));
    }

    public ActorModel(String id, String name, String title, String age) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.age = age;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
