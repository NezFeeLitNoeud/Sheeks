import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ConnexionComponent } from './components/User/connexion/connexion.component';
import { InscriptionComponent } from './components/User/inscription/inscription.component';
import { LogoutComponent } from './components/User/logout/logout.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { SearchComponent } from './components/Recherche/home/search.component';
import { DisplaySearchComponent } from './components/Recherche/display-search/display-search.component';

const routes: Routes = [
  {path: '', component: NavbarComponent},
  {path: 'inscription', component: InscriptionComponent},
  {path: 'connexion', component: ConnexionComponent},
  {path: 'logout', component: LogoutComponent},
  {path: 'search', component: SearchComponent},
  {path: 'search/announce/:id', component: DisplaySearchComponent}
  // {path: '**', component: Component Pour page pas trouver}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
