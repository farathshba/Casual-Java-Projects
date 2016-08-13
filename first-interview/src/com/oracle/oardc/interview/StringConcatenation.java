package com.oracle.oardc.interview;

import java.util.ArrayList;

public class StringConcatenation 
{
    public StringConcatenation()
    {
        super();
    }

    public static void execute() 
    {
        String s = "";      //  Do not mean that s is pointed to a null value but a value that is known as 'empty'
        ArrayList<Person> persons = new ArrayList<Person>();
        //--    ArrayList<Person> persons = new ArrayList();    
        
        for (Person p : persons) 
        {
            //  S is being complemented with the names of the different persons with a comma in place
            s += ", " + p.getName();
        }
        
        //	The following method of removing the first comma seems incorrect to me as such my own code
        //--	s = s.substring(2); //remove first comma  
        s = s.replaceFirst(",", "");
    }
    
    

    class Person 
    {
        //  It is advisable to indicate 'n' as private
        private String n;
        // --   String n;
        
        public String getName() 
        {
            return n;
        }
    }
    
    //  The main method should be at the bottom for easy reading
    public static void main(String[] s) 
    {
        //  StringConcatenation is a static method aka helper class form - so it is also possible to call as follows
        StringConcatenation.execute();
        //--    new StringConcatenation().execute();
    }
}
