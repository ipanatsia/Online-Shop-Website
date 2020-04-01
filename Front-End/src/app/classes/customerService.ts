import { Customer } from './customer';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';


@Injectable({
    providedIn: 'root'
  })
export class CustomerService {
    
    constructor(private http:HttpClient){}
    
    getCustomers (): Observable<Customer[]> {
        return this.http.get<Customer[]>('customers/getAllCustomers');
    }


    addCustomer(customer : Customer) :void{
       this.http.post<Customer>('customers/addCustomer',customer).subscribe();
    }
    
    
    getSingleCustomer(id: Number): Observable<Customer> {
        
        return this.http.get<Customer>('customers/customer/'+id.toString());        
    }
}