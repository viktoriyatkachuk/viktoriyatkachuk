package lesson02;

/*
1. В пакете lesson02 создать класс Person (основанный на том, что рассматривался на занятии №2) содержащий:
- приватные поля String firstName, String secondName, int age;
- приватное статическое поле int count;
- конструктор, который принимает firstName, secondName, age и инициализирует эти же поля класса и увеличивает count;
- публичные гетеры/сетеры для firstName, secondName, age (сгенерированные в IDEA через Alt+Insert);
- блоки (такие же, как в примере);
- методы toString(), hashCode(), equals() (сгенерированные в IDEA через Alt+Insert).
2. Создать метод public static void main(String[] args), в котором необходимо создать три персоны две одинаковые и одну отличную от них.
2.1. Провести их сравнение с помощью == и метода equal;
2.2. Вывести в консоль описание объектов через toString() и их хеш-код через hashCode().
3. Закоммитить изменения и добавить их в репозиторий на GitHub.
4. Прислать к заданию ссылку на коммит.
*/

/*import java.util.Objects;

public class Person {
    String firstName;       // members-fields of the class
    String secondName;      // members-fields of the class
    int age;                // members-fields of the class
    private static int count = 0;   // members-fields of the class

    Person(string firstName,  String secondName, int age) {         //constructor, method with the class name that
        this.firstName = firstName;                                 //creates new class copy
        this.secondName = secondName;
        this.age = age;
        count++;

    }

    //getter via alt+ins
    public static int getCount() {
        return count;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


// methods
    public void setSecondName(String secondName) {
        this.secondName = secondName;
        @Override
        public String toString ( ) {
            return super.toString ( );
        }

        @Override
        public boolean equals (Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return getAge ( ) == person.getAge ( ) &&
                    getFirstName ( ).equals (person.getFirstName ( )) &&
                    getSecondName ( ).equals (person.getSecondName ( ));
        }

        @Override
        public int hashCode ( ) {
            return Objects.hash (getFirstName ( ), getSecondName ( ), getAge ( ));
        }


    }


    public String getFirstName() { return firstName; }
    public String getSecondName() { return secondName; }
    public int getAge() { return age;  }


    void DoSomething(int age) {
        String end = "  method is doing something.";
        System.out.println("New person is " + firstName +" "+secondName + age);

    }


    static    {
        System.out.println("This is my first class loading.");
    }

    {
        System.out.println(count + " my first class loading.");
}

    public static void main(String[] args)

    ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Hey!");
        myArrayList.add("This");
        myArrayList.add("is");
        myArrayList.add("my");
        myArrayList.add("first");
        myArrayList.add("list!");

        for (int i = 0; i < myArrayList.size(); i++)
            System.out.println(myArrayList.get(i));


*/