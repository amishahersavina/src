class UserApp {
  public static void main (String [] args)throws Exception{
    /* object */
    var user1 = new User();
    User user2 = new User();
    User user3;
    user3 = new User();

    System.out.println(user1);
    System.out.println(user2);
    System.out.println(user3);

    /* field */
    var user = new User();
    user.username ="amisha";
    user.password ="4321";
    user.phoneNumber ="0855555";
    user.email = "amisha@17";
    //user.country ="indonesia";

    System.out.println(user.username);
    System.out.println(user.password);
    System.out.println(user.country);

    var user4 =new User();
    user4.userMe();
    user4.login("amisha", "4321");

    var user5 =new User();
    user5.username ="amisha";
    user5.password ="4321";
    user.userMe();
    user5.login("amisha","4321");

    var user6 = new User("username", "4321","0855555",true);
    user6.userMe();

    var user7 = new User("username7","4321");
    var user8 = new User("username8");
    var user9 = new User();

  }
}