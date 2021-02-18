import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryNieruchomosciComponent } from './category-nieruchomosci.component';

describe('CategoryNieruchomosciComponent', () => {
  let component: CategoryNieruchomosciComponent;
  let fixture: ComponentFixture<CategoryNieruchomosciComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryNieruchomosciComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryNieruchomosciComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
