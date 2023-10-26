public class Satellite extends Planet {

    private int distanceFromPlanet;
    private int bearingAboutPlanet;
    private int orbitalVelocityAboutPlanet;

    public Satellite(int diameter, String colour, int distanceFromStar, double bearingAboutStar, double orbitalVelocity, int distanceFromPlanet, int bearingAboutPlanet, int orbitalVelocityAboutPlanet) {
        super(diameter, colour, distanceFromStar, bearingAboutStar, orbitalVelocity);
        this.distanceFromPlanet = distanceFromPlanet;
        this.bearingAboutPlanet = bearingAboutPlanet;
        this.orbitalVelocityAboutPlanet = orbitalVelocityAboutPlanet;
    }

    public int getDistanceFromPlanet() {
        return distanceFromPlanet;
    }

    public void setDistanceFromPlanet(int distanceFromPlanet) {
        this.distanceFromPlanet = distanceFromPlanet;
    }

    public int getBearingAboutPlanet() {
        return bearingAboutPlanet;
    }

    public void setBearingAboutPlanet(int bearingAboutPlanet) {
        this.bearingAboutPlanet = bearingAboutPlanet;
    }

    public int getOrbitalVelocityAboutPlanet() {
        return orbitalVelocityAboutPlanet;
    }

    public void setOrbitalVelocityAboutPlanet(int orbitalVelocityAboutPlanet) {
        this.orbitalVelocityAboutPlanet = orbitalVelocityAboutPlanet;
    }

    // Methods
    public void moveSatellite() {
        this.setBearingAboutPlanet(this.getBearingAboutPlanet() + this.getOrbitalVelocityAboutPlanet());
    }

}
