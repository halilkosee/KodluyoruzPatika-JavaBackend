public class MaasHesaplamaMain {
    public static void main(String[] args) {
        Employee E1 = new Employee("halil",5750.5,43,2021);
        Employee E2 = new Employee("osman",3750.9,38.5,1990);
        E1.employeeInfo();
        System.out.println("----------------------------");
        E2.employeeInfo();
    }
}
