public class Employee {
    private String name;
    private String position;
    private Boolean isAway;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        this.isAway = false;
    }

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public Boolean getAway() {
        return isAway;
    }

    public void setAway(Boolean away) {
        isAway = away;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}
