import { Routes } from '@angular/router';
import path from 'node:path';
import { EmpCrudComponent } from './employee-crud/employee-crud.component';

export const routes: Routes = [
    {path:'emp-crud', component:EmpCrudComponent}
];