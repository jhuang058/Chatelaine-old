import { Component } from '@angular/core';
import { Router, Event, NavigationEnd } from '@angular/router';
import { AuthService } from './auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'chatelaine';
  loggedInUser;
  constructor(authService: AuthService, router: Router) {
    router.events.subscribe((event: Event) => {
      console.log(event);
      if (event instanceof NavigationEnd) {
        if (authService.loggedInUser == undefined) {

          if (event.url !== '/' && event.url !== '/login' && event.url !== '/register') {
            router.navigate(['login']);
          }
        }else{
          this.loggedInUser = authService.loggedInUser;
        }
      }
    });

  }
}