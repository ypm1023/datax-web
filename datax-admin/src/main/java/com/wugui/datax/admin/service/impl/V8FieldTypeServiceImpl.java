package com.wugui.datax.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wugui.datax.admin.entity.V8FieldType;
import com.wugui.datax.admin.mapper.V8FieldTypeMapper;
import com.wugui.datax.admin.service.V8FieldTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liliang
 * @date 2024/3/6
 */
@Service
@Transactional(readOnly = true)
public class V8FieldTypeServiceImpl extends ServiceImpl<V8FieldTypeMapper,V8FieldType> implements V8FieldTypeService {

}
