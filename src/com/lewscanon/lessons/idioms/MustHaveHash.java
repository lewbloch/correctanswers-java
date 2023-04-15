package com.lewscanon.lessons.idioms;

import java.util.HashMap;
import java.util.Map;

public class MustHaveHash {
    enum Role {
        DIRECTOR, ASSOCIATE, LACKEY
    }

    static String FORMAT_MAP = "%s: %s%n";
    public static void main(String... args) {
        var associations = Map.of(
                Role.DIRECTOR, "Francie",
                Role.ASSOCIATE, "Dancie",
                Role.LACKEY, "Stancie"
        );
        System.out.printf(FORMAT_MAP, "associations", associations);

        Map<Role, String> dynamicAssociations = new HashMap<>(associations);
        dynamicAssociations.put(Role.DIRECTOR, "Birk");
        System.out.printf(FORMAT_MAP, "dynamicAssociations", dynamicAssociations);
    }
}
