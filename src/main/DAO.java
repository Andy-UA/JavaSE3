package main;

import obj.*;

import java.util.List;

/**
 * Created by Andrew on 06.03.2017.
 */
public interface DAO {
    boolean insert(Object object);
    boolean update(Object object, String name);
    boolean delete(Object object);
}
