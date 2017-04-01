import { Params } from '@angular/router';
import { VendedorVO } from './../vo/VendedorVO';
import { Http, URLSearchParams, Headers, RequestOptions, Response } from '@angular/http';
import { Injectable } from '@angular/core';

import { BaseProvider } from './BaseProvider';

import 'rxjs/add/operator/toPromise';

@Injectable()
export class VendedorService extends BaseProvider {
   
   constructor(private http: Http){
       super();
   }

   public buscarTodos(): Promise<Array<VendedorVO>>{
       return this.http.get(BaseProvider.getBaseAPI() + 'vendedor/buscarTodos').toPromise()
       .then(response => response.json() as VendedorVO[]).catch(this.handlerError);
   }

   
   public buscarTodosAtivos(): Promise<Array<VendedorVO>>{
       return this.http.get(BaseProvider.getBaseAPI() + 'vendedor/buscarTodosAtivos').toPromise()
       .then(response => response.json() as VendedorVO[]).catch(this.handlerError);
   }

    public buscarPorCodigo(vendedor: VendedorVO): Promise<VendedorVO>{
       return this.http.post(BaseProvider.getBaseAPI() + 'vendedor/buscarPorCodigo', JSON.stringify(vendedor),
       this.options).toPromise().then((response: Response) => {return response.json() as VendedorVO;}).catch(this.handlerError);
   }

   public salvar(vendedor: VendedorVO): Promise<VendedorVO>{
       return this.http.post(BaseProvider.getBaseAPI() + 'vendedor/salvar', JSON.stringify(vendedor),
       this.options).toPromise().then((response: Response) => {return response.json() as VendedorVO;}).catch(this.handlerError);
   }

      public deletar(vendedor: VendedorVO): Promise<VendedorVO>{
       return this.http.post(BaseProvider.getBaseAPI() + 'vendedor/deletar', JSON.stringify(vendedor),
       this.options).toPromise().then((response: Response) => {return response.json() as VendedorVO;}).catch(this.handlerError);
   }

}