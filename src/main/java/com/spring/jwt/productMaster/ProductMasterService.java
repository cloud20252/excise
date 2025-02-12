package com.spring.jwt.productMaster;


import java.util.List;

public interface ProductMasterService {
    ProductMasterDTO saveProductMaster(ProductMasterDTO masterDTO) ;

    ProductMasterDTO getProductByID(Integer id);

    ProductMasterDTO updateProductMasterByID(Integer id, ProductMasterDTO masterDTO);

    List<ProductMasterDTO> getAllProducts(Integer pageNo, Integer pageSize);

    void deleteProductByID(Integer id);

    public List<ProductMasterDTO> getProductByBrandAndName(String brand, String name);


}
