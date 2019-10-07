import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule ,ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { DogsComponent } from './dogs/dogs.component';
import { NewsComponent } from './news/news.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { DogsDetailsComponent } from './dogs-details/dogs-details.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BooksComponent } from './books/books.component';
import { BooksDetailsComponent } from './books-details/books-details.component';
import { CarComponent } from './car/car.component';
import { CarDetailsComponent } from './car-details/car-details.component';


@NgModule({
  declarations: [
    AppComponent,
    
    HeaderComponent,
    
    HomeComponent,
    
    DogsComponent,
    
    NewsComponent,
    
    LoginComponent,
    
    RegisterComponent,
    
    DogsDetailsComponent,
    
    ParentComponent,
    
    ChildComponent,
    
    BooksComponent,
    
    BooksDetailsComponent,
    
    CarComponent,
    
    CarDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path:'',component:HeaderComponent},
      { path:'home',component:HomeComponent},
      { path:'doggs',component:DogsComponent},
      { path:'news',component:NewsComponent},
      { path:'login', component:LoginComponent},
      { path:'register',component:RegisterComponent},
      { path:'parent',component:ParentComponent},
      { path:'books',component:BooksComponent},
      { path:'details',component:BooksDetailsComponent},
      { path:'car' ,component:CarComponent},
      {path:'cardetails', component:CarDetailsComponent}



    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
