#ifndef STUDENT_H
#define STUDENT_H
#include <string>
using namespace std;

class Student
{
     protected:
        string firstName;
        string lastName;

    public:
        Student();
        ~Student();
        Student(string firstName);
        Student(string firstName, string lastName);
        string getFirstName() {return this->firstName;}
        string getLastName() {return this->lastName;}
        string getFullName();
};

#endif // STUDENT_H
