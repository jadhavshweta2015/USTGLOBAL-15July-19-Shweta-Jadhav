import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

``

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EntertaimentComponent } from './entertaiment/entertaiment.component';
import { SportsComponent } from './sports/sports.component';
import { TechnologyComponent } from './technology/technology.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { HealthComponent } from './health/health.component';
import { BussinessComponent } from './bussiness/bussiness.component';

@NgModule({
  declarations: [
    AppComponent,
    EntertaimentComponent,
    SportsComponent,
    TechnologyComponent,
    HeaderComponent,
    HomeComponent,
    HealthComponent,
    BussinessComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    RouterModule.forRoot([
      {path:'',component:HeaderComponent},
      {path:'home',component:HomeComponent},
      {path:'entertainment',component: EntertaimentComponent},
      {path: 'sport',component:SportsComponent},
      {path: 'health', component:HealthComponent},
      {path:'bussiness', component: BussinessComponent},
      {path:'technology', component:TechnologyComponent}


      
  ])],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
