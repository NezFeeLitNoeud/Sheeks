import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ConnexionComponent } from './components/connexion/connexion.component';
import { InscriptionComponent } from './components/inscription/inscription.component';
import { LogoutComponent } from './components/logout/logout.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { SearchComponent } from './components/search/search.component';

const routes: Routes = [
  {path: '', component: NavbarComponent},
  {path: 'Inscription', component: InscriptionComponent},
  {path: 'Connexion', component: ConnexionComponent},
  {path: 'Logout', component: LogoutComponent},
  {path: 'Recherche', component: SearchComponent}
  // {path: '**', component: Component Pour page pas trouver}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
