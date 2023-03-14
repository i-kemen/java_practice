package com.nhk.game;

public class Wand {
    private String name; // 지팡이의 이름
    private double power; // 지팡이의 마력

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 합니다.");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3글자 이상이어야 합니다.");
        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100) {
            throw new IllegalArgumentException("지팡이의 마력은 0.5 이상 100.0 이하여야 합니다.");
        }
        this.power = power;
    }

}
