import { NgModule } from "@angular/core";
import { Routes, RouterModule} from "@angular/router";
import {HomeComponent} from "./home/home.component";
import {CategoryComponent} from "./category/category.component";
import {ContactComponent} from "./contact/contact.component";
import {ItemsComponent} from "./items/items.component";
import {CartComponent} from "./cart/cart.component";
import {LoginComponent} from "./login/login.component";
import {RegistrationComponent} from "./registration/registration.component";

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'category', component: CategoryComponent },
  { path: 'contact', component: ContactComponent },
  { path: 'items', component: ItemsComponent },
  { path: 'cart', component: CartComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegistrationComponent }  ];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [HomeComponent, CategoryComponent, ContactComponent, ItemsComponent, CartComponent, LoginComponent, RegistrationComponent]
