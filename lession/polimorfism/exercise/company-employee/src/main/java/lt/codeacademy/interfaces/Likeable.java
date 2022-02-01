package lt.codeacademy.interfaces;

import lt.codeacademy.model.employee.Employee;

/**
 * Indicates that a person can get and receive likes
 */
public interface Likeable {

    int getNumberOfLikes();

    void giveLike(Employee giver);
}
