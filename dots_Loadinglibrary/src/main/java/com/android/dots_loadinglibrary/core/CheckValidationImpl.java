package com.android.dots_loadinglibrary.core;

public class CheckValidationImpl implements CheckValidation{
    @Override
    public boolean isCountValid(int value) {
        return value > 0;
    }

    @Override
    public boolean isDurationValid(int value) {
        return value > 0;
    }
}
