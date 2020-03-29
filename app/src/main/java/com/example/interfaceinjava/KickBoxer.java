package com.example.interfaceinjava;

public class KickBoxer implements Fighter {
    @Override
    public String throwJab() {
        return "Throw harder jab";
    }

    @Override
    public String throwCross() {
        return "Throw harder cross";
    }

    @Override
    public String throwHook() {
        return "Throw harder hook";
    }

    @Override
    public String throwUppercut() {
        return "Throw harder Uppercut";
    }
}
