import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryElektronikaComponent } from './category-elektronika.component';

describe('CategoryElektronikaComponent', () => {
  let component: CategoryElektronikaComponent;
  let fixture: ComponentFixture<CategoryElektronikaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryElektronikaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryElektronikaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
