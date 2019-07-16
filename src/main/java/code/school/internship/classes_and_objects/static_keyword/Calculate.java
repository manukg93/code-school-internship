package code.school.internship.classes_and_objects.static_keyword;

class Calculate{
  static int cube(int x){  
  return x*x*x;  
  }  
  
  public static void main(String args[]){  
  int result=Calculate.cube(5);  
  System.out.println(result);  
  }  
}  