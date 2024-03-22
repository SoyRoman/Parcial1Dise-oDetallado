
class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public boolean esPerfecto() {
        int suma = 0;
        for (int i = 1; i < valor; i++) {
            if (valor % i == 0) {
                suma += i;
            }
        }
        return suma == valor;
    }

    public boolean esAbundante() {
        int suma = 0;
        for (int i = 1; i < valor; i++) {
            if (valor % i == 0) {
                suma += i;
            }
        }
        return suma > valor;
    }

    public boolean esDefectivo() {
        int suma = 0;
        for (int i = 1; i < valor; i++) {
            if (valor % i == 0) {
                suma += i;
            }
        }
        return suma < valor;
    }
}

