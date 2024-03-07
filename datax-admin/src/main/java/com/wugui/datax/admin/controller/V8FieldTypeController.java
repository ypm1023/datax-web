package com.wugui.datax.admin.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.wugui.datax.admin.entity.V8FieldType;
import com.wugui.datax.admin.service.V8FieldTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author liliang
 * @date 2024/3/6
 */
@Api(tags = "V8实体字段类型配置接口")
@RestController
@RequestMapping("/api/v8/fieldtype")
public class V8FieldTypeController extends BaseController{

    @Autowired
    V8FieldTypeService v8FieldTypeService;

    @GetMapping("/pageList")
    @ApiOperation("分页查询所有数据")
    @ApiImplicitParams(
            {@ApiImplicitParam(paramType = "query", dataType = "String", name = "current", value = "当前页", defaultValue = "1", required = true),
                    @ApiImplicitParam(paramType = "query", dataType = "String", name = "size", value = "一页大小", defaultValue = "10", required = true),
                    @ApiImplicitParam(paramType = "query", dataType = "Boolean", name = "ifCount", value = "是否查询总数", defaultValue = "true"),
                    @ApiImplicitParam(paramType = "query", dataType = "String", name = "ascs", value = "升序字段，多个用逗号分隔"),
                    @ApiImplicitParam(paramType = "query", dataType = "String", name = "descs", value = "降序字段，多个用逗号分隔")
            })
    public R<IPage<V8FieldType>> pageList() {
        BaseForm form = new BaseForm();
        QueryWrapper<V8FieldType> query = (QueryWrapper<V8FieldType>) form.pageQueryWrapperCustom(form.getParameters(), new QueryWrapper<V8FieldType>());
        return success(v8FieldTypeService.page(form.getPlusPagingQueryEntity(), query));
    }
    @GetMapping("/list")
    @ApiOperation("全部列表")
    public R<List<V8FieldType>> list(){
        return success(v8FieldTypeService.list());
    }

    @PostMapping("/save")
    @ApiOperation("添加V8实体字段类型")
    public R<Boolean> save(HttpServletRequest request, @RequestBody V8FieldType v8FieldType) {
//        v8FieldType.setUserId(getCurrentUserId(request));
        v8FieldType.setCreateTime(new Date());
        return success(v8FieldTypeService.save(v8FieldType));
    }

    @PostMapping("/update")
    @ApiOperation("更新V8实体字段类型")
    public R<Boolean> update(HttpServletRequest request,@RequestBody V8FieldType v8FieldType) {
//        v8FieldType.setUserId(getCurrentUserId(request));
        v8FieldType.setModifyTime(new Date());
        return success(v8FieldTypeService.updateById(v8FieldType));
    }

    @PostMapping(value = "/delete/{id}")
    @ApiOperation("删除V8实体字段类型")
    public R<Boolean> delete(@PathVariable(value = "id") Long id) {
        return success(v8FieldTypeService.removeById(id));
    }

    @DeleteMapping
    @ApiOperation("删除数据")
    public R<Boolean> delete(@RequestParam("idList") List<Long> idList) {
        return success(this.v8FieldTypeService.removeByIds(idList));
    }

}
