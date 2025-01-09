package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  // Getter for x 
  public int getX() { 
    return x;
  }
  // Setter for x 
  public void setX(int x) { 
    this.x = x; } 
    // Getter for y 
    public int getY() { 
      return y; } 
    // Setter for y 
    public void setY(int y) { 
      this.y = y; }
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
       int distancex = other.x - this.x;
       int distancey = other.y - this.y; 
       return Math.sqrt(distancex*distancex + distancey*distancey);
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "(" + x + ", " + y + ")";
    }
   
    }
  
  