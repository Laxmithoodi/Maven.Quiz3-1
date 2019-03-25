package rocks.zipcode.io.quiz3.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

   private Map <Lab, LabStatus> map;

    public Student() {

       this.map = new TreeMap<>();
    }

    public Student(Map<Lab, LabStatus> labs) {
        this.map = labs;

    }

    public Lab getLab(String labName) {
        for (Lab lab: map.keySet()) {
            if(lab.equals(labName));
            return lab;

        }


        return null;

    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        if(lab==null){
            throw new UnsupportedOperationException();
        }
        map.put(lab, labStatus);


    }


    public void forkLab(Lab lab) {
        map.put(lab, LabStatus.PENDING);

    }

    public LabStatus getLabStatus(String labName) {
        Lab lab = getLab(labName);
        return map.get(lab);
    }
}
