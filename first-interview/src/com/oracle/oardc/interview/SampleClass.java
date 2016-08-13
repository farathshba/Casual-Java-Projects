package com.oracle.oardc.interview;

import java.io.BufferedInputStream;
import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import java.io.InputStream;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Vector;


public class SampleClass 
{
    private Vector myVector = new Vector();
    private HashMap myMap;
    private Calendar cal;
    public String str = "";
    public int i = 0;
    protected boolean b = false;
    
    public SampleClass() 
    {
	    super();
	    cal = new GregorianCalendar();
	    cal.setTime(new Date());
	    cal.set(Calendar.HOUR_OF_DAY, 0);
	    cal.set(Calendar.MINUTE, 0);
	    cal.set(Calendar.SECOND, 0);
	    Date startOfDay = cal.getTime();        
    }
    

    public void load(File f) throws IOException 
    {
	  InputStream in = new BufferedInputStream(new FileInputStream(f));
	  in.read();
	  in.close();
    }
    
    public final synchronized void addMyVector(Object obj) 
    {
        myVector.add(obj);
    }
            
    public void addToMap(Collection c) 
    {
        myMap = new HashMap(c.size());
        for(Object o : c)
           myMap.put(o.getClass().getCanonicalName(), o.toString());
    }
     
}
