public class BusinessCenterService extends ConstructionService {
    @Override
    protected void buildGarden() {
        System.out.println("Small garden has been constructed");
    }

    @Override
    protected void installWindows() {
        System.out.println("Super modern high-quality windows with voice isolation and ultra-violet rays protection have been installed");
    }

    @Override
    protected void installHeatingSystem() {
        System.out.println("Centralized heating system has been installed");
    }

    @Override
    protected void installCoolingSystem() {
        System.out.println("Centralized cooling system has been installed");
    }
}
