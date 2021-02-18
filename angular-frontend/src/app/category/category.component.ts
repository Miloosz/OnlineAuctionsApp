import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router, ParamMap} from "@angular/router";


@Component({
  selector: 'app-category',
  template: `

  <p>
    <button (click)="showElectronics()">Elektronika</button>
  </p>
  <router-outlet></router-outlet>
  `,
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

  public categoryId;

  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {

    this.route.paramMap.subscribe((params: ParamMap) => {
      let id = parseInt(params.get('id'));
      this.categoryId = id;
      }
    )

  }

  showElectronics(){
    this.router.navigate(['Electronics'], { relativeTo: this.route}); //nawigacja nie działa
  }

}
