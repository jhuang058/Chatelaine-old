import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-account-t',
  templateUrl: './account-t.component.html',
  styleUrls: ['./account-t.component.css']
})
export class AccountTComponent implements OnInit {

  field1: String = "Username: ";
  field2: String = "Password: ";
  field3: String = "First Name: ";
  field4: String = "Last Name: ";
  field5: String = "Phone Number: ";

  constructor() { }

  ngOnInit(): void {
  }

}
