/** A representation of a rectangle. */
public class Rectangle {
  private double width;
  private double height;

  /** Initialize rectangle.
   *
   * @param w width
   * @param h height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /** Find area of rectangle.
   */
  public double area() {
    return width * height;
  }

  /** Scales the rectangle.
   *
   * @param factor increases size of rectangle by this factor
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /** Determine if this rectangle is bigger than {@code other} rectangle.
   *
   * @param other a rectangle to compare to
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
