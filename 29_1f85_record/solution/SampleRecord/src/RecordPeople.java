public record RecordPeople(String FirstName, String LastName) {
    public final String getFullName(){
        return FirstName + " " + LastName;
    }
}
