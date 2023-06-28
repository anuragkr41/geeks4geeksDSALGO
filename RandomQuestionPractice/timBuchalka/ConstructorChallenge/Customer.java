package com.geekForGeeksDSCourse.RandomQuestionPractice.timBuchalka.ConstructorChallenge;

import org.w3c.dom.ls.LSOutput;

public class Customer {
    private String name;
    private Double creditLimit;
    private String email;



    public Customer(String name, Double creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }

    public Customer(String name, String email){
        this("Anurag", 344.0,"anurag@gmail.com");


    }

    public Customer(){
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

class Main{
    public static void main(String[] args) {

        //Customer customer = new Customer("Anurag", 100.43, "anurag@gmail.com");

        Customer customer = new Customer();
        System.out.println(customer.getName()+" is having Rs. "+customer.getCreditLimit()+ " and his email id is "+customer.getEmail());


    }



}
