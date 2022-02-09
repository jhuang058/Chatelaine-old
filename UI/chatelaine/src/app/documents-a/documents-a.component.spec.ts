import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DocumentsAComponent } from './documents-a.component';

describe('DocumentsAComponent', () => {
  let component: DocumentsAComponent;
  let fixture: ComponentFixture<DocumentsAComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DocumentsAComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DocumentsAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
