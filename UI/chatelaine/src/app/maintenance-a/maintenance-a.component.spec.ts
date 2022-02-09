import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MaintenanceAComponent } from './maintenance-a.component';

describe('MaintenanceAComponent', () => {
  let component: MaintenanceAComponent;
  let fixture: ComponentFixture<MaintenanceAComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MaintenanceAComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MaintenanceAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
