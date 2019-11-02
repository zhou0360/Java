public class MyClass
{
  public int a;
  public double b;
  public MyClass(int a, double b)
  {
    this.a = a;
    this.b = b;
  }

  // Think of MyClass as a data type, "other" is an instance of that data type
  public boolean same(MyClass other)
  {
    return other.a == this.a && other.b == this.b;
  }
}

public class MyClassTester
{
  public static void main(String[] args)
  {
    MyClass c1 = new MyClass(30, 123.9);
    MyClass c2 = new MyClass(30, 29.7);
    MyClass c3 = new MyClass(c1.a, c2.b);

    System.out.println(c2.same(c3));
  }
}