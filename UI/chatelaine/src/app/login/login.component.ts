import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  model = {
    username: '',
    password: ''
  };
  loggedInUser:any;

  constructor(private http: HttpClient,
      private router:Router,
      private authService: AuthService
  ) { }

  login() {
    this.http
<<<<<<< HEAD
      .post<any>(`http://localhost:8080/data/user/login`, this.model)
=======
      .post<any>(`http://localhost:8080/chatelaine/user/login`, this.model)
>>>>>>> e50f56f7e69abaf2c25f4023e0a99569caf0d009
      .subscribe(result => {
        this.authService.loggedInUser = result;
        this.router.navigate(['home']);
      });
  }

}
