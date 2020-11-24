import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/users/user.service';

@Component({
  selector: 'app-profil',
  templateUrl: './profil.component.html',
  styleUrls: ['./profil.component.css']
})
export class ProfilComponent implements OnInit {

  users: any;
  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.userService.getUser().subscribe(res => {
    this.users = res;
    console.log(res)
    }
    );
  }

}
