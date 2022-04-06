package com.project.staybooking.repository;

import java.util.List;

//用户发来经纬度如何在elasticsearch

public interface CustomLocationRepository {
    List<Long> searchByDistance(double lat, double lon, String distance);//long: id, distance: 搜索半径
}