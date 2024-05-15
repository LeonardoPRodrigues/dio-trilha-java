package entidades;

public class Curso extends Conteudo {

    private double cargaHoraria;


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo do curso:" + getTitulo()
                +", Descrição: " + getDescricao()
                +", Carga Horaria: " + getCargaHoraria()
                + '}';
    }
}
