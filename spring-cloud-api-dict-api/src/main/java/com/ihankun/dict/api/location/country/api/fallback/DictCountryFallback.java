package com.ihankun.dict.api.location.country.api.fallback;

import com.ihankun.core.base.api.ResponseResult;
import com.ihankun.dict.api.location.country.api.DictCountryApi;
import com.ihankun.dict.api.location.country.entity.dto.DictCountryDTO;
import com.ihankun.dict.api.location.country.entity.dto.DictCountryQueryDTO;
import com.ihankun.dict.api.location.country.entity.vo.DictCountryVO;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hankun
 */
@Slf4j
@Component
public class DictCountryFallback implements FallbackFactory<DictCountryApi> {

    @Override
    public DictCountryApi create(Throwable throwable) {
        return new DictCountryApi() {

            @Override
            public ResponseResult<List<DictCountryVO>> find(DictCountryQueryDTO queryDTO) {
                return ResponseResult.fallback(throwable);
            }

            @Override
            public ResponseResult<List<DictCountryVO>> save(List<DictCountryDTO> saveDTO) {
                return ResponseResult.fallback(throwable);
            }
        };
    }
}
