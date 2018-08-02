#include <iostream>
#include <string>
#include "Staff.h"

Staff::Staff()    //refer class with double colon
{
    cout<<"Staff object created (empty)"<<endl;
}

Staff::~Staff()
{
    cout<<"Staff object destroyed"<<endl;
}

Staff::Staff(string firstName)
{
    cout<<"Staff object created (firstName)"<<endl;
    this->firstName=firstName;
}

Staff::Staff(string firstName, string lastName)
{
    cout<<"Staff object created (firstname, lastname)"<<endl;
    this->firstName=firstName;
    this->lastName=lastName;
    cout<< "FirstName: "<<firstName<<endl<<"LastName: "<<lastName<<endl; //To Print
}

string Staff::getFullName()
{
    return this->firstName + " " + this->lastName;
}
