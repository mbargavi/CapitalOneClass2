import { Component, Input } from '@angular/core';
import { Artist } from '../shared/artist';

@Component({
  selector: 'app-artist-item',
  templateUrl: './artist-item.component.html',
  styleUrls: ['./artist-item.component.css']
})
export class ArtistItemComponent {

  @Input() artist: Artist;

}
