import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../classes/customerService';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {
  customers:any;
  
  constructor(private customerService:CustomerService) { }
  
  ngOnInit(): void {
    this.customerService.getCustomers().subscribe((customer)=> this.customers=customer); 
  }

}




