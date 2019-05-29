package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int count=0;
        while(count<personArray.length){
            result=result+personArray[count];
            count++;
        }
        return result;
    }



    public String forLoop() {
        String result = "";
       for(int i=0;i<personArray.length;i++){
           result=result+personArray[i];
       }

        return result;
    }



    public String forEachLoop() {
        String result = "";
        for(Person i:personArray){
            result=result+i;
        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
