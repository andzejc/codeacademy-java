package lt.codeacademy.service;

import lt.codeacademy.model.employee.DutyType;
import lt.codeacademy.model.employee.Employee;
import lt.codeacademy.interfaces.Likeable;

import java.util.Collection;

/**
 * This class is responsible for managing likes
 */
public class LikeManager {

    /**
     * @param likeable employee
     * @return number of likes given employee has
     */
    public int getNumberOfLikesByEmployee(Likeable likeable) {
        return likeable.getNumberOfLikes();
    }

    /**
     * @param receiver where the like should be given
     * @param giver who gave the like
     */
    public void giveLike(Employee receiver, Employee giver) {
        receiver.giveLike(giver);
    }

    /**
     * @param employees list of employees within the company
     * @param dutyType if present, total likes will by filtered by the given duty
     * @return number of likes given
     */
    public int getTotalLikesByDuty(Collection<Employee> employees, DutyType dutyType) {
        int totalLikes = 0;
        for (Employee employee : employees) {
            if (dutyType == null || employee.getDuty().equals(dutyType)) {
                totalLikes += employee.getNumberOfLikes();
            }
        }
        return totalLikes;
    }
}
