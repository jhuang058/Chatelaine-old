import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DocumentsTComponent } from './documents-t.component';

describe('DocumentsTComponent', () => {
  let component: DocumentsTComponent;
  let fixture: ComponentFixture<DocumentsTComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DocumentsTComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DocumentsTComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
