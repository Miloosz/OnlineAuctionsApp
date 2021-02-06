import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { MainMenuComponent } from './main-menu/main-menu.component';
import { NavigationComponent } from './navigation/navigation.component';
import { LoginComponent } from './login/login.component';
import { CartComponent } from './shopping-cart/cart/cart.component';
import { CategoryComponent } from './category/category.component';
import { AdvertismentsComponent } from './advertisments/advertisments.component';
import { ContactComponent } from './contact/contact.component';
import { ItemsComponent } from './items/items.component';
import {MatGridListModule} from "@angular/material/grid-list";
import {AppRoutingModule} from "./app-routing.module";
import { ProductItemComponent } from './product/product-item/product-item.component';
import { ProductListComponent } from './product/product-list/product-list.component';
import { CartItemComponent } from './shopping-cart/cart-item/cart-item.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    MainMenuComponent,
    NavigationComponent,
    LoginComponent,
    CartComponent,
    CategoryComponent,
    AdvertismentsComponent,
    ContactComponent,
    ItemsComponent,
    ProductItemComponent,
    ProductListComponent,
    CartItemComponent,
      ],
    imports: [
        BrowserModule,
        MatGridListModule,
        AppRoutingModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
export const routingComponents = [HomeComponent, CategoryComponent]
