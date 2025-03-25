import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerService } from '../../services/customer.service';
import { Customer } from '../../models/customer.model';

@Component({
  selector: 'app-customer-form',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './customer-form.component.html',
  styleUrl: './customer-form.component.css'
})
export class CustomerFormComponent implements OnInit {
  customerForm!: FormGroup;
  isEditMode = false;
  customerId = 0;
  submitted = false;

  constructor(
    private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private customerService: CustomerService
  ) { }

  ngOnInit(): void {
    this.customerForm = this.formBuilder.group({
      customer_name: ['', Validators.required],
      customer_city: ['', Validators.required],
      customer_email: ['', [Validators.required, Validators.email]]
    });

    this.route.params.subscribe(params => {
      if (params['id']) {
        this.isEditMode = true;
        this.customerId = +params['id'];
        this.loadCustomerData();
      }
    });
  }

  loadCustomerData(): void {
    this.customerService.getCustomerById(this.customerId).subscribe({
      next: (data) => {
        if (data && data.length > 0) {
          const customer = data[0];
          this.customerForm.patchValue({
            customer_name: customer.customer_name,
            customer_city: customer.customer_city,
            customer_email: customer.customer_email
          });
        }
      },
      error: (e) => console.error(e)
    });
  }

  onSubmit(): void {
    this.submitted = true;

    if (this.customerForm.invalid) {
      return;
    }

    const customer: Customer = {
      customer_id: this.isEditMode ? this.customerId : 0,
      ...this.customerForm.value
    };

    if (this.isEditMode) {
      this.customerService.updateCustomer(this.customerId, customer).subscribe({
        next: (res) => {
          if (res) {
            console.log('Customer updated successfully');
            this.router.navigate(['/customers']);
          }
        },
        error: (e) => console.error(e)
      });
    } else {
      this.customerService.createCustomer(customer).subscribe({
        next: (res) => {
          if (res) {
            console.log('Customer created successfully');
            this.router.navigate(['/customers']);
          }
        },
        error: (e) => console.error(e)
      });
    }
  }

  get f() { return this.customerForm.controls; }
}