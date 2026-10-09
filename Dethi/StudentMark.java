public class StudentMark {
    private String fullName;
    private double theoryMark;
    private double practicalMark;
    private double assignmentMark;
    public StudentMark(String fullName, double theoryMark, double practicalMark, double assignmentMark) {
        this.fullName = fullName;
        this.theoryMark = theoryMark;
        this.practicalMark = practicalMark;
        this.assignmentMark = assignmentMark;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getTheoryMark() {
        return theoryMark;
    }
    public void setTheoryMark(double theoryMark) {
        this.theoryMark = theoryMark;
    }
    public double getPracticalMark() {
        return practicalMark;
    }
    public void setPracticalMark(double practicalMark) {
        this.practicalMark = practicalMark;
    }
    public double getAssignmentMark() {
        return assignmentMark;
    }
    public void setAssignmentMark(double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }
    public StudentMark() {

    }
    public boolean checkPass(){
        if(theoryMark>=40 && practicalMark>=40&&assignmentMark>=4.0){
            return true;
        }else{
            return false;
        }
    }
    public void displayResult(){
        System.out.println("Họ và tên sinh viên: "+fullName);
        System.out.println("Điểm lý thuyết: "+theoryMark+"/100");
        System.out.println("Điểm thực hành: "+practicalMark+"/100");
        System.out.println("Điểm bài tập lớn: "+assignmentMark+"/10");
        if(checkPass()){
            System.out.println("Đã ĐẠT(PASS)");
        }else{
            System.out.println("TRƯỢT(FAIL)");
        }
    }
}
