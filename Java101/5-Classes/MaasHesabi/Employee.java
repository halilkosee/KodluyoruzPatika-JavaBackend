public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    int currentYear;
    public Employee(String name,double salary,double workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.currentYear = 2021;
    }

    public double tax(){
        /*Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.*/
        if(this.salary>=1000){
           double tax = (this.salary * 0.03);
           return tax;
        }
        return 0;
    }

    public double bonus(){
        if(this.workHours>40){
            double extraHours = this.workHours - 40;
            return 30.0* extraHours;
        }
        return 0;
    }
    public double raiseSalary(){
        if((currentYear-this.hireYear) < 10  ){
            return this.salary * 0.05;

        }else if(((currentYear-this.hireYear) >= 10)   && ((currentYear-this.hireYear) < 20)){
            return this.salary*0.1;
        }
        return this.salary*0.15;
    }

    public void employeeInfo(){
        System.out.println(
            "Adı : " + this.name + 
            "\nMaaşı :" + this.salary +
            "\nÇalışma Saati :" + this.workHours +
            "\nBaşlangıç Yılı :" + this.hireYear + 
            "\nVergi :" + this.tax() +
            "\nBonus :" + this.bonus() +
            "\nMaaş Artışı :" + this.raiseSalary() +
            "\nVergi ve Bonuslar ile birlikte maaş : " + (this.tax() + this.bonus() + this.salary) +
            "\nToplam Maaş :" + (this.tax() + this.bonus() + this.salary + raiseSalary())
        );
    } 
}
