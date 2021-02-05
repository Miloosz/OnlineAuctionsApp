import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { MainMenuComponent } from './main-menu/main-menu.component';
import { NavigationComponent } from './navigation/navigation.component';
import { LoginComponent } from './login/login.component';
import { CartComponent } from './cart/cart.component';
import { CategoryComponent } from './category/category.component';
import { AdvertismentsComponent } from './advertisments/advertisments.component';
import { ContactComponent } from './contact/contact.component';
import { ItemsComponent } from './items/items.component';
import {MatGridListModule} from "@angular/material/grid-list";
import {AppRoutingModule} from "./app-routing.module";
import { RegistrationComponent } from './registration/registration.component';
import {FaIconLibrary, FontAwesomeModule} from "@fortawesome/angular-fontawesome";
import {faHome as fasHome, faSignInAlt as fasSign, faRegistered as fasRegistered, faBook as fasBook, faHammer as fasHammer, faAddressCard as fasAddressCard, faCartArrowDown as fasCartArrowDown} from '@fortawesome/free-solid-svg-icons';
import { faFacebook as fabFacebook, faTwitter as fabTwitter, faInstagram as fabInstagram } from "@fortawesome/free-brands-svg-icons";

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
      ],
    imports: [
        BrowserModule,
        MatGridListModule,
        AppRoutingModule,
        FontAwesomeModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
  constructor(library: FaIconLibrary) {
    library.addIcons(fasHome, fasSign, fasRegistered, fasBook, fasHammer, fasAddressCard, fasCartArrowDown, fabFacebook, fabTwitter, fabInstagram)

  }
}
