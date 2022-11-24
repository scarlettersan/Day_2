package CustomClass;


//create a class named 'Rectangle' with two data members 'length' and 'breadth' and
// two methods to print the area and perimeter of the rectangle respectively.
// Its constructor having parameters
// for length and breadth is used to initialize length and breadth of the rectangle.


import sun.security.util.Length;

public class RectangleClass {

  //Encapsulation
  // public, private, protected and Default
  public int Length;
  public int Breadth;

  ///create a constructor
  ///will take 2 parameters
  //public ClassName(ParameterType ParameterName,........)
  public RectangleClass(int param1, int param2){
    Length= param1;
    Breadth = param2;
  }

  /// PrintArea :  This method will print the area of Rectangle
  /// Return Type = void
  /// no parameters

  // PublicOrPrivate StaticOrNot ReturnType MethodName(ParameterType ParameterName,........)
  public void PrintArea(){
    System.out.println("The area = "+(Length*Breadth));
  }

  ///PrintPerimeter : This method will print perimeter of Rectangle
  /// Return type void
  ///no parameters
  /// 2(l+b)
  public void PrintPerimeter(){
    System.out.println("The Perimeter = "+(2*(Length+Breadth)));
  }
}
