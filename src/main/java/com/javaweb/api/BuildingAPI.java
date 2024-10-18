package com.javaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.Model.BuildingDTO;
import com.javaweb.service.BuildingService;

@RestController 
public class BuildingAPI {
	// thay doi 
	@Autowired
	private BuildingService buildingService;

	@GetMapping(value="/api/building/")
	public List<BuildingDTO> getBuilding(@RequestParam(name="name", required = false) String name,
										@RequestParam(name="districtId", required = false) Long districtId,
										@RequestParam(name="typeCode", required = false) List<String> typeCpde) {
		List<BuildingDTO> result = buildingService.findAll(name, districtId);
		return result;
	}


	

	
	

}
//@RequestMapping(value="/api/building/", method = RequestMethod.GET)

//try {
//System.out.print(5 / 0);
//valiDate(building);
//}
//catch (Exception e) {
//ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
//errorResponseDTO.setError(e.getMessage());
//List<String> details = new ArrayList<>();
//details.add("Loi roi, check lai name va numberOfBed lai di");
//errorResponseDTO.setDetail(details);
//return errorResponseDTO;
//}

//@RequestMapping(value="/api/building/", method = RequestMethod.POST)
//@PostMapping(value = "/api/building/")
//public void getBuilding2(@RequestBody BuildingDTO buildingDTO) {
//	System.out.print("ok");
//}
//
//@DeleteMapping(value = "/api/building/{id}/{name}")
//public void deleteBuilding(@PathVariable Integer id,
//							@PathVariable String name,
//							@RequestParam(value="numberOfBed", required = false) Integer numberOfBed) {
//	System.out.print("da delete thanh cong toa nha 1");
//}

//public void valiDate(BuildingDTO buildingDTO){
//if(buildingDTO.getName() == null || buildingDTO.getName().equals("") || buildingDTO.getNumberOfBed() == null) {
//	throw new FieldRequiredException("Name or numberOfBed is Null");
//}
//}
//BuildingDTO result = new BuildingDTO();
//result.setName(nameBuilding);
//result.setNumberOfBed(numberOfBed);
//result.setNumberOfHuman(numberOfHuman);
//return result;