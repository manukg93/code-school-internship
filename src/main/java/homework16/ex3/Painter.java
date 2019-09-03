package homework16.ex3;


public class Painter < T extends Drawable>{
  public void paint(T shape){
     shape.draw();
  }
}
