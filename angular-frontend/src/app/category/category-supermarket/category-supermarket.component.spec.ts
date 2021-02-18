import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategorySupermarketComponent } from './category-supermarket.component';

describe('CategorySupermarketComponent', () => {
  let component: CategorySupermarketComponent;
  let fixture: ComponentFixture<CategorySupermarketComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategorySupermarketComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategorySupermarketComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
