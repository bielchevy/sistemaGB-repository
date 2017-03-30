import { VendedorManterComponent } from './vendedor/vendedor-manter/vendedor-manter.component';
import { VendedorPesquisaComponent } from './vendedor/vendedor-pesquisa/vendedor-pesquisa.component';

import { VendedorService } from './../../provider/vendedor.servico';

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Routes, RouterModule } from '@angular/router';

import { AdministrativoModule } from './administrativo.module';


const administradorRoutes: Routes = [
{path:'', redirectTo:'vendedor-pesquisa', pathMatch:'full'},
{path:'vendedor-pesquisa', component: VendedorPesquisaComponent},
{path:'vendedor-manter', component: VendedorManterComponent},
{path:'vendedor-manter/:id', component: VendedorManterComponent}
];

@NgModule({
    imports:[
        CommonModule,
        FormsModule,
        ReactiveFormsModule,
        RouterModule.forChild(administradorRoutes)
    ],
    exports:[
        RouterModule
    ],
    providers: [VendedorService]
})
export class AdministrativoRoutingModule {}