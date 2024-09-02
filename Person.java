package com.mycompany.assignment2;

public class Person {
    private String firstName;
    private String lastName;
    private String age;
    private String mobile;
    private String address;
    private String email;
    
    public Person(String firstName,String lastName,String age,String moblie,String address,String email){
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
        this.mobile = moblie;
        this.address = address;
        this.email = email;
    }
    
    public String getName(){
        return firstName;
    }
    
    public String getAge(){
        return age;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getMobile(){
        return mobile;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getAddress(){
        return address;
    }
    
}