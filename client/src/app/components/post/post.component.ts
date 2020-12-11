import {
  HttpClient,
  HttpHeaders
} from '@angular/common/http';
import {
  Component,
  OnInit
} from '@angular/core';
import {
  AnnonceService
} from 'src/app/services/annonce/annonce.service';
import {
  UserService
} from 'src/app/services/users/user.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  model: any;
  constructor(private announceService: AnnonceService) {}

  ngOnInit(): void {

    this.model = {};
  }

  postAnnounce() {

    const token = localStorage.getItem('token');
    this.announceService.postAnnounce(this.model.titre, this.model.message, this.model.level, this.model.plateforme, this.model.game)
      .subscribe(() => {
          this.ngOnInit();
        },
        error => {
          console.log(error)
        })
  }

}
