public class ClassPeople {
    public String FirstName;
    public String LastName;
    public ClassPeople(){
        FirstName="";LastName="";
    }
    public ClassPeople(String inFN,String inLN){
        FirstName=inFN;LastName=inLN;
    }
    public String getFullName(){
        return FirstName + " " + LastName;
    }
}
