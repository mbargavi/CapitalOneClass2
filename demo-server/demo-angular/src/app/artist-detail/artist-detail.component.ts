import { Component, OnInit } from '@angular/core';
import { Artist } from '../shared/artist';
import { ArtistService } from '../shared/artist.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-artist-detail',
  templateUrl: './artist-detail.component.html',
  styleUrls: ['./artist-detail.component.css']
})
export class ArtistDetailComponent implements OnInit {

  artist: Artist;

  constructor(private route: ActivatedRoute, private artistService: ArtistService) { }

  ngOnInit() {
    // tslint:disable-next-line:radix
    const artistId: number = parseInt(this.route.snapshot.params['artistId']);
    this.artist = this.artistService.getArtistById(artistId);
  }

}
