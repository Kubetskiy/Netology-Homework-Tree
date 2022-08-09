import java.util.Comparator;

public class ComparePeople implements Comparator<Person> {

    private int wordsInSurname = Integer.MAX_VALUE;

    public ComparePeople(int wordsInSurname) {
        if (wordsInSurname > 0) {
            this.wordsInSurname = wordsInSurname;
        }
    }

    public ComparePeople() {
    }

    @Override
    public int compare(Person o1, Person o2) {
        int o1NumOfWords, o2NumOfWords;
        String[] sn1 = o1.getSurname().split(" ");
        String[] sn2 = o2.getSurname().split(" ");
        o1NumOfWords = sn1.length;
        o2NumOfWords = sn2.length;
        if (o1NumOfWords > wordsInSurname) {
            o1NumOfWords = wordsInSurname;
        }
        if (o2NumOfWords > wordsInSurname) {
            o2NumOfWords = wordsInSurname;
        }
        if (o1NumOfWords == o2NumOfWords) {
            return o2.getAge() - o1.getAge();
        } else {
            return o2NumOfWords - o1NumOfWords;
        }
    }
}
