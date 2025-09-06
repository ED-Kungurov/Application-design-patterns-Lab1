public class Manager extends Employee{
    int fixed_salary;
    int bonus;
    public Manager(String name, int id, String position, int fixed_salary, int bonus) {
        super(name, id, position);
        this.fixed_salary = fixed_salary;
        this.bonus = bonus;
    }
    @Override
    public int salaryResult (){
        return fixed_salary + bonus;
    }
}
