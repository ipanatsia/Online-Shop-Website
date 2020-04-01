import { Routes, RouterModule } from '@angular/router';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { CustomersComponent } from './customers/customers.component';
import { MakeOrderComponent } from './make-order/make-order.component';
import { OrdersComponent } from './orders/orders.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';

export const AppRoutes: Routes = [
    { path: '', component: CustomersComponent },
    { path: 'customers', component: CustomersComponent },
    { path: 'addCustomer', component: AddCustomerComponent },
    { path: 'orders', component: OrdersComponent },
    { path: 'makeOrder', component: MakeOrderComponent },
    { path: 'customerDetails/:id', component: CustomerDetailsComponent },
    { path: '../customerDetails/:id', component: CustomerDetailsComponent }
]

