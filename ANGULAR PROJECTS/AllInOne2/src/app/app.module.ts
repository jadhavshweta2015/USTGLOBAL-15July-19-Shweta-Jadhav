import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule,ReactiveFormsModule } from '@angular/forms'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { StudentEntryComponent } from './student-entry/student-entry.component';
import { StudentDisplayComponent } from './student-display/student-display.component';
import { TemporaryFormComponent } from './temporary-form/temporary-form.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { NewsApiComponent } from './news-api/news-api.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { UrlComponent } from './url/url.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    StudentEntryComponent,
    StudentDisplayComponent,
    TemporaryFormComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    NewsApiComponent,
    PagenotfoundComponent,
    UrlComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    RouterModule.forRoot([
      {path:'' ,component:HeaderComponent},
      {path:'home',component:HomeComponent},
      {path:'temporary',component:TemporaryFormComponent},
      {path:'reactive',component:ReactiveFormComponent},
      {path:'news',component:NewsApiComponent},
      {path:'parent',component:ParentComponent},
      {path:'child',component:ChildComponent},
      {path:'entry',component:StudentEntryComponent},
      {path:'display',component:StudentDisplayComponent},
      {path:'**',component:PagenotfoundComponent}
    ]),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
