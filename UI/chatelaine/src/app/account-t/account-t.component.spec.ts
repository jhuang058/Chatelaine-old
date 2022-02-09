import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AccountTComponent } from './account-t.component';

describe('AccountTComponent', () => {
  let component: AccountTComponent;
  let fixture: ComponentFixture<AccountTComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AccountTComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AccountTComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
