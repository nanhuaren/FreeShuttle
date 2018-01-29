package cn.nanhuaren.freeshuttle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import cn.nanhuaren.freeshuttle.dal.dao.CityDao;
import cn.nanhuaren.freeshuttle.dal.mapper.HotelMapper;

@SpringBootApplication
public class FreeShuttleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FreeShuttleApplication.class, args);
	}

	private final CityDao cityDao;

	private final HotelMapper hotelMapper;

	public FreeShuttleApplication(CityDao cityDao, HotelMapper hotelMapper) {
		this.cityDao = cityDao;
		this.hotelMapper = hotelMapper;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.cityDao.selectCityById(1));
		System.out.println(this.hotelMapper.selectByCityId(1));
	}
	
	@Bean
	public CorsFilter getCorsFilter() {
		final UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		final CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.addAllowedOrigin("*");
		corsConfiguration.addAllowedHeader("*");
		corsConfiguration.addAllowedMethod("*");
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}

}
