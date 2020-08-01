package cn.mirrorming.blog.domain.dto.article;

import cn.mirrorming.blog.domain.dto.user.UserDTO;
import cn.mirrorming.blog.domain.po.Article;
import cn.mirrorming.blog.domain.po.Category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Mireal Chan
 * @version V1.0
 * @date 2019/11/17 16:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleListDTO implements Serializable {
    private Integer id;
    private Article article;
    private UserDTO user;
    private Category category;
}