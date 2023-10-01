package org.itkk.udf.starter.process.activiti.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@Valid
public class PendingListDto {
    /**
     * 页数
     */
    @NotNull(message = "页数不能为空")
    private Integer page;
    /**
     * 行数
     */
    @NotNull(message = "行数不能为空")
    private Integer rows;

    /**
     * 流程定义名称
     */
    private String processDefinitionName;

    /**
     * 需排除的任务定义键
     */
    private List<String> taskDefinitionKeyNotInList;
}