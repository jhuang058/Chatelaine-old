import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventsAComponent } from './events-a.component';

describe('EventsAComponent', () => {
  let component: EventsAComponent;
  let fixture: ComponentFixture<EventsAComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EventsAComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EventsAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
