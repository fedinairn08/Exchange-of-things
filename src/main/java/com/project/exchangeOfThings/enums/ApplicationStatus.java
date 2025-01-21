package com.project.exchangeOfThings.enums;

public enum ApplicationStatus {
    UNDER_CONSIDERATION("На рассмотрении"),
    REJECTED("Отклонен"),
    APPROVED("Одобрен");

    private final String status;

    ApplicationStatus(String status) {this.status = status;}
}
