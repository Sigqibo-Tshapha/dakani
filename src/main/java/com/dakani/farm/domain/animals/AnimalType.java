package com.dakani.farm.domain.animals;


import com.dakani.farm.domain.buildings.Building;

import java.util.Date;

public enum AnimalType {
    BOVINE(1, "Bovine");

    private final int code;
    private final String displayName;

    AnimalType(int code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static String getAnimalType(int code) {
        for (AnimalType type: AnimalType.values()) {
            if (type.getCode() == code) {
                return type.getDisplayName();
            }
        }

        throw  new RuntimeException("Invalid animal code provided: " + code);
    }

    public static Animal createAnimal(int age, AnimalType type, Date dateOfPurchase, Date dateOfBirth, double lifeSpan,
                                      String name, Building building) {
        return switch (type) {
            case BOVINE -> new Cow(age, dateOfPurchase, dateOfBirth, lifeSpan, name, building);
        };
    }

}
