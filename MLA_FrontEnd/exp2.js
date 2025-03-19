class Employee {
    constructor(id, name) {
        this.id = id;
        this.name = name;
        employeedetails()
        {
            document.writeln("Id : " + this.id + "    " + "Name : " + this.name);
        }   //method end
    }   //constructor end
}   //class end

let emp1 = new Employee(69,"Sanju");
let emp2 = new Employee(96,"Dj Sanju");


emp1.employeedetails();
emp2.employeedetails();