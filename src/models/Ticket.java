package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket {

    private int ticketId;
    private User assignedUser, creator;
    private String name, description;
    private LocalDate dateCreated, dueDate, dateClosed;
    private ArrayList<Narrative> narratives = new ArrayList();
    private ArrayList<TicketMethod> ticketMethods = new ArrayList();
    private ArrayList<TicketProperty> ticketProperties = new ArrayList();

    public Ticket (int ticketId, User assignedUser, User creator, String name, String description, LocalDate dateCreated, LocalDate dueDate, LocalDate dateClosed)
    {
        setTicketId(ticketId);
        setAssignedUser(assignedUser);
        setCreator(creator);
        setName(name);
        setDescription(description);
        setDateCreated(dateCreated);
        setDueDate(dueDate);
        setDateClosed(dateClosed);
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
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

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(LocalDate dateClosed) {
        this.dateClosed = dateClosed;
    }

    public ArrayList<Narrative> getNarratives()
    {
        return narratives;
    }

    public void addNarrative(Narrative narrative)
    {
        narratives.add(narrative);
    }

    public ArrayList<TicketMethod> getTicketMethods()
    {
        return ticketMethods;
    }

    public void addTicketMethod (TicketMethod method)
    {
        ticketMethods.add(method);
    }
}
