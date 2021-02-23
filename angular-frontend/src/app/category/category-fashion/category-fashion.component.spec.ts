import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryFashionComponent } from './category-fashion.component';

describe('CategoryFashionComponent', () => {
  let component: CategoryFashionComponent;
  let fixture: ComponentFixture<CategoryFashionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryFashionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryFashionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
