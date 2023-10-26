public class Planet extends SpaceGarbage{

    private double distanceFromStar;
    private double bearingAboutStar;
    private double orbitalVelocity;

    public Planet(int diameter, String colour, double distanceFromStar, double bearingAboutStar, double orbitalVelocity) {
        super(diameter, colour);
        this.distanceFromStar = distanceFromStar;
        this.bearingAboutStar = bearingAboutStar;
        this.orbitalVelocity = orbitalVelocity;
    }

    public double getDistanceFromStar() {
        return distanceFromStar;
    }

    public void setDistanceFromStar(double distanceFromStar) {
        this.distanceFromStar = distanceFromStar;
    }

    public double getBearingAboutStar() {
        return bearingAboutStar;
    }

    public void setBearingAboutStar(int bearingAboutStar) {
        this.bearingAboutStar = bearingAboutStar;
    }

    public double getOrbitalVelocity() {
        return orbitalVelocity;
    }

    public void setBearingAboutStar(double bearingAboutStar) {
        this.bearingAboutStar = bearingAboutStar;
    }

    public void setOrbitalVelocity(double orbitalVelocity) {
        this.orbitalVelocity = orbitalVelocity;
    }

    // Methods
    public void movePlanet() {
        this.setBearingAboutStar(this.getBearingAboutStar() + this.getOrbitalVelocity());
        if (this.getBearingAboutStar() >= 360) {
            this.setBearingAboutStar(this.getBearingAboutStar() - 360);
        }
    }

    public void moveComet() {
        double angle = Math.toRadians(this.getBearingAboutStar());
        double x = 200 * Math.cos(angle);
        double y = 300 * Math.sin(angle);
        this.setDistanceFromStar(Math.sqrt(x*x + y*y));
    }
}
