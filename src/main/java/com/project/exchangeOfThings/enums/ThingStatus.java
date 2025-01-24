package com.project.exchangeOfThings.enums;

public enum ThingStatus {
    EXPOSED("Выставлена"),
    NOT_EXPOSED("Не выставлена");

    private final String status;

    ThingStatus(String status) {this.status = status;}

    public String getRussianName() {
        return status;
    }
}
