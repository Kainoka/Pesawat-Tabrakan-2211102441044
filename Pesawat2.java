import greenfoot.*;

public class Pesawat2 extends Actor
{
    public void act() 
    {
        move(5); // Pesawat 2 bergerak maju
        setRotation(180); // Mengatur orientasi Pesawat 2 ke kiri
        
        if (Greenfoot.isKeyDown("a")) {
            turn(-5); // Pesawat 2 berputar ke kiri
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(5); // Pesawat 2 berputar ke kanan
        }
        
        checkCollision(); // Memeriksa tabrakan dengan pesawat lain
    }
    
    public void checkCollision()
    {
        Actor pesawat1 = getOneIntersectingObject(Pesawat1.class);
        if (pesawat1 != null) {
            Greenfoot.playSound("explosion.wav");
            getWorld().removeObject(pesawat1);
            getWorld().removeObject(this);
        }
    }
}
