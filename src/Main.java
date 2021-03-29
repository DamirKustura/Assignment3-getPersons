public class Main {
    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
         Person[] persons = new Person[3];
        int personCounter = 0;

        String[] textArray = text.split("[./ ]+");

        for (int i = 0; i < textArray.length; i+=3) {

            Person person = new Person(textArray[i],textArray[i+1],textArray[i+2]);
            persons[personCounter] = person;
            personCounter++;


        }
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getInfo());
        }

    }
}
