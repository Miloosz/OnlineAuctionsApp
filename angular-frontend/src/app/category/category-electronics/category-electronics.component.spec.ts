import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryElectronicsComponent } from './category-electronics.component';

describe('CategoryElektronikaComponent', () => {
  let component: CategoryElectronicsComponent;
  let fixture: ComponentFixture<CategoryElectronicsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryElectronicsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryElectronicsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
