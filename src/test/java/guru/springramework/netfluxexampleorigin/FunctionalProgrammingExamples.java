package guru.springramework.netfluxexampleorigin;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FunctionalProgrammingExamples {

    @Test
    public void functionWith4Thins() throws Exception{
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" In thread t1"); // tbody
            }
        });

        t1.start();
        System.out.println("In Main Test");
    }

    @Test
    public void lambdaExpression() throws Exception{
            Thread t1 = new Thread(()-> System.out.println("Silience of the Lmabdas"));

            t1.start();

        System.out.println("In Main Test?");
    }

    @Test
    public void listIteratorHighCeremony() throws Exception{
        List<String> dogs = Arrays.asList("Vizsla", "Lab", "Golden", "GSP", "Poodle", "Yorkie", "Mutt");
        for (int i=0;i<dogs.size();i++){
            System.out.println(dogs.get(i));
        }
    }

    @Test
    public void listInternalIterConsumer() throws Exception{
        List<String> dogs = Arrays.asList("Vizsla", "Lab", "Golden", "GSP", "Poodle", "Yorkie", "Mutt");
        dogs.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    @Test
    public void listInternalIterLambdaMethod() throws Exception{
        List<String> dogs = Arrays.asList("Vizsla", "Lab", "Golden", "GSP", "Poodle", "Yorkie", "Mutt");
        dogs.forEach((String s)-> System.out.println(s));
    }

    @Test
    public void ListInternalIterLambdamethodTypeInference() throws Exception{
        List<String> dogs = Arrays.asList("Vizsla", "Lab", "Golden", "GSP", "Poodle", "Yorkie", "Mutt");
        dogs.forEach((s)-> System.out.println(s));
    }

    @Test
    public void ListInternalIterLambdamethodTypeInferenceJustOne() throws Exception{
        List<String> dogs = Arrays.asList("Vizsla", "Lab", "Golden", "GSP", "Poodle", "Yorkie", "Mutt");
        dogs.forEach(s-> System.out.println(s));
    }

    @Test
    public void ListInternalIterLambdamethodTypeJava8methodRef() throws Exception{
        List<String> dogs = Arrays.asList("Vizsla", "Lab", "Golden", "GSP", "Poodle", "Yorkie", "Mutt");
        dogs.forEach(System.out::println);
    }
    
    
    @Test
    public void countDogsWithEightCharactersImp() throws Exception{
        List<String> dogs = Arrays.asList("Vizsla", "Lab", "Golden", "GSP", "Poodle", "Yorkie", "Mutt");
        int dogCount = 0;
        for(String dog: dogs){
            if(dog.length()==6){
                dogCount++;
            }
        }
        System.out.println(dogCount);
    }

    @Test
    public void countDogsWithEightCharactersDesc() throws Exception{
        List<String> dogs = Arrays.asList("Vizsla", "Lab", "Golden", "GSP", "Poodle", "Yorkie", "Mutt");
        System.out.println(dogs.stream().filter(dog->dog.length()==6).collect(Collectors.toList()).size());
    }



}
