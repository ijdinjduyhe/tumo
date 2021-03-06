package cn.tycoding.admin.dto;

import cn.tycoding.admin.entity.Comments;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 封装评论信息的DTO
 *
 * @auther TyCoding
 * @date 2018/11/2
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentsDTO implements Serializable {

    private Comments parent; //父级留言信息
    private List<Comments> childrenList; //所有子级回复、评论列表
}
