#include <iostream>
#include <string>
#include "Student.h"

Student::Student()
{
    cout<<"Student object created (empty)"<<endl;
}

Student::~Student()
{
    cout<<"Student object destroyed"<<endl;
}

Student::Student(string firstName)
{
    cout<<"Student object created (firstName)"<<endl;
    this->firstName=firstName;
}

Student::Student(string firstName, string lastName)
{
    cout<<"Student object created (firstname, lastname)"<<endl;
    this->firstName=firstName;
    this->lastName=lastName;
    cout<< "FirstName: "<<firstName<<endl<<"LastName: "<<lastName<<endl; //To Print
}

string Student::getFullName()
{
    return this->firstName + " " + this->lastName;
}
