import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../classes/customerService';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-customer-details',
  templateUrl: './customer-details.component.html',
  styleUrls: ['./customer-details.component.css']
})
export class CustomerDetailsComponent implements OnInit {

  customer:any;
  id: Number;

  constructor(private customerService:CustomerService, private route: ActivatedRoute) {this.id = this.route.snapshot.params.id;
    this.customerService.getSingleCustomer(this.id).subscribe((customer)=> this.customer = customer); }

  ngOnInit(): void {
      
  }

}
