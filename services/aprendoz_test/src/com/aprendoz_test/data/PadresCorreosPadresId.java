
package com.aprendoz_test.data;

import java.io.Serializable;


/**
 *  aprendoz_test.PadresCorreosPadresId
 *  01/13/2015 09:58:57
 * 
 */
public class PadresCorreosPadresId
    implements Serializable
{

    private Integer idPersona;
    private String codigo;
    private Boolean matriculado;
    private Boolean activoRetirado;
    private String apellido1;
    private String apellido2;
    private String nombre1;
    private String nombre2;
    private String correoPapa;
    private String correoMama;
    private Integer grupoFamiliarIdGrupoFamiliar;
    private Integer syIdSy;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PadresCorreosPadresId)) {
            return false;
        }
        PadresCorreosPadresId other = ((PadresCorreosPadresId) o);
        if (this.idPersona == null) {
            if (other.idPersona!= null) {
                return false;
            }
        } else {
            if (!this.idPersona.equals(other.idPersona)) {
                return false;
            }
        }
        if (this.codigo == null) {
            if (other.codigo!= null) {
                return false;
            }
        } else {
            if (!this.codigo.equals(other.codigo)) {
                return false;
            }
        }
        if (this.matriculado == null) {
            if (other.matriculado!= null) {
                return false;
            }
        } else {
            if (!this.matriculado.equals(other.matriculado)) {
                return false;
            }
        }
        if (this.activoRetirado == null) {
            if (other.activoRetirado!= null) {
                return false;
            }
        } else {
            if (!this.activoRetirado.equals(other.activoRetirado)) {
                return false;
            }
        }
        if (this.apellido1 == null) {
            if (other.apellido1 != null) {
                return false;
            }
        } else {
            if (!this.apellido1 .equals(other.apellido1)) {
                return false;
            }
        }
        if (this.apellido2 == null) {
            if (other.apellido2 != null) {
                return false;
            }
        } else {
            if (!this.apellido2 .equals(other.apellido2)) {
                return false;
            }
        }
        if (this.nombre1 == null) {
            if (other.nombre1 != null) {
                return false;
            }
        } else {
            if (!this.nombre1 .equals(other.nombre1)) {
                return false;
            }
        }
        if (this.nombre2 == null) {
            if (other.nombre2 != null) {
                return false;
            }
        } else {
            if (!this.nombre2 .equals(other.nombre2)) {
                return false;
            }
        }
        if (this.correoPapa == null) {
            if (other.correoPapa!= null) {
                return false;
            }
        } else {
            if (!this.correoPapa.equals(other.correoPapa)) {
                return false;
            }
        }
        if (this.correoMama == null) {
            if (other.correoMama!= null) {
                return false;
            }
        } else {
            if (!this.correoMama.equals(other.correoMama)) {
                return false;
            }
        }
        if (this.grupoFamiliarIdGrupoFamiliar == null) {
            if (other.grupoFamiliarIdGrupoFamiliar!= null) {
                return false;
            }
        } else {
            if (!this.grupoFamiliarIdGrupoFamiliar.equals(other.grupoFamiliarIdGrupoFamiliar)) {
                return false;
            }
        }
        if (this.syIdSy == null) {
            if (other.syIdSy!= null) {
                return false;
            }
        } else {
            if (!this.syIdSy.equals(other.syIdSy)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.idPersona!= null) {
            rtn = (rtn + this.idPersona.hashCode());
        }
        rtn = (rtn* 37);
        if (this.codigo!= null) {
            rtn = (rtn + this.codigo.hashCode());
        }
        rtn = (rtn* 37);
        if (this.matriculado!= null) {
            rtn = (rtn + this.matriculado.hashCode());
        }
        rtn = (rtn* 37);
        if (this.activoRetirado!= null) {
            rtn = (rtn + this.activoRetirado.hashCode());
        }
        rtn = (rtn* 37);
        if (this.apellido1 != null) {
            rtn = (rtn + this.apellido1 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.apellido2 != null) {
            rtn = (rtn + this.apellido2 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.nombre1 != null) {
            rtn = (rtn + this.nombre1 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.nombre2 != null) {
            rtn = (rtn + this.nombre2 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.correoPapa!= null) {
            rtn = (rtn + this.correoPapa.hashCode());
        }
        rtn = (rtn* 37);
        if (this.correoMama!= null) {
            rtn = (rtn + this.correoMama.hashCode());
        }
        rtn = (rtn* 37);
        if (this.grupoFamiliarIdGrupoFamiliar!= null) {
            rtn = (rtn + this.grupoFamiliarIdGrupoFamiliar.hashCode());
        }
        rtn = (rtn* 37);
        if (this.syIdSy!= null) {
            rtn = (rtn + this.syIdSy.hashCode());
        }
        return rtn;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(Boolean matriculado) {
        this.matriculado = matriculado;
    }

    public Boolean getActivoRetirado() {
        return activoRetirado;
    }

    public void setActivoRetirado(Boolean activoRetirado) {
        this.activoRetirado = activoRetirado;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getCorreoPapa() {
        return correoPapa;
    }

    public void setCorreoPapa(String correoPapa) {
        this.correoPapa = correoPapa;
    }

    public String getCorreoMama() {
        return correoMama;
    }

    public void setCorreoMama(String correoMama) {
        this.correoMama = correoMama;
    }

    public Integer getGrupoFamiliarIdGrupoFamiliar() {
        return grupoFamiliarIdGrupoFamiliar;
    }

    public void setGrupoFamiliarIdGrupoFamiliar(Integer grupoFamiliarIdGrupoFamiliar) {
        this.grupoFamiliarIdGrupoFamiliar = grupoFamiliarIdGrupoFamiliar;
    }

    public Integer getSyIdSy() {
        return syIdSy;
    }

    public void setSyIdSy(Integer syIdSy) {
        this.syIdSy = syIdSy;
    }

}