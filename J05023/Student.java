package J05023;

public class Student {
    String SID, name, class_, email;

    Student(String SID, String name, String class_, String email){
        this.SID = SID;
        this.name = name;
        this.class_ = class_;
        this.email = email;
    }

    @Override
    public String toString(){
        return this.SID + " " + this.name + " " + this.class_ + " " + this.email;
    }
}

// Compare this snippet from J05021.java:


