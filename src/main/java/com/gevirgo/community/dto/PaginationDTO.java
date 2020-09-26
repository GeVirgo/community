package com.gevirgo.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 首页列表分页元素对象
 * @Author : dingliangliang
 * @Date: 2020-09-26 15:10
 */
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalCount, Integer page, Integer size) {
        //计算总页数
        totalPage = totalCount % size == 0 ? totalCount / size : totalCount / size + 1;

        this.page = page;
        pages.add(page);
        for (int i = 1; i <= 3 ; i++) {
            if (page - i > 0){
                pages.add(0,page - i);
            }
            if (page + i <= totalPage){
                pages.add(page + i);
            }
        }
        //是否展示上一页  仅当为第一页的时候不展示上一页按钮
        showPrevious = page == 1 ? false : true;
        //是否展示下一页  仅当为最后一页的时候不展示下一页按钮
        showNext = page == totalPage ? false : true;
        //是否展示首页   当包含第一页的时候 不展示首页按钮
        showFirstPage = pages.contains(1) ? false : true;
        //是否展示尾页   当包含最后一页的时候 不展示尾页按钮
        showEndPage = pages.contains(totalPage) ? false : true;
    }
}
