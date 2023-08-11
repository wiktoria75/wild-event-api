package com.wildevent.WildEventMenager.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

public class ReceivedWildUserDTO {
    @NotNull
    @Size(min = 3, max = 40)
    private String name;
    @NotNull
    @Email
    private String email;
    @Pattern(regexp = "^\\d{9}$", message = "Invalid phone number format")
    private String phone;
    @NotNull
    private boolean active;
    private List<String> locationIds;
    private List<String> roleIds;
}
