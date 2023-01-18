package Anything.W2D4inClass;

import java.util.ArrayList;

public interface CRUDInterface {
    public boolean create(String connection);
    public boolean update(String connection);
    public ArrayList select(String connection);
    public boolean delete(String connection);
}
