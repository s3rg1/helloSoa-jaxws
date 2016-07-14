
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.example.soacourse.soap;

import java.util.logging.Logger;

import org.example.soacourse.audit.AuditEventType;
import org.example.soacourse.audit.AuditLoggingPortType;

public class AuditLoggingSoapImpl implements AuditLoggingPortType {

    private static final Logger LOG = Logger.getLogger(AuditLoggingSoapImpl.class.getName());

    public void saveEvent(AuditEventType auditEvent) { 
        LOG.info("Executing operation saveEvent");
        try {
        	LOG.info("Saving audit event: " + auditEvent.getId() + ". " + auditEvent.getName());
        } catch (java.lang.Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
