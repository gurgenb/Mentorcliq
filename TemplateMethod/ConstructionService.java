abstract public class ConstructionService {
    public final void build() {
        buildBuilding();
        buildParking();
        installSewageSystem();
        buildGarden();
        installWindows();
        installHeatingSystem();
        installCoolingSystem();
    }

    protected final void buildBuilding() {
        System.out.println("The building has been constructed");
    }

    protected final void installSewageSystem() {
        System.out.println("The sewage system has been installed");
    }

    protected final void buildParking() {
        System.out.println("The parking has been constructed");
    }

    protected abstract void buildGarden();

    protected abstract void installWindows();

    protected abstract void installHeatingSystem();

    protected abstract void installCoolingSystem();
}
