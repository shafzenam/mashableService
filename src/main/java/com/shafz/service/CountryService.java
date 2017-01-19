package com.shafz.service;

import java.util.List;

import com.shafz.model.Country;

public interface CountryService {

	public List<Country> getAllCountries();

	public Country getCountry(int id);

	public void addCountry(Country country);

	public void updateCountry(Country country);

	public void deleteCountry(int id);
}