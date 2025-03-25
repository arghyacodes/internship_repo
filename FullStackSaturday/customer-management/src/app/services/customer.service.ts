import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Customer } from '../models/customer.model';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private baseUrl = 'http://localhost:7007/api';

  constructor(private http: HttpClient) { }

  getCustomerList(): Observable<Customer[]> {
    return this.http.get<Customer[]>(`${this.baseUrl}/customer-list`);
  }

  createCustomer(customer: Customer): Observable<boolean> {
    return this.http.post<boolean>(`${this.baseUrl}/save-customer`, customer);
  }

  getCustomerById(id: number): Observable<Customer[]> {
    return this.http.get<Customer[]>(`${this.baseUrl}/customer/${id}`);
  }

  updateCustomer(id: number, customer: Customer): Observable<boolean> {
    return this.http.put<boolean>(`${this.baseUrl}/update-customer/${id}`, customer);
  }

  deleteCustomer(id: number): Observable<boolean> {
    return this.http.delete<boolean>(`${this.baseUrl}/delete-customer/${id}`);
  }
}