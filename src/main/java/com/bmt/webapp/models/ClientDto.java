package com.bmt.webapp.models;

import jakarta.validation.constraints.*;

public class ClientDto {

    @NotEmpty(message = "The first name is required")
    private String firstName;

    @NotEmpty(message = "The last name is required")
    private String lastName;

    @NotEmpty(message = "The email is required")
    @Email
    private String email;

    private String phone;
    private String address;

    @NotEmpty(message = "The status is required")
    private String status; // New, Permanent, Lead, Occasional, Inactive

    public @NotEmpty(message = "The first name is required") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotEmpty(message = "The first name is required") String firstName) {
        this.firstName = firstName;
    }

    public @NotEmpty(message = "The last name is required") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotEmpty(message = "The last name is required") String lastName) {
        this.lastName = lastName;
    }

    public @NotEmpty(message = "The email is required") @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty(message = "The email is required") @Email String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public @NotEmpty(message = "The status is required") String getStatus() {
        return status;
    }

    public void setStatus(@NotEmpty(message = "The status is required") String status) {
        this.status = status;
    }

}