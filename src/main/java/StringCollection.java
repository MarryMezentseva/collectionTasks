import java.util.*;
// 1 найти все стринги, которые содержатся в обеих коллекциях, т.е. все оттуда и оттуда, но без дубликаций.
// 2 найти все стринги, которые содержатся в обеих коллекциях и в listA и в listB
// 3 найти все стринги, которые не содержатся в обеих коллекцияхб те разницу. Например "S" есть только listB=>он нам нужен

public class StringCollection {
    public static void main(String[] args) {
        //given
        List<String> listA = Arrays.asList("A", "B", "C", "P", "E", "F", "G", "I", "K", "L", "U", "N");
        List<String> listB = Arrays.asList("K", "L", "M", "N", "A", "S", "E", "F", "G", "V", "K", "B", "C", "Q", "M", "N");
        //1
        Set<String> common = new HashSet<String>(listA);
        common.addAll(listB);
        System.out.println("Without duplications" + common);
        //2
        List<String> all = new ArrayList<String>(listA);
        all.addAll(listB);
        System.out.println("All strings : " + all);
        //3
        Set<String> diff1 = new HashSet<String>(listA);
        diff1.removeAll(listB);
        Set<String> diff2 = new HashSet<String>(listB);
        diff2.removeAll(listA);
        Set<String> differences = new HashSet<String>(diff2);
        differences.addAll(diff1);
        System.out.println("Differences are: " + differences);

    }
}