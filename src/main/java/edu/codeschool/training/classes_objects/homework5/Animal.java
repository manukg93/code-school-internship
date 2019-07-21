package edu.codeschool.training.classes_objects.homework5;

abstract  class Animal {
    private String name;

    abstract void greeting();
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
