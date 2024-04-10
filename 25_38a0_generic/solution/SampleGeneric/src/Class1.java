public class Class1<T,U>
{
    public void printSomething(T x, U y)
    {
        System.out.println(x);
        System.out.println(y);
    }

    public <V> void printSomething2(V x)
    {
        System.out.println(x);
    }
}
