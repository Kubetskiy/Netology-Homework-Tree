import java.util.Comparator;

public class ComparePeople implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        String[] sn1 = o1.getSurname().split(" ");
        String[] sn2 = o2.getSurname().split(" ");
        if (sn1.length == sn2.length) {
            return o2.getAge() - o1.getAge();
        }
        else {
            return sn2.length - sn1.length;
        }
    }
}
