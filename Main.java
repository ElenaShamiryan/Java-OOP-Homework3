package DZ3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Group studentList = new Group(Arrays.asList(
        new Students("Иван",LocalDate.of(1993,2,16), 4.8f),
        new Students("Артем",LocalDate.of(1995,6,3), 3.9f),
        new Students("Екатерина",LocalDate.of(1994,12,22), 4.4f)
        ));

        Iterator<Students> it =  studentList.descending();
        ListIterator<Students> secondIt =  studentList.listIterator();


        for(Students stud:studentList){
            System.out.println(stud);
        }
        System.out.println();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        while(secondIt.hasPrevious()){
            System.out.println(secondIt.previous());
        }
        System.out.println();
        while(secondIt.hasNext()){
            System.out.println(secondIt.next());
        }
        
}
}