import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component, OnInit, ViewEncapsulation } from '@angular/core';
import { RouterModule, ActivatedRoute } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ArtistItemComponent } from './artist-item/artist-item.component';
import { ArtistDetailComponent } from './artist-detail/artist-detail.component';
import { ArtistService } from './shared/artist.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    ArtistItemComponent,
    ArtistDetailComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'artists/:artistId', component: ArtistDetailComponent}
    ])
  ],
  providers: [ArtistService],
  bootstrap: [AppComponent]
})
export class AppModule { }
