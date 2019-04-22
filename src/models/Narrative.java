package models;

import java.time.LocalDate;

public class Narrative {

    private int narrative_id;
    private String comment;
    private LocalDate timestamp;

    public Narrative(int narrative_id, String comment, LocalDate timestamp)
    {
        setNarrative_id(narrative_id);
        setComment(comment);
        setTimestamp(timestamp);
    }

    public int getNarrative_id() {
        return narrative_id;
    }

    public void setNarrative_id(int narrative_id) {
        this.narrative_id = narrative_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }



}
