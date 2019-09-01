package edu.codeschool.training.classes_objects.homework_16_Generics.ex_3;


public class Painter<T extends Drawable> {

    public void paint(T shape)  {
        shape.draw();
        }
    }