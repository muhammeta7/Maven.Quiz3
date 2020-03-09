package rocks.zipcode.io.quiz3.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {

    String labName;
    LabStatus status;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {
        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.status = labStatus;
    }

    public LabStatus getStatus() {
        return status;
    }


}
