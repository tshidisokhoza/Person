public class Person {
    private String name;
    private int age;
    private String gender;
    private String [] list;

    public Person(String name, int age, String gender,String list [])
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.list = list;
    }

    public String hello()
    {
        StringBuffer interests = new StringBuffer();
        for (int i=0;i<list.length;i++){
            interests.append(list[i]);
            if (i+2>list.length)interests.append(".");
            if (i+1<list.length)interests.append(", ");
            if (i+2==list.length)interests.append("and ");
        }
        return "Hello, my name is " + name + " and I am " + age + " years old." + " my interests are " + interests ;
    }

}
