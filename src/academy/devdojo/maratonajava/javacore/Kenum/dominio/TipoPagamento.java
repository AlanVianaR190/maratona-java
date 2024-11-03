package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento{

    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    /* essas constantes não são atributos nem métodos, mas sim instâncias
       do enum que encapsulam comportamentos específicos ao sobrescrever
       o método calcularDesconto() */

    // metodo abstrato
    public abstract double calcularDesconto(double valor);

    /* um metodo abstrato e um metodo que não tem funcionalidade ele
       e criado para ser sobrescrito */
}

/* uma classe enum tambem pode ser feita dentro de outra classe */