import { GenericVO } from './GenericVO';

export class VendedorVO extends GenericVO {


    constructor(
        public codigo?: number,
        public nomeVendedor?: string,
        public cpf?: string,
        public numeroTelefone?: number,
        public dataRetirada?: Date
    ) {
        super();
    }




}