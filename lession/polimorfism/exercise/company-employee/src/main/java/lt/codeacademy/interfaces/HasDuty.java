package lt.codeacademy.interfaces;

import lt.codeacademy.model.employee.DutyType;

/**
 * Indicates that the employee has a duty within the company
 */
public interface HasDuty {

    DutyType getDuty();
}
