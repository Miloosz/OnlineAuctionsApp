import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryBeautyComponent } from './category-beauty.component';

describe('CategoryBeautyComponent', () => {
  let component: CategoryBeautyComponent;
  let fixture: ComponentFixture<CategoryBeautyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryBeautyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryBeautyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
