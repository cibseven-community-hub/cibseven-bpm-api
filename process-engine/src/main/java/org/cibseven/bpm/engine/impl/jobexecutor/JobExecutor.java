package org.cibseven.bpm.engine.impl.jobexecutor;

/**
 * Job executor should be not referenced directly from API.
 * Currently, it is referenced via JavaDoc from {@link org.cibseven.bpm.engine.ManagementService} and {@link org.cibseven.bpm.engine.repository.DeploymentHandler}.
 */
public interface JobExecutor {
}
