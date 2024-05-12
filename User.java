class User {
 String username;
 String password;
 String phoneNumber;
 String email;
 Boolean admin =false;
 final String country ="Indonesia";
 
 
void userMe() throws Exception  {
    System.out.println("My username is "+this.username+
    "password"+this.password+
    "phoneNumber"+this.phoneNumber+
    "email"+this.email+
    (this.admin?"is_admin":"")+
    "country"+ this.country
    );
 }

 void login (String username, String password){
    if(this.username==username && this.password ==password){
        System.out.println("Succes login with username"+username);
    }else{
        System.out.println("Failed login with username"+username);
    }
 }


 User(String paramUsername, String paramPassword, String paramPhoneNumber,Boolean paramadmin){
    username = paramUsername;
    password = paramPassword;
    phoneNumber = paramPhoneNumber;
    admin = paramadmin;
   }

 User(String paramUsername, String paramPassword, String paramPhoneNumber){
    this(paramUsername, paramPassword,paramPhoneNumber,false);
 }
 
 User(String paramUsername, String paramPassword){
    this(paramUsername, paramPassword,null);
 }

 User(String  paramUsername){
 this(paramUsername,null);
 }

 User(){
    this(null);
 }
 }
 