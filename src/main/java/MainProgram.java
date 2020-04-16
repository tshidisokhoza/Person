public class MainProgram {
    public static void main(String[] args) {
        String array[] = {"being a hardarse","agile","ssd hard drives"};
        Person person = new Person("Ryan",30,"male",array);
        String greeting = person.hello();
        System.out.println(greeting);
    }
}
