package com.example.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("点赞实体类")
public class Like implements Serializable {
    private static final long serialVersionUID = 6152813149972484534L;

    @ApiModelProperty(value = "点赞ID")
    @TableId(type = IdType.AUTO)
    private Long likeId;

    @ApiModelProperty(value = "用户ID",position = 1)
    private Long userId;

    @ApiModelProperty(value = "评论ID",position = 2)
    private Long commentId;

    @ApiModelProperty(value = "点赞时间",position = 3)
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime time;
}
