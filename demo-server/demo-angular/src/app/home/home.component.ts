import { Component, OnInit } from '@angular/core';
import { Artist } from '../shared/artist';
import { ArtistService } from '../shared/artist.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  artists: Artist[] = [];

  constructor(private artistService: ArtistService) { }

  ngOnInit() {
    this.artists = this.artistService.getArtists();
  }

}
