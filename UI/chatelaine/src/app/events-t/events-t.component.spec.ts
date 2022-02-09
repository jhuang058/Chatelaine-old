import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventsTComponent } from './events-t.component';

describe('EventsTComponent', () => {
  let component: EventsTComponent;
  let fixture: ComponentFixture<EventsTComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EventsTComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EventsTComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
