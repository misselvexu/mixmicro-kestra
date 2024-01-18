package io.kestra.core.runners;

import io.kestra.core.utils.IdUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
@AllArgsConstructor
@Builder
public class ExecutionRunning {
    String tenantId;

    @NotNull
    String namespace;

    @NotNull
    String flowId;

    @NotNull
    String executionId;

    public String uid() {
        return IdUtils.fromParts(this.tenantId, this.namespace, this.flowId, executionId);
    }
}