/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-31
 */
public class SampleClass {
    public void Method1(){System.out.println("From Method1");}

    public int Method2(){return 5;}

    public Person Method3(){
        Person p1 = new Person();
        p1.PersonID=1;p1.FullName="Uaychai";p1.Salary=50000;
        return p1;
    }

    public void Method4(int inputint, Person inputPerson){
        inputint +=5;
        inputPerson.Salary+=500;
    }

    public int Method5(int[] inputintarray){
        int result=0;
        for(int item:inputintarray){
            result+=item;
        }
        return result;
    }

    public int Method6(int... inputintarbitrary){
        int result=0;
        for(int item:inputintarbitrary){
            result+=item;
        }
        return result;
    }

    public int Method7(int inputint){
        return inputint+5;
    }

    public int Method7(int inputint1, int inputint2){
        return inputint1+inputint2;
    }
}
