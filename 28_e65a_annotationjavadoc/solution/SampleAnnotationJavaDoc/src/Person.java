import java.time.LocalDate;

@UayAnnotation(
    Revision = 1,
    Author = "Uaychai",
    ModifiedDate = "20240411",
    ModifyReason = "Create Class",
    Approvers = {"Yoda","Anakin"})
@UayAnnotation(
    Revision = 2,
    Author = "Uaychai",
    ModifiedDate = "20240422",
    ModifyReason = "Add Something",
    Approvers = {"Yoda","Anakin"})
public class Person {
    private String _FirstName;
    private String _LastName;
    private LocalDate _Birthday;

    public Person(){
        _FirstName = null;
        _LastName = null;
        _Birthday = LocalDate.now();
    }

    public Person(String iFirstName, String iLastName, LocalDate iBirthday){
        _FirstName = iFirstName;
        _LastName = iLastName;
        _Birthday = iBirthday;
    }

    public void setFirstName(String iFirstName){
        _FirstName = iFirstName;
    }
    
    public void setLastName(String iLastName){
        _LastName = iLastName;
    }

    public String getFirstName(){return _FirstName;}
    public String getLastName(){return _LastName;}
    
    
     /**
     * This method will change a current birthday of the current instance.
     * @param iBirthday The type of this parameter is LocalDate and the value must be less than today.
     * @throws Exception If the parameter is more than today. Exception will be throw.
     */
    public void setBirthday(LocalDate iBirthday) throws Exception {
        if(iBirthday.isBefore(LocalDate.now())){
            _Birthday = iBirthday;
        }else{
            throw new Exception("Birthday is incorrect");
        }
    }

    /**
     * This method will return a current Birthday of a current instance.
     * @return The type of this return is LocalDate
     */
    @UayAnnotation(
    Revision = 1,
    Author = "Uaychai",
    ModifiedDate = "20240411",
    ModifyReason = "Create Method",
    Approvers = {"Yoda","Anakin"})
    public LocalDate getBirthday(){return _Birthday;}
}
