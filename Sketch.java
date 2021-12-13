import processing.core.PApplet;

public class Sketch extends PApplet {
	

  public void settings() {
	// put your size call here
    size(500, 500);
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
    rect(0, 120, 85, 300);
    rect(85, 155, 80, 300);
    rect(165, 140, 80, 300);
    rect(310, 170, 70, 300);
    rect(220, 190, 100, 300);
    rect(360, 135, 80, 300);
    rect(430, 125, 80, 300);
    
    // Draws Buildings (Front Layer)
    stroke(50);
    fill(70);
    rect(0, 210, 80, 300);
    stroke(48);
    fill(65);
    rect(65, 180, 105, 340);
    rect(250, 235, 85, 300);
    stroke(50);
    fill(70);
    rect(width * 0.32f, height * 0.6f, 140, 340);
    triangle(158, 300, 230, 250, 302, 300);
    rect(320, 255, 100, 300);
    rect(385, 215, 80, 300);
    rect(440, 285, 80, 300);
    
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