import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryChildComponent } from './category-child.component';

describe('CategoryDzieckoComponent', () => {
  let component: CategoryChildComponent;
  let fixture: ComponentFixture<CategoryChildComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryChildComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
