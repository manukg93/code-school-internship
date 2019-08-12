package code.school.internship.classes_and_objects.homework.homework9;

public class City implements Cloneable {

   // instance fields
   String name;
   long countOfResidents;
   double surface;

   // constructors
   // default constructor
   public City() {
      this.name = "City";
      this.countOfResidents = 0;
      this.surface = 0.0;
   }

   // copy constructor
   public City(City cityObj) {
      if (cityObj != null) {
         this.name = cityObj.name;
         this.countOfResidents = cityObj.countOfResidents;
         this.surface = cityObj.surface;
      }
   }

   // parameterized constructor
   public City(String name) {
      if (name != null) {
         this.name = name;
         this.countOfResidents = 0;
         this.surface = 0;
      }
   }

   // setters and getter
   public void setName (String name) {
      if (name != null) {
         this.name = name;
      }
   }

   public String getName () {
      return this.name;
   }

   public void setCountOfResidents(long countOfResidents) {
      if (countOfResidents > 0) {
         this.countOfResidents = countOfResidents;
      }
   }

   public long getCountOfResidents() {
      return this.countOfResidents;
   }

   public void setSurface(double surface) {
      if (surface > 0) {
         this.surface = surface;
      }
   }

   public double getSurface() {
      return this.surface;
   }

   @Override
   public City clone() throws CloneNotSupportedException {
      return (City) super.clone();
   }

   @Override
   public String toString() {
      return "[" + this.name + ", Residents count: " + this.countOfResidents + ", Surface: "
              + this.surface + "]";
   }
}