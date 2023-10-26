import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) throws InterruptedException {

        // Solar System
        SolarSystem s = new SolarSystem(800, 800);

        // Sun
        SpaceGarbage Sun = new SpaceGarbage(120, "YELLOW");

        // Planets
        ArrayList<Planet> Planets = new ArrayList<Planet>();

        Planet Mercury = new Planet(7, "RED", 80, 100, 10);
        Planet Venus= new Planet(15, "ORANGE", 100, 67, 3);
        Planet Earth = new Planet(18, "BLUE", 130, 0, 1);
        Planet Mars = new Planet(12, "#964B00", 150, 32, 0.5);
        Planet Jupiter = new Planet(50, "#C4A484", 210, 260, 0.09);
        Planet Saturn = new Planet(45, "#EAC117", 260, 171, 0.03);
        Planet Uranus = new Planet(30, "#00008B", 310, 49, 0.012);
        Planet Neptune = new Planet(30, "#ADD8E6", 360, 201, 0.007);
        Planets.add(Mercury);
        Planets.add(Venus);
        Planets.add(Earth);
        Planets.add(Mars);
        Planets.add(Jupiter);
        Planets.add(Saturn);
        Planets.add(Uranus);
        Planets.add(Neptune);

        // Satellites
        ArrayList<Satellite> Satellites = new ArrayList<Satellite>();

        Satellite Moon = new Satellite(3, "GRAY", 130, 0, 1, 15, 0, 23);
        Satellite Io = new Satellite(3, "GRAY", 210, 260, 0.09, 35, 0, 17);
        Satellite Europa = new Satellite(3, "GRAY", 210, 260, 0.09, 35, 90, 17);
        Satellite Callisto = new Satellite(4, "GRAY", 210, 260, 0.09, 35, 180, 17);
        Satellite Ganymede = new Satellite(5, "GRAY", 210, 260, 0.09, 35, 270, 17);
        Satellites.add(Moon);
        Satellites.add(Io);
        Satellites.add(Europa);
        Satellites.add(Callisto);
        Satellites.add(Ganymede);

        Satellite saturnRing1 = new Satellite(6, "YELLOW", 260, 171, 0.03, 35, 0, 27);
        Satellite saturnRing2 = new Satellite(6, "ORANGE", 260, 171, 0.03, 40, 36, 27);
        Satellite saturnRing3 = new Satellite(6, "WHITE", 260, 171, 0.03, 45, 72, 27);
        Satellite saturnRing4 = new Satellite(6, "YELLOW", 260, 171, 0.03, 35, 108, 27);
        Satellite saturnRing5 = new Satellite(6, "ORANGE", 260, 171, 0.03, 40, 144, 27);
        Satellite saturnRing6 = new Satellite(6, "WHITE", 260, 171, 0.03, 45, 180, 27);
        Satellite saturnRing7 = new Satellite(6, "YELLOW", 260, 171, 0.03, 35, 216, 27);
        Satellite saturnRing8 = new Satellite(6, "ORANGE", 260, 171, 0.03, 40, 252, 27);
        Satellite saturnRing9 = new Satellite(6, "WHITE", 260, 171, 0.03, 45, 288, 27);
        Satellite saturnRing10 = new Satellite(6, "WHITE", 260, 171, 0.03, 45, 324, 27);
        Satellites.add(saturnRing1);
        Satellites.add(saturnRing2);
        Satellites.add(saturnRing3);
        Satellites.add(saturnRing4);
        Satellites.add(saturnRing5);
        Satellites.add(saturnRing6);
        Satellites.add(saturnRing7);
        Satellites.add(saturnRing8);
        Satellites.add(saturnRing9);
        Satellites.add(saturnRing10);

        // Asteroid Belt
        Planet[] Asteroids1 = new Planet[120];
        for (int i = 0; i < 120; i++) {
            Asteroids1[i] = new Planet(2, "GRAY", 164, 3*i, 0.5);
            Planets.add(Asteroids1[i]);
        }

        Planet[] Asteroids2 = new Planet[120];
        for (int i = 0; i < 120; i++) {
            Asteroids2[i] = new Planet(2, "GRAY", 167, 3*i, 0.5);
            Planets.add(Asteroids2[i]);
        }

        Planet[] Asteroids3 = new Planet[120];
        for (int i = 0; i < 120; i++) {
            Asteroids3[i] = new Planet(2, "GRAY", 170, 3*i, 0.5);
            Planets.add(Asteroids3[i]);
        }

        // Comet
        ArrayList<Planet> Comets = new ArrayList<Planet>();
        Planet comet1 = new Planet(30, "WHITE", 300, 0, 20);
        // Planet comet2 = new Planet(50, "WHITE", 300, 180, 2);
        Comets.add(comet1);
        // Comets.add(comet2);



        // Animating Space Garbage
        while (true) {
//            Thread.sleep(10);
            System.out.println(comet1.getBearingAboutStar());
            // Sun
            s.drawSolarObject(0, 0, Sun.getObjectDiameter(), Sun.getColour());

            // Planets
            for (Planet p : Planets) {
                s.drawSolarObjectAbout(p.getDistanceFromStar(), p.getBearingAboutStar(), p.getObjectDiameter(), p.getColour(), 0, 0);
                p.movePlanet();
            }

            // Satellites
            for (Satellite sa : Satellites) {
                s.drawSolarObjectAbout(sa.getDistanceFromStar(), sa.getBearingAboutStar(), sa.getObjectDiameter(), sa.getColour(), sa.getDistanceFromPlanet(), sa.getBearingAboutPlanet());
                sa.movePlanet();
                sa.moveSatellite();
            }

            // Comets
            for (Planet c : Comets) {
                s.drawSolarObjectAbout(c.getDistanceFromStar(), c.getBearingAboutStar(), c.getObjectDiameter(), c.getColour(), 0, 0);
                c.movePlanet();
                c.moveComet();
            }


            // Miscellaneous
            s.finishedDrawing();
        }
        

    }
}