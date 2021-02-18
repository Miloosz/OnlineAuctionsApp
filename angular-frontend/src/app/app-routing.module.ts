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
import {CategoryElectronicsComponent} from "./category/category-electronics/category-electronics.component";
import {CategoryFashionComponent} from "./category/category-fashion/category-fashion.component";
import {CategoryHomeComponent} from "./category/category-home/category-home.component";
import {CategorySupermarketComponent} from "./category/category-supermarket/category-supermarket.component";
import {CategoryChildComponent} from "./category/category-child/category-child.component";
import {CategoryBeautyComponent} from "./category/category-beauty/category-beauty.component";
import {CategoryHealthComponent} from "./category/category-health/category-health.component";
import {CategoryCultureComponent} from "./category/category-culture/category-culture.component";
import {CategorySportComponent} from "./category/category-sport/category-sport.component";
import {CategoryAutomotiveComponent} from "./category/category-automotive/category-automotive.component";
import {CategoryPropertyComponent} from "./category/category-property/category-property.component";

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'category', component: CategoryComponent,
    children: [
      { path: 'electronics', component: CategoryElectronicsComponent },
      { path: 'fashion', component: CategoryFashionComponent },
      { path: 'home&garden', component: CategoryHomeComponent },
      { path: 'supermarket', component: CategorySupermarketComponent },
      { path: 'child', component: CategoryChildComponent },
      { path: 'beauty', component: CategoryBeautyComponent },
      { path: 'health', component: CategoryHealthComponent },
      { path: 'culture&entertainment', component: CategoryCultureComponent },
      { path: 'sport&tourism', component: CategorySportComponent },
      { path: 'automotive', component: CategoryAutomotiveComponent },
      { path: 'property', component: CategoryPropertyComponent }
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
  CategoryPropertyComponent,
  CategoryAutomotiveComponent,
  CategorySportComponent,
  CategoryCultureComponent,
  CategoryHealthComponent,
  CategoryBeautyComponent,
  CategoryChildComponent,
  CategorySupermarketComponent,
  CategoryHomeComponent,
  CategoryFashionComponent,
  CategoryElectronicsComponent
]
