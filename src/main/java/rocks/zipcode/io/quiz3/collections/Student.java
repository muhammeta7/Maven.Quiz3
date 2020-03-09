package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    Map<Lab, LabStatus> labs;


    public Student() {
        this.labs = new TreeMap<>();
    }

    public Student(List<Lab> labs) {
    }

    public Lab getLab(String labName) {
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
    }

    public void forkLab(Lab lab) {

    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }
}
