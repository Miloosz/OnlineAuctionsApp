import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryZdrowieComponent } from './category-zdrowie.component';

describe('CategoryZdrowieComponent', () => {
  let component: CategoryZdrowieComponent;
  let fixture: ComponentFixture<CategoryZdrowieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryZdrowieComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryZdrowieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
