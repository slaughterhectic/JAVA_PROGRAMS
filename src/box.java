public class box {
    private double width;
      private double height;
      private double depth;
     box(int width, int height, int depth){
                  this.width = width;
                 this.height = height;
                  this.depth = depth;
            }
      double getVolume() {
              return width * height * depth;
            }
    static public void main(String[] args) {

                 box b= new box(10, 20, 30);
               System.out.print("The volume of Box is " + b.getVolume());
            }
 }