package org.cibseven.bpm.engine.impl.util;

import org.cibseven.bpm.engine.impl.__NotImplemented;

/**
 * Referenced from {@link org.cibseven.bpm.engine.delegate.BpmnError}
 * Real implementation has dependencies to loggers (approx. 25 classes, configuration impl, context etc...)
 */
public interface EnsureUtil {
  static void ensureNotEmpty(String string, String errorCode) {
    throw __NotImplemented.EXCEPTION;
  }
}
