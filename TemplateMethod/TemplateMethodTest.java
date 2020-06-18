public class TemplateMethodTest {
    public static void main(String args[]) {
        System.out.println("\n****Residential Complex Service****");
        ConstructionService residentialComplexService = new ResidentialComplexService();
        residentialComplexService.build();

        System.out.println("\n****Business Center Service****");
        ConstructionService businessCenterService = new BusinessCenterService();
        businessCenterService.build();
    }
}
