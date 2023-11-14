package org.example.utilidades;
public enum MensajeSeguro {
    NOMBRE_LONGITUD("El nombre del asegurado debe ser maximo de 20 caracteres."),
    NOMBRE_CARACTER("El nombre del asegurado no cumple los parametros."),
    EDAD_NEGATIVA("La edad del asegurado no puede ser un numero negativo."),
    EDAD_MAYOR("Si eres mayor de 90 años debes comunícate al 0180001234 para hacer posible la afiliación."),
    COBERTURA_INCORRECTA("Solo se aceptan montos hasta de 1500 millones de pesos."),
    BENEFICIARIO_LONGITUD("Longitud máxima, 50 caracteres"),
    BENEFICIARIO_FORMATO("Solo se aceptan letras"),
    FECHA_INCORRECTA("Formato de fecha incorrecta"),
    ;

    private String MensajeSeguro;

    MensajeSeguro(String mensajeSeguro) {
        MensajeSeguro = mensajeSeguro;
    }

    public String getMensajeSeguro() {
        return MensajeSeguro;
    }

    public void setMensajeSeguro(String mensajeSeguro) {
        MensajeSeguro = mensajeSeguro;
    }
}
