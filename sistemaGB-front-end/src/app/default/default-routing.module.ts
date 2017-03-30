import { DefaultComponent } from './default.component';

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Routes, RouterModule } from '@angular/router';


const defaultRoutes: Routes = [
{path:'', redirectTo:'index', pathMatch:'full'},
{path:'index', component: DefaultComponent}
];

@NgModule({
    imports:[
        CommonModule,
        FormsModule,
        ReactiveFormsModule,
        RouterModule.forChild(defaultRoutes)
    ],
    exports:[
        RouterModule
    ],
    providers: []
})
export class DefaultRoutingModule {}