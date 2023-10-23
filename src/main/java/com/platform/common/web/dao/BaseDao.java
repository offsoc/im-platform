/**
 * Licensed to the Apache Software Foundation （ASF） under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * （the "License"）； you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * https://www.q3z3.com
 * QQ : 939313737
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.platform.common.web.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

/**
 * Dao基类
 */
public interface BaseDao<T> extends BaseMapper<T> {

    /**
     * 批量插入 仅适用于mysql
     */
    Integer insertBatchSomeColumn(Collection<T> entityList);

    /**
     * 注意：使用此方法时，sql末尾需要增加${ew.customSqlSegment}
     * <p>
     * 支持单表、和联查
     */
    List<T> search(@Param("ew") Wrapper<T> queryWrapper);

}
