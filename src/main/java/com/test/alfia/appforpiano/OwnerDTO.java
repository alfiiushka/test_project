package com.test.alfia.appforpiano;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OwnerDTO {

    private String display_name;
    private Long user_id;

    public OwnerDTO(String display_name, Long user_id) {
        this.display_name = display_name;
        this.user_id = user_id;
    }

    public OwnerDTO() {
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
