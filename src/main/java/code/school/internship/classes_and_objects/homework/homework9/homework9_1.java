package code.school.internship.classes_and_objects.homework.homework9;

   this.surface = surface;
           }

public String getName() {
        return name;
        }

public long getCountOfResidents() {
        return countOfResidents;
        }

public double getSurface() {
        return surface;
        }

@Override
protected City clone() throws CloneNotSupportedException {
        return (City)super.clone();
