package class10.dsa.queue.structure;

import class10.dsa.queue.data.queueNode;

import java.util.NoSuchElementException;

public class AnimalShelter {
    private String animalName;
    private queue queue;

    private queue<cat> queueCat;
    private queue<cat> queueDog;

//    private queueNode front;

    public AnimalShelter(String animalName, queue queueCat, queue queueDog) {
//        if(animalName == "cat" || animalName == "dog")
//        {
            this.animalName = animalName;
            this.queueCat = queueCat;
            this.queueDog = queueDog;
    }

    public void enqueue(String animal)
    {
        if (animal == "cat"){
            queueCat.enqueue(animal);
        }
        else
        {
            queueDog.enqueue(animal);
        }
    }

    public queueNode dequeue(String pref) {
        if(pref == "cat")
        {
            return queueCat.dequeue();
        }
        else if(pref == "dog")
        {
            return queueDog.dequeue();
        }
        else
        {
            return null;
        }
    }


    @Override
    public String toString() {
        return "AnimalShelter => " + queueCat + queueDog ;
    }
}
