package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.CaptureTransactionModule;
import service.capturetransactionModuleEJB;

@ManagedBean(name="capturetransactionmoduleController")
@SessionScoped

public class CaptureTransactionModuleController {
	
	@EJB
	capturetransactionModuleEJB capturetransactionModuleService; 
	
	@ManagedProperty(value="#{captureTransactionModule}")
	private CaptureTransactionModule  captureTransactionModule;
    
	
	
	public CaptureTransactionModule getCaptureTransactionModule() {
		return captureTransactionModule;
	}



	public void setCaptureTransactionModule(CaptureTransactionModule captureTransactionModule) {
		this.captureTransactionModule = captureTransactionModule;
	}

 

	public void addNewCaptureTransactionModule()
    {
		
    }
}
 