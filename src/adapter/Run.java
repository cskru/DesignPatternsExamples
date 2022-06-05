package adapter;

import adapter.adapters.AWSFileServiceAdapter;
import adapter.adapters.AzureFileServiceAdapter;
import adapter.fileservice.MyFileService;

public class Run {
    public static void main(String[] args) {
        FileAPI fileAPI = new FileAPI();

        // Code that's expected
        MyFileService myFileService = new MyFileService();
        fileAPI.uploadFileAPI(myFileService);
        fileAPI.downloadFileAPI(myFileService);
        System.out.println("==================================");

        // Working with third-party code
        MyFileService awsFileServiceAdapter = new AWSFileServiceAdapter();
        fileAPI.uploadFileAPI(awsFileServiceAdapter);
        fileAPI.downloadFileAPI(awsFileServiceAdapter);
        System.out.println("==================================");

        MyFileService azureFileServiceAdapter = new AzureFileServiceAdapter();
        fileAPI.uploadFileAPI(azureFileServiceAdapter);
        fileAPI.downloadFileAPI(azureFileServiceAdapter);
        System.out.println("==================================");
    }
}
