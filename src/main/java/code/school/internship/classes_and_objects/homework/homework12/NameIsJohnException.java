package code.school.internship.classes_and_objects.homework.homework12;

class NameIsJohnException extends Throwable {
    String message;

    public NameIsJohnException(){

    }
    public NameIsJohnException(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

}

