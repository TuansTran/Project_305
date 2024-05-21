public class Shortterm implements IContract {
    private String contractID;
    private double rentAmount;
    private String tenantID;
    private String propertyID;

    @Override
    public void BuildContractID(String contractID) {
            this.contractID=contractID;   
    }
    @Override
    public void BuildPropertyID(String propertyID) {
        this.propertyID=propertyID;
    }
    @Override
    public void BuildTenant(String tenantID) {
        this.tenantID=tenantID;
    }
    @Override
    public void RentAmount(double rentAmount) {
        this.rentAmount=rentAmount;
    }
    @Override
    public Contract signContract() {
        return new Contract(contractID, propertyID, tenantID, rentAmount);
    }
    
    
}
