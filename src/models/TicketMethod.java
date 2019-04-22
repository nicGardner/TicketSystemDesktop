package models;

public class TicketMethod {

    private int method_id;
    private String name, description;

    public TicketMethod(int method_id, String name, String description)
    {
        setMethod_id(method_id);
        setName(name);
        setDescription(description);
    }

    public int getMethod_id() {
        return method_id;
    }

    public void setMethod_id(int method_id) {
        this.method_id = method_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
