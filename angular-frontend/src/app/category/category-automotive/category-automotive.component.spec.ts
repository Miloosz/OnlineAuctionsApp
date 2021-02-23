import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryAutomotiveComponent } from './category-automotive.component';

describe('CategoryAutomotiveComponent', () => {
  let component: CategoryAutomotiveComponent;
  let fixture: ComponentFixture<CategoryAutomotiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryAutomotiveComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryAutomotiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
