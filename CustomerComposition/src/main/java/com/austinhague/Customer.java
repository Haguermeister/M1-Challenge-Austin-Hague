package com.austinhague;

import java.util.Objects;

public class Customer {

    public String firstName;
    public String lastName;
    private String email;
    private String phone;
    private boolean rewards;

    private Address shippingAddress;
    private Address billingAddress;

    public Customer(String firstName, String lastName, String email, String phone, boolean rewards, Address shippingAddress, Address billingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.rewards = rewards;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isRewards() {
        return rewards;
    }

    public void setRewards(boolean rewards) {
        this.rewards = rewards;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", rewards=" + rewards +
                ", shippingAddress=" + shippingAddress +
                ", billingAddress=" + billingAddress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return rewards == customer.rewards && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(phone, customer.phone) && Objects.equals(shippingAddress, customer.shippingAddress) && Objects.equals(billingAddress, customer.billingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phone, rewards, shippingAddress, billingAddress);
    }
}
