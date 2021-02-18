import { NgModule } from "@angular/core";
import { Routes, RouterModule} from "@angular/router";
import {HomeComponent} from "./home/home.component";
import {CategoryComponent} from "./category/category.component";
import {ContactComponent} from "./contact/contact.component";
import {ItemsComponent} from "./items/items.component";
import {CartComponent} from "./shopping-cart/cart/cart.component";
import {LoginComponent} from "./login/login.component";
import {RegistrationComponent} from "./registration/registration.component";
import {BrowserComponent} from "./browser/browser.component";
import {CategoryElektronikaComponent} from "./category/category-electronics/category-elektronika.component";
import {CategoryModaComponent} from "./category/category-fashion/category-moda.component";
import {CategoryDomComponent} from "./category/category-home/category-dom.component";
import {CategorySupermarketComponent} from "./category/category-supermarket/category-supermarket.component";
import {CategoryDzieckoComponent} from "./category/category-child/category-dziecko.component";
import {CategoryUrodaComponent} from "./category/category-beauty/category-uroda.component";
import {CategoryZdrowieComponent} from "./category/category-health/category-zdrowie.component";
import {CategoryKulturaComponent} from "./category/category-culture/category-kultura.component";
import {CategorySportComponent} from "./category/category-sport/category-sport.component";
import {CategoryAutomotiveComponent} from "./category/category-automotive/category-automotive.component";
import {CategoryNieruchomosciComponent} from "./category/category-property/category-nieruchomosci.component";

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'category', component: CategoryComponent,
    children: [
      { path: 'electronics', component: CategoryElektronikaComponent },
      { path: 'fashion', component: CategoryModaComponent },
      { path: 'home&garden', component: CategoryDomComponent },
      { path: 'supermarket', component: CategorySupermarketComponent },
      { path: 'child', component: CategoryDzieckoComponent },
      { path: 'beauty', component: CategoryUrodaComponent },
      { path: 'health', component: CategoryZdrowieComponent },
      { path: 'culture&entertainment', component: CategoryKulturaComponent },
      { path: 'sport&tourism', component: CategorySportComponent },
      { path: 'automotive', component: CategoryAutomotiveComponent },
      { path: 'property', component: CategoryNieruchomosciComponent }
    ]
  },
  { path: 'contact', component: ContactComponent },
  { path: 'items', component: ItemsComponent },
  { path: 'cart', component: CartComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegistrationComponent },
  { path: 'search', component: BrowserComponent }  ];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [
  HomeComponent,
  CategoryComponent,
  ContactComponent,
  ItemsComponent,
  CartComponent,
  LoginComponent,
  RegistrationComponent,
  BrowserComponent,
  CategoryNieruchomosciComponent,
  CategoryAutomotiveComponent,
  CategorySportComponent,
  CategoryKulturaComponent,
  CategoryZdrowieComponent,
  CategoryUrodaComponent,
  CategoryDzieckoComponent,
  CategorySupermarketComponent,
  CategoryDomComponent,
  CategoryModaComponent,
  CategoryElektronikaComponent
]
