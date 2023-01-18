package Anything.W2D4inClass;

import java.util.ArrayList;

public class Option implements CRUDInterface{

    private String name;
    private double price;
    private String description;
    @Override
    public boolean create(String connection) {
        return false;
    }

    @Override
    public boolean update(String connection) {
        return false;
    }

    @Override
    public ArrayList select(String connection) {
        return null;
    }

    @Override
    public boolean delete(String connection) {
        return false;
    }
}
