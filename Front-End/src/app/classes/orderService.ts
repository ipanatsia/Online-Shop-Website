import { Order } from './order';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';


@Injectable({
    providedIn: 'root'
  })
export class OrderService {
    
    constructor(private http:HttpClient){}
    
    getOrders (): Observable<Order[]> {
        return this.http.get<Order[]>('orders/getAllOrders');
    }


    addOrder(order : Order) :void{
       this.http.post<Order>('orders/addOrder',order).subscribe();
    }
    
}