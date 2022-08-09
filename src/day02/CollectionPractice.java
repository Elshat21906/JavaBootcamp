package day02;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        /*
       Jason:
            {
            "name": "Daniel",
            "age": 30
            "gender": "Male"
            }

        properties file:
            browser= chrome
            url= www.cydeo.com
            username = cydeo

         */


        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name", "Daniel");
        map.put("age", 32);
        map.put("gender","Male");


        List<Map<String, Object>> listOfMap = new ArrayList<>();
        listOfMap.add(map);

        System.out.println(listOfMap);


        Map<String, Map<String, Object>> mapOfMap = new LinkedHashMap<>();
        mapOfMap.put("person1", map);

        System.out.println(mapOfMap);






    }

}
