public class NumeroComplexo {
    private String valor;
    private double valorReal;
    private double valorImaginario;
    private String valorOutro;

    public NumeroComplexo(double valorReal, double valorImaginario) {
        this.valorReal = valorReal;
        this.valorImaginario = valorImaginario;
        if (valorImaginario==0) {
            System.out.println("Seu número imaginário não pode ser igual a 0.");
        } else if (valorImaginario > 0) {
            this.valor = valorReal + " +" + valorImaginario + " * i";
        } else {
            this.valor = valorReal + " -" + Math.abs(valorImaginario) + " * i";
        }
    }

    public void setValor(double valorReal, double valorImaginario) {
        this.valorReal = valorReal;
        this.valorImaginario = valorImaginario;
        if (valorImaginario==0) {
            System.out.println("Seu número imaginário não pode ser igual a 0.");
        } else if (valorImaginario > 0) {
            this.valor = valorReal + " +" + valorImaginario + " * i";
        } else {
            this.valor = valorReal + " -" + Math.abs(valorImaginario) + " * i";
        }
    }

    public String getValor() {
        return valor;
    }

    public double getValorReal() {
        return valorReal;
    }

    public double getValorImaginario() {
        return valorImaginario;
    }

    public String getValorOutro() {
        return  valorOutro;
    }

    public String somar(double valorRealOutro, double valorImaginarioOutro) {
        if (valorImaginarioOutro==0) {
            System.out.println("Seu número imaginário não pode ser igual a 0.");
        } else if (valorImaginario > 0) {
            this.valorOutro = valorRealOutro + " +" + valorImaginarioOutro + " * i";
        } else {
            this.valorOutro = valorRealOutro + " -" + Math.abs(valorImaginarioOutro) + " * i";
        }
        System.out.println("("+getValor()+") + ("+getValorOutro()+") =");
        if (valorImaginario + valorImaginarioOutro>=0) {
            return (double) valorReal + valorRealOutro + " +" + (double) (valorImaginario + valorImaginarioOutro) + " * i"; 
        } else {
            return (double) valorReal + valorRealOutro + " -" + Math.abs((double) (valorImaginario + valorImaginarioOutro)) + " * i";
        }
    }

    public String subtrair(double valorRealOutro, double valorImaginarioOutro) {
        if (valorImaginarioOutro==0) {
            System.out.println("Seu número imaginário não pode ser igual a 0.");
        } else if (valorImaginario > 0) {
            this.valorOutro = valorRealOutro + " +" + valorImaginarioOutro + " * i";
        } else {
            this.valorOutro = valorRealOutro + " -" + Math.abs(valorImaginarioOutro) + " * i";
        }
        System.out.println("("+getValor()+") - ("+getValorOutro()+") =");
        if (valorImaginario - valorImaginarioOutro>=0) {
            return (double) valorReal - valorRealOutro + " +" + (double) (valorImaginario - valorImaginarioOutro) + " * i"; 
        } else {
            return (double) valorReal - valorRealOutro + " -" + Math.abs((double) (valorImaginario - valorImaginarioOutro)) + " * i";
        }
    }
    
    public String multiplicar(double valorRealOutro, double valorImaginarioOutro) {
        if (valorImaginarioOutro==0) {
            System.out.println("Seu número imaginário não pode ser igual a 0.");
        } else if (valorImaginario > 0) {
            this.valorOutro = valorRealOutro + " +" + valorImaginarioOutro + " * i";
        } else {
            this.valorOutro = valorRealOutro + " -" + Math.abs(valorImaginarioOutro) + " * i";
        }
        System.out.println("("+getValor()+") * ("+getValorOutro()+") =");
        double termo1 = valorReal*valorRealOutro;
        double termo2 = valorReal*valorImaginarioOutro;
        double termo3 = valorImaginario*valorRealOutro;
        double termo4 = valorImaginario*valorImaginarioOutro;
        double parteReal = termo1 - termo4;
        double parteImaginaria = termo2 + termo3;
        if (parteImaginaria!=0) {
            return String.format("%+.1f", parteReal) + String.format("%+.1f", parteImaginaria) + " *i";
        } else {
            return String.format("%+.1f", parteReal);
        }
    }
    
    public String dividir(double valorRealOutro, double valorImaginarioOutro) {
        if (valorImaginarioOutro==0) {
            System.out.println("Seu número imaginário não pode ser igual a 0.");
        } else if (valorImaginario > 0) {
            this.valorOutro = valorRealOutro + " +" + valorImaginarioOutro + " * i";
        } else {
            this.valorOutro = valorRealOutro + " -" + Math.abs(valorImaginarioOutro) + " * i";
        }
        System.out.println("("+getValor()+") / ("+getValorOutro()+") =");
        double termo1 = valorReal*valorRealOutro;
        double termo2 = valorReal*valorImaginarioOutro;
        double termo3 = valorImaginario*valorRealOutro;
        double termo4 = valorImaginario*valorImaginarioOutro;
        double denominador = valorRealOutro*valorRealOutro + valorImaginarioOutro*valorImaginarioOutro;
        double parteReal = (termo1 + termo4) / denominador;
        double parteImaginaria = (termo3 - termo2) / denominador;
        if (Math.abs(parteImaginaria) < 0.0001) {
            if (parteReal==0) {
                return "0";
            }
            return String.format("%.1f", parteReal);
        } else {
            if (parteReal==0) {
            return String.format("%+.1f", parteImaginaria) + " * i";
            }
            return String.format("%.1f", parteReal) + String.format("%+.1f", parteImaginaria) + " * i";
        }
    }
}