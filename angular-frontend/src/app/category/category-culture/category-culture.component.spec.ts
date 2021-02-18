import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryCultureComponent } from './category-culture.component';

describe('CategoryKulturaComponent', () => {
  let component: CategoryCultureComponent;
  let fixture: ComponentFixture<CategoryCultureComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryCultureComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryCultureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
