import { ApplicationModule, Component, OnInit } from '@angular/core';
import data from '../../data/employee.json'
import { CommonModule, NgFor } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { RouterOutlet } from '@angular/router';


interface Employee{
  id: number;
  name: string;
  email:string;
  gender: string;
}

@Component({
  selector: 'app-employee-crud',
  imports: [CommonModule,
    ApplicationModule,
    RouterOutlet],
  templateUrl: './employee-crud.component.html',
  styleUrl: './employee-crud.component.css'
})



export class EmployeeCrudComponent implements OnInit{
  employee: Employee[]=[];

  constructor(){ }
  ngOnInit(): void {
      this.employee=data;
  }
  deleteEmp(empId : any){
    const index = this.employee.findIndex(x=>x.id==empId);
    this.employee.splice(index,1)
  }

}
