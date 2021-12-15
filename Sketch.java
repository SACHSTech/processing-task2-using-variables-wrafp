import processing.core.PApplet;

public class Sketch extends PApplet {
  public int intSizeX = 500;
  public int intSizeY = 300;

  public void settings() {
    size(intSizeX, intSizeY);
  }

  public void setup() {
      background(77, 27, 135);
  } 

  public void draw() {

    // Draws Moon

    strokeWeight(3);
    stroke(97, 48, 65);
    fill(222, 177, 177);
    stroke(222, 177, 177);
    ellipse(width / 1.18f, height / 10, width / 10, width / 10);
    fill(77, 27, 135);
    stroke(77, 27, 135);
    ellipse(width * 0.89f, height / 10, width / 10, width / 10);
    
    // Draws Buildings (Back Layer)
    strokeWeight(3);
    stroke(45);
    fill(60);
    rect(0, intSizeX / 4.17f, intSizeX / 5.88f, intSizeY / 1.67f);
    rect(intSizeX / 5.88f, intSizeY / 3.23f, intSizeX / 6.25f, intSizeY / 1.67f);
    rect(intSizeX / 3.03f, intSizeY / 3.57f, intSizeX / 6.25f, intSizeY / 1.67f);
    rect(intSizeX / 1.61f, intSizeY / 2.94f, intSizeX / 7.14f, intSizeY / 1.67f);
    rect(intSizeX / 2.27f, intSizeY / 2.63f, intSizeX / 5, intSizeY / 1.67f);
    rect(intSizeX / 1.39f, intSizeY / 3.7f, intSizeX / 6.25f, intSizeY / 1.67f);
    rect(intSizeX / 1.16f, intSizeY / 4, intSizeX / 6.25f, intSizeY / 1.67f);
    
    // Draws Buildings (Front Layer)
    stroke(50);
    fill(70);
    rect(0, intSizeY / 2.38f, intSizeX / 6.25f, intSizeY / 1.67f);
    stroke(48);
    fill(65);
    rect(intSizeX / 7.69f, intSizeY / 2.78f, intSizeX / 4.76f, intSizeY / 1.4f);
    rect(intSizeX / 2, intSizeY / 2.13f, intSizeX / 5.88f, intSizeY / 1.67f);
    stroke(50);
    fill(70);
    rect(width * 0.32f, height * 0.6f, 140, intSizeY / 1.4f);
    triangle(intSizeX / 3.16f, intSizeY / 1.67f, intSizeX / 2.17f, intSizeY / 2, intSizeX / 1.66f, intSizeY / 1.67f);
    rect(intSizeX / 1.56f, intSizeY / 1.96f, intSizeX / 5, intSizeY / 1.67f);
    rect(intSizeX / 1.3f, intSizeY / 2.33f, intSizeX / 6.25f, intSizeY / 1.67f);
    rect(intSizeX / 1.14f, intSizeY / 1.75f, intSizeX / 6.25f, intSizeY / 1.67f);
    
    // Draws Stars
    stroke(255);
    point(20, 60);
    point(50, 30);
    point(110, 120);
    point(80, 90);
    point(120, 50);
    point(190, 130);
    point(230, 80);
    point(240, 30);
    point(200, 20);
    point(280, 150);
    point(320, 30);
    point(330, 100);
    point(360, 60);
    point(450, 110);
    point(480, 20);
  }
}
  

