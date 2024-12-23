class Marks{
    private int grade;
    void setGrade(int grade){
        this.grade=grade;
    }
    int getGrade(){
        return grade;
    }
}
public class A6 {
    public static void main(String[] args){
        Marks p=new Marks();
        p.setGrade(70);
        System.out.println(p.getGrade());
    }
}
