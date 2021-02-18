import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryHealthComponent } from './category-health.component';

describe('CategoryZdrowieComponent', () => {
  let component: CategoryHealthComponent;
  let fixture: ComponentFixture<CategoryHealthComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryHealthComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryHealthComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
