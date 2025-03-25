import { Routes } from '@angular/router';
import { CustomerListComponent } from './components/customer-list/customer-list.component';
import { CustomerFormComponent } from './components/customer-form/customer-form.component';

export const routes: Routes = [
    { path: '', redirectTo: 'customers', pathMatch: 'full' },
    { path: 'customers', component: CustomerListComponent },
    { path: 'add', component: CustomerFormComponent },
    { path: 'edit/:id', component: CustomerFormComponent },
    { path: '**', redirectTo: 'customers' }
];