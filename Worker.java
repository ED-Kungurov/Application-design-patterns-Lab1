public class Worker extends Employee {
    int salary;
    int hours;
    public Worker(String name, int id, String position, int salary, int hours) {
        super(name, id, position);
        this.salary = salary;
        this.hours = hours;
    }
    @Override
    public int salaryResult (){
        return salary * hours;
    }
}
