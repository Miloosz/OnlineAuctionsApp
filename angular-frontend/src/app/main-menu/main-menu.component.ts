import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main-menu',
  templateUrl: './main-menu.component.html',
  styleUrls: ['./main-menu.component.css']
})
export class MainMenuComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  categories: string[] = ['Elektronika', "Moda", 'Dom i ogród', 'Supermarket', 'Dziecko', 'Uroda', 'Zdrowie', 'Kultura i rozrywka', 'Sport i turystyka', 'Motoryzacja', 'Nieruchomości'];
  typesOfAuctions: string[] = ['Ostatnio dodane', "Wystawione przez Ciebie", "Licytowane przez Ciebie", "Obserwowane", 'Zakończone'];

}
