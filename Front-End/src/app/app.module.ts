import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppRoutes } from './app.route';
import { CustomerService } from './classes/customerService';
import { OrderService } from './classes/orderService';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule, FormsModule  } from '@angular/forms';
import { UpperBarComponent } from './upper-bar/upper-bar.component';
import { SideBarComponent } from './side-bar/side-bar.component';
import { CustomersComponent } from './customers/customers.component';
import { OrdersComponent } from './orders/orders.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { MakeOrderComponent } from './make-order/make-order.component';
import { HttpClientModule }    from '@angular/common/http';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';

@NgModule({
  declarations: [
    AppComponent,
    UpperBarComponent,
    SideBarComponent,
    CustomersComponent,
    OrdersComponent,
    AddCustomerComponent,
    MakeOrderComponent,
    CustomerDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    RouterModule,
    RouterModule.forRoot(AppRoutes),
    HttpClientModule
  ],
  providers: [CustomerService,OrderService],
  bootstrap: [AppComponent]
})
export class AppModule { }
