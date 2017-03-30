import { GenericVO } from './GenericVO';
export class VendedorVO extends GenericVO{
    public codigo: number;
    public nomeVendedor: string;
    public cpf: string;
    public numeroTelefone: number;

    constructor(
        codigo?: number,
        nomeVendedor?: string,
        cpf?: string,
        numeroTelefone?: number
    ){
        super();
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.cpf = cpf;
        this.numeroTelefone = numeroTelefone;
    }
}