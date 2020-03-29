package com.example.interfaceinjava;

public class Boxer implements Fighter {
    @Override
    public String throwJab() {
        return "Throw faster jab";
    }

    @Override
    public String throwCross() {
        return "Throw faster cross";
    }

    @Override
    public String throwHook() {
        return "Throw faster hook";
    }

    @Override
    public String throwUppercut() {
        return "Throw faster uppercut";
    }
}
