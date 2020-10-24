// package
package net.sevecek.turtle;
// Importy

import net.sevecek.turtle.engine.Turtle;
import java.awt.*;

//* Přepište funkce tak, aby přijímaly jako parameter, želva, barva a velikost
//* Připravte a použijte další funkce na nakreslení dalších obrazců ,Víceúhelník, hvězdička, víceúhelník
// Třídy
public class HlavniProgram {

    Turtle donatelo = new Turtle();
    Turtle leonardo = new Turtle();

    public void main(String[] args) {
        Color donateloBarva = new Color(0, 255, 0);
        Color leonadrdoBarva = new Color(0, 0, 255);

        donatelo.setPenColor(new Color(0, 255, 0));
        leonardo.setPenColor(new Color(0, 0, 255));

        donatelo.turnRight(90);
        drawSquare(donatelo, donateloBarva);
        drawTriangle(leonardo, leonadrdoBarva);
        drawLegs(leonardo, leonadrdoBarva);

        donatelo.penUp();
        donatelo.turnRight(90);
        donatelo.move(200);

        nakresliL();
        nakresliE();
        nakresliN();
        nakresliK();
        nakresliA();

    }

    public void drawSquare(Turtle zelva, Color barva) {
        zelva.setPenColor(barva);
        for (int i = 0; i < 4; i++) {

            zelva.move(200.0);
            zelva.turnLeft(90);
            zelva.move(100.0);
        }

    }

    public void drawTriangle(Turtle zelva, Color barva) {
        zelva.setPenColor(barva);
        zelva.turnLeft(90);
        zelva.penUp();
        zelva.move(100.0);
        zelva.penDown();
        zelva.turnRight(45);
        zelva.move(210);
        zelva.turnRight(90);
        zelva.move(210);
        zelva.turnRight(135);
        zelva.move(300);
    }

    public void drawLegs(Turtle zelva, Color barva) {
        zelva.setPenColor(barva);
        zelva.turnRight(35);
        zelva.move(150);
        zelva.turnLeft(125);
        zelva.penUp();
        zelva.move(100);
        zelva.penDown();
        zelva.turnLeft(95);
        zelva.move(130);
        zelva.turnRight(95);
        zelva.penUp();
        zelva.move(300);
        zelva.penDown();
        zelva.turnRight(125);
        zelva.move(150);
        zelva.turnLeft(125);
        zelva.penUp();
        zelva.move(100);
        zelva.penDown();
        zelva.turnLeft(95);
        zelva.move(130);
    }
    public void nakresliL() {
        donatelo.penDown();
        donatelo.move(100);
        donatelo.turnLeft(90);
        donatelo.move(50);
        donatelo.penUp();
        donatelo.move(20);
        donatelo.turnLeft(90);
    }
    public void nakresliE (){
        donatelo.penDown();
        donatelo.move(100);
        donatelo.turnRight(90);
        donatelo.move(50);
        donatelo.turnLeft(180);
        donatelo.move(50);
        donatelo.turnLeft(90);
        donatelo.move(50);
        donatelo.turnLeft(90);
        donatelo.move(40);
        donatelo.turnLeft(180);
        donatelo.move(40);
        donatelo.turnLeft(90);
        donatelo.move(50);
        donatelo.turnLeft(90);
        donatelo.move(50);
        donatelo.penUp();
        donatelo.move(20);
        donatelo.turnLeft(90);
    }
    public void nakresliN (){
        donatelo.penDown();
        donatelo.move(100);
        donatelo.turnRight(155);
        donatelo.move(110);
        donatelo.turnLeft(155);
        donatelo.move(100);
        donatelo.turnRight(180);
        donatelo.move(100);
        donatelo.turnLeft(90);
        donatelo.penUp();
        donatelo.move(20);
        donatelo.turnLeft(90);

    }
    public void nakresliK (){
        donatelo.penDown();
        donatelo.move(100);
        donatelo.turnRight(180);
        donatelo.move(50);
        donatelo.turnLeft(135);
        donatelo.move(70);
        donatelo.turnLeft(180);
        donatelo.move(70);
        donatelo.turnLeft(90);
        donatelo.move(70);
        donatelo.turnLeft(45);
        donatelo.penUp();
        donatelo.move(20);

    }
    public void nakresliA() {
         donatelo.penDown();
         donatelo.turnLeft(75);
         donatelo.move(98);
         donatelo.turnRight(145);
         donatelo.move(98);
         donatelo.turnRight(180);
         donatelo.move(50);
         donatelo.turnLeft(70);
         donatelo.move(27);
         donatelo.penUp();
         donatelo.turnLeft(90);
         donatelo.move(50);
         donatelo.turnLeft(90);
         donatelo.move(100);
    }
}

