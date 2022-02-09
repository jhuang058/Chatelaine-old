import { Component, OnInit } from '@angular/core';
import { MaintenanceService } from '../maintenance.service';
import { Ticket } from '../ticket';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-maintenance-a',
  templateUrl: './maintenance-a.component.html',
  styleUrls: ['./maintenance-a.component.css']
})
export class MaintenanceAComponent implements OnInit {

  
  tickets: Ticket[];
  newTicketDesc: string;
  newTicketId: number;
  userId: number;
  loggedInUser;

  constructor(private ms: MaintenanceService, private authService: AuthService) {
    this.loggedInUser = authService.loggedInUser;
   }

  ngOnInit(): void {

  }
  getTickets() {
    this.ms.getAllTickets().subscribe(
      (response: Ticket[]) => {
        this.tickets = response;
        console.log(this.tickets);
      }
    )
  }


}
