
public class ContactClient {
    public static void main(String[] args) {
        IContract contract = new Pernament();
        contract.BuildContractID("123");
        contract.BuildPropertyID("132");
        contract.BuildTenant("231");
        contract.RentAmount(0.0);
        Contract contractno1 = contract.signContract();
        System.out.println(contractno1  +" "+contract.getClass().getName());
    }
}
