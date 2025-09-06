public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Ed", 1, "cleanliness manager", 150000, 10000);
        Manager manager2 = new Manager("Nikita Titov", 2, "Marketing manager", 110000, 20000);
        Manager manager3 = new Manager("Abdurachman Legenda", 3, "IT manager", 10000, 100000);
        Worker worker1 = new Worker("Alexey Lukianov", 4, "Backend", 15000, 30);
        Worker worker2 = new Worker("Damir Yermashev", 5, "Frontend", 12000, 29);
        Worker worker3 = new Worker("Dmitry Popov", 6, "Machine learning", 20000, 28);
        Worker worker4 = new Worker("Xenia Masanova", 7, "Data science", 15000, 27);
        Worker worker5 = new Worker("Nikolay Gladkov", 8, "UX/UI", 11000, 25);
        Worker worker6 = new Worker("Daniil Timoshenko", 9, "PR", 8000, 15);

        System.out.println(worker1.name + ": " + worker1.salaryResult());
        System.out.println(manager2.name + ": " + manager2.salaryResult());
        System.out.println(worker5.name + ": " + worker5.salaryResult());
        System.out.println(manager3.name + ": " + manager3.salaryResult());
    }
}
