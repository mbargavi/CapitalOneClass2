import { Injectable } from '@angular/core';
import { Artist } from './artist';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ArtistService {

  constructor(private http: HttpClient) { }

  getArtists(): Artist[] {
    const artists: Artist[] = [];

    this.http.get<Artist[]>('http://localhost:8080/demo-server/api/artist/all')
      .subscribe(
        data => artists.push(...data),
        err => console.log(err)
      );

      return artists;
  }

  getArtistById(artistId: number) {
    const artist: Artist = <Artist> {};

    this.http.get<Artist>('http://localhost:8080/demo-server/api/artist/${artistId}')
      .subscribe(
        data => Object.assign(artist, data),
        err => console.log(err)
      );

    return artist;
  }
}
