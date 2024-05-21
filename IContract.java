public interface IContract {
    void BuildContractID(String contractID);
    void BuildPropertyID(String propertyID);
    void BuildTenant(String tenantID);
    void RentAmount(double rentAmount);
    Contract signContract();    
}