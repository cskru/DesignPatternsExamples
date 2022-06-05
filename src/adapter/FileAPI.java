package adapter;

import adapter.fileservice.MyFileService;

public class FileAPI {
    public void uploadFileAPI(MyFileService fileService) {
        fileService.uploadFile();
    }

    public void downloadFileAPI(MyFileService fileService) {
        fileService.downloadFile();
    }
}
