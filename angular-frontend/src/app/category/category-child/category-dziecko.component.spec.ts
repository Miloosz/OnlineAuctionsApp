import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryDzieckoComponent } from './category-dziecko.component';

describe('CategoryDzieckoComponent', () => {
  let component: CategoryDzieckoComponent;
  let fixture: ComponentFixture<CategoryDzieckoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryDzieckoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryDzieckoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
