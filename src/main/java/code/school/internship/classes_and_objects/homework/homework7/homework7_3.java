package code.school.internship.classes_and_objects.homework.homework7;

@Override
public boolean equals(Object obj) {
        return super.equals(obj);
        if (this == obj)
        return true;
        if (obj == null)
        return false;
        if (obj instanceof Department ){
        Department department = (Department) obj;
        if (this.name.equals(department.name)&& this.employeeCount == department.employeeCount)
        return true;
        }
        return false;
        }
