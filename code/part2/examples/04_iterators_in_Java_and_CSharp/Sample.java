import java.util.*;

public class Sample {
  public static void process(Iterator<Integer> iterator) {
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println(iterator.getClass());
  }

  public static void main(String[] args) {
    List<Integer> numbers1 = Arrays.asList(1, 2, 3);
    Set<Integer> numbers2 = new HashSet<>(Arrays.asList(1, 2, 3));

    process(numbers1.iterator());
    System.out.println("---------");
    process(numbers2.iterator());
  }
}

//Both in Java and C#, the solution used to implemnent the iterator pattern is actually the
//solution 2 and not solution 1 for various good reasons, but most notably, they wanted to
//provide effient way to support multiple views of iteration on the same collection.

