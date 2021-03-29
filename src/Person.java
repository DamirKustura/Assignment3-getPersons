public class Person {
    String firstName;
    String lastName;
    String city;


    Person(String firstName, String lastName, String city){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

   public String getInfo(){
        return "First Name: " + firstName + "\n"+
                "Last Name: " + lastName + "\n"+
                "City: " + city ;
    }
}
