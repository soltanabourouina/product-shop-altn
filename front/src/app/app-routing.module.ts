import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ProductsComponent} from "./products/products.component";
import {ProductsAdminComponent} from "./products/products-admin.component";

const routes: Routes = [

  {
    path: '',
    component: ProductsComponent
  },
  {
    path: 'products',
    component: ProductsComponent,
    data: { name: 'Products', path: 'products' }
  },
  {
    path: 'admin',
    component: ProductsAdminComponent,
    data: { name: 'Admin', path: 'admin' }
  }


];

@NgModule({
  imports: [RouterModule.forRoot(routes, { relativeLinkResolution: 'legacy' })],
  exports: [RouterModule],
})

export class AppRoutingModule {}
