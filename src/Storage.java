import homework.exercise.homework11.medicalCenter.model.Doctor;
import homework.exercise.homework11.medicalCenter.model.Patient;
import homework.exercise.homework11.medicalCenter.model.Person;
import homework.exercise.homework11.medicalCenter.model.type.ProfessionType;
import homework.exercise.homework11.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Arrays;

public class Storage<T> {
    
   private  T[] people;
   private  int size;

   Storage(T[] people){
       this.people = people;
   }
   
   public void add(T obj){
       if (people.length == size){
           extend();
       }
       people[size++] = obj;
   }

    private void extend() {
       people = Arrays.copyOf(people,size+5);
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(people[i]);
        }
    }
    public static void main(String[] args) throws ParseException {

       Storage<Person> storage = new Storage<>(new Person[0]);

       Doctor doctor = new Doctor("A01","Poxos","Poxosyan","1234","poxs@mail.com", ProfessionType.INTERNISTS);
       Patient patient = new Patient("Q01","Poxos","Poxosyan","1234",doctor, DateUtil.toDateString("21/12/2003 10:30"));

       storage.add(doctor);
       storage.add(patient);

       storage.print();
    }
}
