package Dog;

import java.util.ArrayList;

public class Dog {
    private boolean isHungry;
    private String name;

    private ArrayList<Dog> offSpring = new ArrayList<>();
    private Owner own = new Owner();

    public Dog(boolean isHungry, String name) {
        this.isHungry = isHungry;
        this.name = name;
    }

    public String feedDog(){
        String tmp;
        if(isHungry = true){
            isHungry = false;
            tmp = "Hunden er nu blevet fordret og er ikke sulten længere";
        }
        else{
            tmp = "Hunden er ikke sulten";
        }
        return tmp;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Dog> getOffSpring() {
        return offSpring;
    }

    // Prints out only the names of the offspring (dogs) from the dog list
    public void printOffSpring() {
        for(int i = 0; i < offSpring.size()-1; i++){
            System.out.print(offSpring.get(i).getName() + ", ");
        }
        System.out.println(offSpring.get(offSpring.size()-1).getName());
    }

    // Adds a new offspring (dog) to the dog list
    public void setOffSpring(boolean hungry, String puppy) {
        this.offSpring.add(new Dog(hungry, puppy));
    }

    public String getOwner() {
        return own.getName();
    }

    public void setOwner(String tmp) {
        own.setName(tmp);
    }
}
