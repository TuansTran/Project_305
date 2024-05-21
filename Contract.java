public class Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;
    public Contract(String contactID, String propertyID, String tenantID, double rentAmount){
        this.contractID=contactID;
        this.propertyID=propertyID;
        this.tenantID=tenantID;
        this.rentAmount=rentAmount;
    }
    public String getContractID() {
        return contractID;
    }
    public void setContractID(String contractID) {
        this.contractID = contractID;
    }
    public String getPropertyID() {
        return propertyID;
    }
    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }
    public String getTenantID() {
        return tenantID;
    }
    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }
    public double getRentAmount() {
        return rentAmount;
    }
    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return contractID+" "+propertyID+" "+tenantID+" "+rentAmount;
    }

}
