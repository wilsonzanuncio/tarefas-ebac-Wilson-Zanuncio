package factory;

public class Customer {

    private String gradeRequest;
    private boolean isForFarmwork;

    public Customer(String gradeRequest, boolean isForFarmwork) {
        this.gradeRequest = gradeRequest;
        this.isForFarmwork = isForFarmwork;
    }

    public boolean isForFarmwork() {
        return isForFarmwork;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }
}
