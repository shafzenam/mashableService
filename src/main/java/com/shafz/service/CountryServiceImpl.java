package com.shafz.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shafz.dao.CountryDao;
import com.shafz.model.Country;

@Service("countryService")  
public class CountryServiceImpl implements CountryService{  
  
 @Autowired  
 CountryDao countryDao;  
   
 @Transactional  
 public List<Country> getAllCountries() {  
  return countryDao.getAllCountries();  
 }  
  
 @Transactional  
 public Country getCountry(int id) {  
  return countryDao.getCountry(id);  
 }  
  
 @Transactional  
 public void addCountry(Country country) {  
  countryDao.addCountry(country);  
 }  
  
 @Transactional  
 public void updateCountry(Country country) {  
  countryDao.updateCountry(country);  
  
 }  
  
 @Transactional  
 public void deleteCountry(int id) {  
  countryDao.deleteCountry(id);  
 }  
}  