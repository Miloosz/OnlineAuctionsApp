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
import { BrowserComponent } from './browser/browser.component';
import { RegistrationComponent } from './registration/registration.component';


import {FaIconLibrary, FontAwesomeModule} from "@fortawesome/angular-fontawesome";
import {faHome as fasHome, faSignInAlt as fasSign, faRegistered as fasRegistered, faBook as fasBook, faHammer as fasHammer, faAddressCard as fasAddressCard, faCartArrowDown as fasCartArrowDown, faSearch as fasSearch, faChevronDown as fasChevronDown} from '@fortawesome/free-solid-svg-icons';
import { faFacebook as fabFacebook, faTwitter as fabTwitter, faInstagram as fabInstagram } from "@fortawesome/free-brands-svg-icons";
import {FormsModule} from "@angular/forms";
import { CategoryElektronikaComponent } from './category/category-electronics/category-elektronika.component';
import { CategoryModaComponent } from './category/category-fashion/category-moda.component';
import { CategoryDomComponent } from './category/category-home/category-dom.component';
import { CategorySupermarketComponent } from './category/category-supermarket/category-supermarket.component';
import { CategoryDzieckoComponent } from './category/category-child/category-dziecko.component';
import { CategoryUrodaComponent } from './category/category-beauty/category-uroda.component';
import { CategoryZdrowieComponent } from './category/category-health/category-zdrowie.component';
import { CategoryKulturaComponent } from './category/category-culture/category-kultura.component';
import { CategorySportComponent } from './category/category-sport/category-sport.component';
import { CategoryAutomotiveComponent } from './category/category-automotive/category-automotive.component';
import { CategoryNieruchomosciComponent } from './category/category-property/category-nieruchomosci.component';

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
    RegistrationComponent,
    ProductItemComponent,
    ProductListComponent,
    CartItemComponent,
    BrowserComponent,
    CategoryElektronikaComponent,
    CategoryModaComponent,
    CategoryDomComponent,
    CategorySupermarketComponent,
    CategoryDzieckoComponent,
    CategoryUrodaComponent,
    CategoryZdrowieComponent,
    CategoryKulturaComponent,
    CategorySportComponent,
    CategoryAutomotiveComponent,
    CategoryNieruchomosciComponent,
      ],
  imports: [
    BrowserModule,
    MatGridListModule,
    AppRoutingModule,
    FontAwesomeModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
  constructor(library: FaIconLibrary) {
    library.addIcons(fasHome, fasSign, fasRegistered, fasBook, fasHammer, fasAddressCard, fasCartArrowDown, fabFacebook, fabTwitter, fabInstagram, fasSearch, fasChevronDown)

  }
}
