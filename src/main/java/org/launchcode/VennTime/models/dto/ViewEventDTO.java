package org.launchcode.VennTime.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

public class ViewEventDTO {

    @NotBlank(message= "Name field is required")
    @Size(min=2, max=50, message= "Name must be at least 3 characters long.")
    private String name;


    private List<String> availableStartTimes;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAvailableStartTimes() {
        return availableStartTimes;
    }

    public void setAvailableStartTimes(List<String> availableStartTimes) {
        this.availableStartTimes = availableStartTimes;
    }
}
