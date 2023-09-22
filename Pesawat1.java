import greenfoot.*;

public class Pesawat1 extends Actor
{
    public void act() 
    {
        move(5); // Pesawat 1 bergerak maju (ke kanan)
        
        // Memeriksa tabrakan dengan Pesawat2
        Actor pesawat2 = getOneIntersectingObject(Pesawat2.class);
        if (pesawat2 != null) {
            Greenfoot.playSound("explosion.wav"); // Memutar suara ledakan
            getWorld().removeObject(pesawat2); // Menghapus Pesawat2
            getWorld().removeObject(this); // Menghapus Pesawat1
        }
    }
}
