package code.school.internship.classes_and_objects.homework.homework7;

public Boolean or(Boolean other) {
    return new Boolean(this.value || other.value);
}

@Override
public String toString(){
    return""+this.value;
}