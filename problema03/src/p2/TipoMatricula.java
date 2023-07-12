    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package p2;

    import p1.Matricula;

    /**
     *
     * @author reroes
     */
    public class TipoMatricula {
        private double promedioMatriculas;
        private Matricula campamento;
        private Matricula colegio;
        public void setMatriculaCampamento(Matricula c){
            campamento = c;
        }
        public void setMatriculaColegio(Matricula c){
            colegio = c;
        }
        public Matricula getMatriculaCampamento(){
            return campamento;
        }
        public Matricula getMatriculaColegio(){
            return colegio;
        }
        public void setPromedioTarifa(){
            promedioMatriculas = (getMatriculaCampamento().obtenerTarifa()
                    + getMatriculaColegio().obtenerTarifa()/2);
        }
        public double getPromedioTarifa(){
            return promedioMatriculas;
        }


    }
