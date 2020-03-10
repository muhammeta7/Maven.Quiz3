package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {

        for(Lab lab : labs){
            if(lab.getName().equals(labName)){
                return lab;
            }
        }
        return null;

    }

    public void setLabStatus(String labName, LabStatus labStatus) {

        if(labs.size() == 0){
            throw new UnsupportedOperationException();
        }
        Lab someLab = getLab(labName);
        someLab.setStatus(labStatus);

    }

    public void forkLab(Lab lab) {
        labs.add(0, lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        Lab someLab = getLab(labName);
        return someLab.getStatus();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(Lab lab : labs){
           str.append(lab.getName()).append(" > ").append(lab.getStatus()).append('\n');
        }
        return str.substring(0,str.length()-1);
    }
}
