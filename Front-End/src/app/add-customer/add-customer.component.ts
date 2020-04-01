import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomerService } from '../classes/customerService';
import { Customer } from '../classes/customer';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {

  form: FormGroup;

  constructor(private customerService: CustomerService) { }
    
  ngOnInit(): void {
    this.form = new FormGroup({
      name: new FormControl('', Validators.required),
      surname: new FormControl('', Validators.required),
      email: new FormControl('',Validators.compose(
        [Validators.pattern("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"), Validators.required])),
      birthdate: new FormControl('', Validators.required)      
  });  
}

onSubmit(data): void{
  this.customerService.addCustomer(new Customer(data.name,data.surname,data.email,data.birthdate));
  this.form.reset();
}
   

}
