/**
 * WUDeleteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsworkunits.ws.hpccsystems;

public class WUDeleteResponse  implements java.io.Serializable {
    private wsworkunits.ws.hpccsystems.ArrayOfEspException exceptions;

    private wsworkunits.ws.hpccsystems.WUActionResult[] actionResults;

    public WUDeleteResponse() {
    }

    public WUDeleteResponse(
           wsworkunits.ws.hpccsystems.ArrayOfEspException exceptions,
           wsworkunits.ws.hpccsystems.WUActionResult[] actionResults) {
           this.exceptions = exceptions;
           this.actionResults = actionResults;
    }


    /**
     * Gets the exceptions value for this WUDeleteResponse.
     * 
     * @return exceptions
     */
    public wsworkunits.ws.hpccsystems.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUDeleteResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(wsworkunits.ws.hpccsystems.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the actionResults value for this WUDeleteResponse.
     * 
     * @return actionResults
     */
    public wsworkunits.ws.hpccsystems.WUActionResult[] getActionResults() {
        return actionResults;
    }


    /**
     * Sets the actionResults value for this WUDeleteResponse.
     * 
     * @param actionResults
     */
    public void setActionResults(wsworkunits.ws.hpccsystems.WUActionResult[] actionResults) {
        this.actionResults = actionResults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUDeleteResponse)) return false;
        WUDeleteResponse other = (WUDeleteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exceptions==null && other.getExceptions()==null) || 
             (this.exceptions!=null &&
              this.exceptions.equals(other.getExceptions()))) &&
            ((this.actionResults==null && other.getActionResults()==null) || 
             (this.actionResults!=null &&
              java.util.Arrays.equals(this.actionResults, other.getActionResults())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExceptions() != null) {
            _hashCode += getExceptions().hashCode();
        }
        if (getActionResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActionResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActionResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUDeleteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeleteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ActionResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUActionResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUActionResult"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
