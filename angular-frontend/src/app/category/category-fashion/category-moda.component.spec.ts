import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryModaComponent } from './category-moda.component';

describe('CategoryModaComponent', () => {
  let component: CategoryModaComponent;
  let fixture: ComponentFixture<CategoryModaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryModaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryModaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
