public class App {
    public static void main(String[] args) throws Exception {
        RecordPeople rp1 = new RecordPeople("Uaychai","Chotjaratwanich");
        RecordPeople rp2 = new RecordPeople("Uaychai","Chotjaratwanich");
        System.out.println(rp1.getFullName());
        System.out.println(rp2.getFullName());
        System.out.println(rp1.equals(rp2));

        ClassPeople cp1 = new ClassPeople();
        cp1.FirstName="Uaychai";cp1.LastName="Chotjaratwanich";
        ClassPeople cp2 = new ClassPeople("Uaychai","Chotjaratwanich");
        System.out.println(cp1.getFullName());
        System.out.println(cp2.getFullName());
        System.out.println(cp1.equals(cp2));
    }
}
