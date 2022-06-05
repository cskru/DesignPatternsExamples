package adapter.adapters;

import adapter.fileservice.MyFileService;
import adapter.thirdparty_fileservices.AWSFileService;

public class AWSFileServiceAdapter extends MyFileService {
    AWSFileService awsFileService;

    public AWSFileServiceAdapter() {
        awsFileService = new AWSFileService();
    }
    @Override
    public void uploadFile() {
        awsFileService.uploadFileToAWS();
    }

    @Override
    public void downloadFile() {
        awsFileService.downloadFileFromAWS();
    }
}
