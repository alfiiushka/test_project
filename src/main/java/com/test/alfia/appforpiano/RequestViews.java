package com.test.alfia.appforpiano;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestViews {

    private List<RequestViewDTO> items;

    public List<RequestViewDTO> getItems() {
        return items;
    }

    public void setItems(List<RequestViewDTO> items) {
        this.items = items;
    }

    public RequestViews() {
    }

    public RequestViews(List<RequestViewDTO> items) {
        this.items = items;
    }
}

