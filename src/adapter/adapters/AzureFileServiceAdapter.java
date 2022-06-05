package adapter.adapters;

import adapter.fileservice.MyFileService;
import adapter.thirdparty_fileservices.AzureFileService;

public class AzureFileServiceAdapter extends MyFileService {
    AzureFileService azureFileService;

    public AzureFileServiceAdapter() {
        azureFileService = new AzureFileService();
    }

    @Override
    public void uploadFile() {
        azureFileService.uploadFileToAzure();
    }

    @Override
    public void downloadFile() {
        azureFileService.downloadFileFromAzure();
    }
}
