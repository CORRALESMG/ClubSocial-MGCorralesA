/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubsocial2;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author GCAM
 */
public class Person {

    public String Name;
    protected int Edad;
    protected Date Birthday;

    @SuppressWarnings("SillyAssignment")
    public Person(String name, int edad, Date birthday){
        this.Name = Name;
        this.Edad = Edad;
        this.Birthday = Birthday;
    }
    public void  show(Person Persona){
        int Year = Persona.Birthday.getYear();
        int Month = Persona.Birthday.getMonth();
        int Day = Persona.Birthday.getDay();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(Persona.Birthday);
     
        int DateYear = calendar.get(Calendar.YEAR);
      //  System.out.println(getAge(year,month,day));
        System.out.println("El nombre de la persona es " + Persona.Name );
        
    }
    public void aa(String aa){
        String a = "";
        }
    }
