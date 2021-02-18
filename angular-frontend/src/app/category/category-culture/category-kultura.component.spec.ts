import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryKulturaComponent } from './category-kultura.component';

describe('CategoryKulturaComponent', () => {
  let component: CategoryKulturaComponent;
  let fixture: ComponentFixture<CategoryKulturaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryKulturaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryKulturaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
