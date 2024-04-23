public class User {
    private String UserID;
    private String password;
    private String email;
    private String userType;

    public User (String id, String pass, String mail, String type){
        UserID = id;
        password = pass;
        email= mail;
        userType = type;
    }

    public String getUserID() {
        return UserID;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void createUser(String id, String pass, String mail, String type){
        UserID=id;
        password=pass;
        email=mail;
        userType=type;
    }

    public void changePassword(String newPass){
        password=newPass;
    }

}