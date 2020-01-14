package springmvc;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.*;

@Controller
@RequestMapping("/user")
public class FileUploadController {
	
	@RequestMapping("/fileupload2")
	public String fileupload2(HttpServletRequest request, MultipartFile upload) throws IllegalStateException, IOException {
		System.out.println("SpringUpload");
		String path = request.getSession().getServletContext().getRealPath("/uploads/");
		File file = new File(path);
		if(!file.exists()) {
			file.mkdirs();
		}
		String filename = upload.getOriginalFilename();
		upload.transferTo(new File(path, filename));
		
		return "success";
	}

	@RequestMapping("/fileupload1")
	public String fileupload1(HttpServletRequest request) throws Exception {
		System.out.println("upload");
		String path = request.getSession().getServletContext().getRealPath("/uploads/");
		File file = new File(path);
		if(!file.exists()) {
			file.mkdirs();
		}
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		List<FileItem> items = upload.parseRequest(request);
		for(FileItem item:items) {
			if(item.isFormField()) {
				
			}else {
				String filename = item.getName();
				item.write(new File(path, filename));
				item.delete();
			}
				
		}
		
		return "success";
	}
}
