import { Headers, RequestOptions } from '@angular/http';
export class BaseProvider {
    public static HOST: string = 'http://localhost:8080/'
    public static BASE_API: string = 'sistemaGB/';

    public headers = new Headers({ 'Content-Type': 'application/json' });
    public options = new RequestOptions({ headers: this.headers });

    public static getBaseAPI(): string {
        return this.HOST + this.BASE_API;
    }


    public handlerError(error: any): Promise<any> {
        return Promise.reject(error.message || error);
    }

}