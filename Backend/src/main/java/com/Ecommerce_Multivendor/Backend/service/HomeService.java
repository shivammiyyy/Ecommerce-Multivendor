package com.Ecommerce_Multivendor.Backend.service;


import com.Ecommerce_Multivendor.Backend.model.Home;
import com.Ecommerce_Multivendor.Backend.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
