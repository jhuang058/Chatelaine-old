import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HomeComponent } from './home/home.component';
import { TenantComponent } from './tenant/tenant.component';
import { DocumentsTComponent } from './documents-t/documents-t.component';
import { EventsTComponent } from './events-t/events-t.component';
import { MaintenanceTComponent } from './maintenance-t/maintenance-t.component';
import { MaintenanceAComponent } from './maintenance-a/maintenance-a.component';

const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'login', component:LoginComponent},
  {path:'register', component:RegisterComponent},
  {path:'userProfile', component:UserProfileComponent},
  {path:'tenant', component:TenantComponent},
  {path:'documents', component:DocumentsTComponent},
  {path:'events', component:EventsTComponent},
  {path:'tickets', component:MaintenanceAComponent},
  {path:'**', component:HomeComponent},
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
