import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryUrodaComponent } from './category-uroda.component';

describe('CategoryUrodaComponent', () => {
  let component: CategoryUrodaComponent;
  let fixture: ComponentFixture<CategoryUrodaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryUrodaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryUrodaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
