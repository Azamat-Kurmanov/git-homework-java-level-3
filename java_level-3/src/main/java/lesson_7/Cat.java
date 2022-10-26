package lesson_7;

import lombok.*;

//public class Cat extends Number {
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Cat {
    public String name;
    private Integer age;

    /*public Cat(String name) {
        this.name = name;
        this.age = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     */

    public String info(String str1, String str2) {
        return str1 +" "+ str2;
    }

    private String info(String str, Integer integer) {
        return str + " " + integer;
    }

    /*@Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }*/
}
