package com.example.project;

public class Triangle {
    // array of Point objects
    private Point[] vertices;
    public Point p1;
    public Point p2;
    public Point p3;
    
    // Constructor: initializes the vertices array
    // to contain the three Point objects
    public Triangle(Point p1, Point p2, Point p3) {
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
     vertices = new Point[] {p1,p2,p3};
    }
    // Getter method for vertices 
    public Point[] getVertices() { 
      return vertices; 
    } 
    public Point getP1() {
      return p1;
    }
    public Point getP2() {
      return p2;
    }
    public Point getP3() {
      return p3;
    }
    // Setter method for vertices 
    public void setP1(int x,int y){
      p1.setX(x);
      p1.setY(y);
    }
    public void setP2(int x,int y){
      p2.setX(x);
      p2.setY(y);
    }
    public void setP3(int x,int y){
      p3.setX(x);
      p3.setY(y);
    }
    public double perimeter() {
      return vertices[0].distanceTo(vertices[1]) +
      vertices[1].distanceTo(vertices[2]) +
      vertices[2].distanceTo(vertices[0]);
}

  
    // Returns a String with the three vertices that make up the Triangle;
    // if the vertices are the points (6, 10), (11, 15), and (18, 7),
    // this method should return: "[(6, 10), (11, 15), (18, 7)]"
    public String triangleInfo() {
      return "[" + vertices[0].pointInfo() + ", " +
      vertices[1].pointInfo() + ", " +
      vertices[2].pointInfo() + "]";
}
}
    
  