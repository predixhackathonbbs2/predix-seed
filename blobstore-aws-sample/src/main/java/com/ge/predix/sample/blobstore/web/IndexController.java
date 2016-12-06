package com.ge.predix.sample.blobstore.web;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amazonaws.services.s3.model.S3Object;
import com.ge.predix.sample.blobstore.dto.UploadDetails;
import com.ge.predix.sample.blobstore.repository.BlobstoreService;

/**
 * Created by 212071474 on 7/7/16.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    Log log = LogFactory.getLog(IndexController.class);

    @Autowired
    BlobstoreService objectStoreService;

    /**
     * Gets invoked for the root URL. Reads the BlobFiles from the Database
     * and updates the model.
     *
     * @param model to be updated for the view
     * @return String view name to be rendered
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", "Hello Boot!");

        try {
            // Get the data from database
            log.info("listing buckets");
            Iterable<S3Object> images = objectStoreService.get();
            model.addAttribute("images", images);
        } catch (Exception e) {
            log.error(e.getMessage());
            log.error(e);
            model.addAttribute("images", new ArrayList<S3Object>());
        }

        log.info("Model returned =" + model.toString());

        return "index";
    }
    //Need to get the details on page load
    
    @RequestMapping(value = "/getDetails", method = RequestMethod.GET)
    public @ResponseBody  List<UploadDetails>  getDetails(Model model) {
        //model.addAttribute("message", "getDetails!");
    	System.out.println("IndexController.getDetails()"  );
    	  List<UploadDetails> dtls = new ArrayList<UploadDetails>();
        try {
            // Get the data from database
            log.info("listing getDetails");
            Iterable<S3Object> images = objectStoreService.get();
            UploadDetails details = null;
          
            for(S3Object obj : images){
            	details = new UploadDetails();
            	details.setFileName(obj.getKey());
            	details.setUrl(obj.getRedirectLocation());
            	details.setBucketName(obj.getBucketName());
            	dtls.add(details);
            
            }
            
            
           // model.addAttribute("images", images);
        } catch (Exception e) {
            log.error(e.getMessage());
            log.error(e);
           // model.addAttribute("images", new ArrayList<S3Object>());
        }

        log.info("Model returned =" + model.toString());

        return dtls;
    }
}
