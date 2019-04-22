package models;

import java.util.ArrayList;

public class SuperTicket {

    private int super_id;
    private String name;
    private String description;
    private ArrayList<Ticket> tickets = new ArrayList();

    public SuperTicket(int super_id, String name, String description)
    {
        setSuper_id(super_id);
        setName(name);
        setDescription(description);
    }

    public int getSuper_id() {
        return super_id;
    }

    public void setSuper_id(int super_id) {
        this.super_id = super_id;
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

    public ArrayList<Ticket> getTickets ()
    {
        return tickets;
    }

    public void addTicket (Ticket ticket)
    {
        tickets.add(ticket);
    }
}
