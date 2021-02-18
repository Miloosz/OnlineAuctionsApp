import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryDomComponent } from './category-dom.component';

describe('CategoryDomComponent', () => {
  let component: CategoryDomComponent;
  let fixture: ComponentFixture<CategoryDomComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryDomComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryDomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
