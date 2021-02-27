package com.nagarro.msa.cartandorder.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.msa.cartandorder.model.SubProduct;

@FeignClient(value="productClient")
public interface ProductClient {

	@RequestMapping(method = RequestMethod.GET, value = "/product/productDetails?cityId={cityId}&productId={productId}&subProductId={subProductId}")
    SubProduct getProductDetail(@RequestParam String cityId,@RequestParam int productId,@RequestParam int subProductId);
	
}
