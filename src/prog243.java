interface student
{
    public void info();
}
interface marks
{
    public void show1();
}
interface department extends student,marks
{
    public void show();
}
class only implements department
{
    public void info()
    {
        System.out.println("Enter info of the student");
    }
    public void show1()
    {
        System.out.println("display info of the student1");
    }
    public void show()
    {
        System.out.println("Enter info of the student2");
    }

}
class prog243
{
    public static void main(String[] args)
    {
        only e = new only();
        e.info();
        e.show1();
        e.show();
    }
}