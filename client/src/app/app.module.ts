import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule }   from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { InscriptionComponent } from './components/User/inscription/inscription.component';
import { ConnexionComponent } from './components/User/connexion/connexion.component';
import { LogoutComponent } from './components/User/logout/logout.component';
import { SearchComponent } from './components/Recherche/home/search.component';
import { PreviousComponent } from './components/common/previous/previous.component';
import { DisplaySearchComponent } from './components/Recherche/display-search/display-search.component';
import { PostComponent } from './components/post/post.component';
import { AnswerComponent } from './components/Recherche/answer/answer.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    InscriptionComponent,
    ConnexionComponent,
    LogoutComponent,
    SearchComponent,
    PreviousComponent,
    DisplaySearchComponent,
    PostComponent,
    AnswerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
