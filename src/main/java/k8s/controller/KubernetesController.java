package k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubernetesController {
	
	@GetMapping("/api/status")
	public String sayPod() {
		return "POD";
	}
}
