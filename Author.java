// PreCondition: each author must have a String name and birthdate
// PostCondition: Creates an "Author" object with a name and a birthdate

public class Author
{
    private String name;
    private String birthDate;

    public Author(String n, String b){
        name = n;
        birthDate = b;
    }

    public String getName(){
        return name;
    }

    public void setName(String x){
        name = x;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(String x){
        birthDate = x;
    }
}
