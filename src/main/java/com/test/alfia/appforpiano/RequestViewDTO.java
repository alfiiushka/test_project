package com.test.alfia.appforpiano;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestViewDTO {

    private LocalDate creation_date;
    private String title;
    private Boolean is_answered;
    private String link;

    public RequestViewDTO() { }

    public RequestViewDTO(LocalDate creation_date, String title, Boolean is_answered, String link) {
        this.creation_date = creation_date;
        this.title = title;
        this.is_answered = is_answered;
        this.link = link;
    }

    public LocalDate getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(LocalDate creation_date) {
        this.creation_date = creation_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getIs_answered() {
        return is_answered;
    }

    public void setIs_answered(Boolean is_answered) {
        this.is_answered = is_answered;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
