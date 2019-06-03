package com.xf.tool;

import com.github.pagehelper.PageInfo;

public class PageUtils {

    public static String getPageStr(PageInfo pageInfo,String queryMethod){

        StringBuilder sb = new StringBuilder();

        //shouye
        if(pageInfo.isHasPreviousPage()){
            sb.append("<li ><a href=\"javascript:"+queryMethod+"("+pageInfo.getPrePage()+","+pageInfo.getPageSize()+")\">上一页</a></li>");
        }else{
            sb.append("<li class=\"disabled\"><a href=\"#\">上一页</a></li>");
        }

        //weiye
        if (pageInfo.isHasNextPage()){
            sb.append("<li ><a href=\"javascript:"+queryMethod+"("+pageInfo.getNextPage()+","+pageInfo.getPageSize()+")\">下一页</a></li>");
        }else{
            sb.append("<li class=\"disabled\"><a href=\"#\">下一页</a></li>");
        }


        return sb.toString();
    }

}
