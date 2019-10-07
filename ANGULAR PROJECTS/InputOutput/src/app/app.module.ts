import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { CarComponent } from './car/car.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { ReceipeComponent } from './receipe/receipe.component';
import { ReceipeDetailsComponent } from './receipe-details/receipe-details.component';
import { NewsComponent } from './news/news.component';
import { NewsDetailsComponent } from './news-details/news-details.component';
import { MobileComponent } from './mobile/mobile.component';
import { MobileDetailsComponent } from './mobile-details/mobile-details.component';
import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HeaderComponent } from './header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    CarComponent,
    CarDetailsComponent,
    ReceipeComponent,
    ReceipeDetailsComponent,
    NewsComponent,
    NewsDetailsComponent,
    MobileComponent,
    MobileDetailsComponent,
    HeaderComponent,
    HomeComponent,
    PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path: '' , component: HomeComponent},
      { path: 'car' , component: CarComponent},
      { path: 'mbl' , component: MobileComponent},
      { path: 'news' , component: NewsComponent},
      { path: 'receipe' , component: ReceipeComponent},
      { path: '**' , component: PageNotFoundComponent}

      

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
