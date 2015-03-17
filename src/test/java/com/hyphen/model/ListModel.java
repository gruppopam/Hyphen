package com.hyphen.model;

import java.util.List;

public class ListModel {
    private List<Integer> numbers;

    public ListModel(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
