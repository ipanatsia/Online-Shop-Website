import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { OrderService } from '../classes/orderService';
import { Order } from '../classes/order';
import { CustomerService } from '../classes/customerService';
import { Customer } from '../classes/customer';

@Component({
  selector: 'app-make-order',
  templateUrl: './make-order.component.html',
  styleUrls: ['./make-order.component.css']
})
export class MakeOrderComponent implements OnInit {

  form: FormGroup;
  customers:Array<Customer>;

  constructor(private orderService: OrderService, private customerService:CustomerService) {
    this.customerService.getCustomers().subscribe((customer)=> this.customers=customer);
   }

  ngOnInit(): void {
    this.form = new FormGroup({
      cost: new FormControl('', Validators.compose(
        [Validators.pattern("^[0-9]*$"), Validators.required])),
      client_id: new FormControl('',Validators.compose(
        [Validators.pattern("^[0-9]*$"), Validators.required]))
  });

    
  
}

getName (customers:Array<Customer>, id: Number): String {
  let index = customers.findIndex((customer)=> customer.id==id);

  return customers[index].surname;
}

onSubmit(data):void{
  let surname = this.getName(this.customers,data.client_id);
  this.orderService.addOrder(new Order(surname,data.cost,data.client_id));
  this.form.reset();
}

}
