public class ResidentialComplexService extends ConstructionService {
    @Override
    protected void buildGarden() {
        System.out.println("Big garden with playground has been constructed");
    }

    @Override
    protected void installWindows() {
        System.out.println("Half-height usual windows have been installed");
    }

    @Override
    protected void installHeatingSystem() {
        System.out.println("Individual heating system has been installed");
    }

    @Override
    protected void installCoolingSystem() {
        System.out.println("Individual cooling system has been installed");
    }
}
