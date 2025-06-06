
package com.webservices.controladores.publicar;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "campoInvalidoException", targetNamespace = "http://publicar.controladores/")
public class CampoInvalidoException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CampoInvalidoException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CampoInvalidoException_Exception(String message, CampoInvalidoException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public CampoInvalidoException_Exception(String message, CampoInvalidoException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: publicar.CampoInvalidoException
     */
    public CampoInvalidoException getFaultInfo() {
        return faultInfo;
    }

}
