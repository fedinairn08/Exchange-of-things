package com.project.exchangeOfThings.enums;

public enum Roles {
    ADMIN("Администратор"),
    MODER("Модератор"),
    USER("Пользователь");

    private final String role;

    Roles(String role) {this.role = role;}

    public String getRussianName() {
        return role;
    }
}
