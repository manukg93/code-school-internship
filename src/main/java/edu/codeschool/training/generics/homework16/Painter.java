package edu.codeschool.training.generics.homework16;

public class Painter {

    public static void paint(Collection <? extends Drawable> dr) {

        for (int i = 0; i < dr.size(); i++) {
            dr.getElementAtIndex(i).draw();
        }
    }
}
