
package cn.nanhuaren.freeshuttle.api.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.nanhuaren.freeshuttle.dal.domain.City;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@ResponseBody
	@RequestMapping(value = "/list", method = { RequestMethod.POST, RequestMethod.GET })
	public List<City> listCompany(HttpServletRequest request, HttpServletResponse response) {
		return new ArrayList<City>();
	}
}
