import { TemplatePadraoComponent } from './templates/template-padrao/template-padrao.component';

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Routes, RouterModule } from '@angular/router';

const appRoutes: Routes = [
{path:'', redirectTo:'sistemaGB', pathMatch:'full'},
{path:'sistemaGB', component: TemplatePadraoComponent, loadChildren: './default/default.module#DefaultModule'},
{path:'sitemaGB/administrativo', component: TemplatePadraoComponent, loadChildren: './Administrativo/administrativo.module#AdministrativoModule'}
];

@NgModule({
    imports:[
        CommonModule,
        RouterModule.forRoot(appRoutes, {useHash: false})
    ],
    exports:[ RouterModule ],
    declarations: [TemplatePadraoComponent]
})
export class AppRoutingModule {}