package Java_Collections_Optional_Task_2.src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Set {
    private List<Integer> elements;

    public Set(Integer... elements) {
        this(Arrays.asList(elements));
    }

    private Set(List<Integer> elements) {
        this.elements = elements;
    }

    public Set intersect(Set other) {
        return new Set(elements.stream()
                .filter(other.elements::contains)
                .collect(Collectors.toList()));
    }

    public Set unify(Set other) {
        return new Set(Stream.concat(this.elements.stream(),
                other.elements.stream())
                .distinct()
                .collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return "Elements = " + elements;
    }
}
public class Main {

    public static void main(String[] args) {
        Set set1 = new Set(1, 2, 3);
        Set set2 = new Set(2, 3, 4, 5);

        System.out.println("Intersection: " + set1.intersect(set2));
        System.out.println("Union: " + set1.unify(set2));
    }
}
