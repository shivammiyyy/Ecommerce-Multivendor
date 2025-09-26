package com.Ecommerce_Multivendor.Backend.service.impl;


import com.Ecommerce_Multivendor.Backend.domain.HomeCategorySection;
import com.Ecommerce_Multivendor.Backend.model.Deal;
import com.Ecommerce_Multivendor.Backend.model.Home;
import com.Ecommerce_Multivendor.Backend.model.HomeCategory;
import com.Ecommerce_Multivendor.Backend.repository.DealRepository;
import com.Ecommerce_Multivendor.Backend.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService {

    private final DealRepository dealRepository;

    @Override
    public Home createHomePageData(List<HomeCategory> allCategories) {

        List<HomeCategory> gridCategories = allCategories.stream().filter(category -> category.getSection() == HomeCategorySection.GRID).collect(Collectors.toList());
        List<HomeCategory> shopByCategories = allCategories.stream().filter(category -> category.getSection() == HomeCategorySection.SHOP_BY_CATEGORIES).collect(Collectors.toList());
        List<HomeCategory> electricCategories = allCategories.stream().filter(category -> category.getSection() == HomeCategorySection.ELECTRIC_CATEGORIES).collect(Collectors.toList());
        List<HomeCategory> dealCategories = allCategories.stream().filter(category -> category.getSection() == HomeCategorySection.DEALS).collect(Collectors.toList());

        List<Deal> createdDeals;

        if (dealRepository.findAll().isEmpty()) {
            List<Deal> deals = allCategories.stream()
                    .filter(category -> category.getSection() == HomeCategorySection.DEALS)
                    .map(category -> new Deal(null, 10, category))
                    .collect(Collectors.toList());
            createdDeals = dealRepository.saveAll(deals);
        }else{
            createdDeals = dealRepository.findAll();
        }

        Home home = new Home();
        home.setGrid(gridCategories);
        home.setShopByCategories(shopByCategories);
        home.setElectricCategories(electricCategories);
        home.setDeals(createdDeals);
        home.setDealCategories(dealCategories);

        return home;


    }

}
