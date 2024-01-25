package koushik;

public class Person {
	private int age;
    private String name;
    public Person(int age, String name){
        this.age=age;
        this.name=name;
    }
    public boolean setAge(int age) {
        if(age>=0&&age<=100){
            this.age = age;
            return true;
        }
        else{
            return false;
        }
        
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "age: "+age+" name: "+name;
    }
}
