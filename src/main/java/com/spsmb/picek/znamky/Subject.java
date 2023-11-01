package com.spsmb.picek.znamky;

import java.util.List;

public class Subject {
    private String name;

    public static double diameter(List<Integer> numbers) {
        double number = 0;
        for (int i = 0; i < numbers.size(); i++) {
            number = number + numbers.get(i);
        }

        return number / numbers.size();
    }

}
