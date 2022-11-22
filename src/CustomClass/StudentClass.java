package CustomClass;


import java.util.ArrayList;


public class StudentClass {
    //Fields
    public String Name;
    public String StudentNumber;
    private Integer Year;

    private ArrayList<Integer> HomeworkResults;

    //Constructor
    public StudentClass(){
        Year = 2022;
        HomeworkResults = new ArrayList<Integer>();
        System.out.println("Someone Created a StudentClass");
    }

    ///AddHomeworkResult : This method will add a Result to Your Homework
    ///Return Type = No Return
    ///@param1 is an Integer value

    // PublicOrPrivate StaticOrNot ReturnType MethodName(ParameterType, ParamaterName,...)
    public void AddHomeworkResult(int param1){
        HomeworkResults.add(param1);

    }
}
