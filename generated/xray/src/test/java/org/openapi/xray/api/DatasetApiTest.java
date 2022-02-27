/*
 * Xray REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapi.xray.api;

import org.openapi.xray.invoker.ApiException;
import org.openapi.xray.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatasetApi
 */
@Ignore
public class DatasetApiTest {

    private final DatasetApi api = new DatasetApi();

    
    /**
     * 
     *
     * Retrieves a CSV file with the dataset information. &lt;br/&gt; The response will contain all information related to the dataset, e.g., parameters and values. &lt;br/&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetExportGetTest() throws ApiException {
        String testIssueId = null;
        String testIssueKey = null;
        String contextIssueId = null;
        String contextIssueKey = null;
        String resolved = null;
                String response = api.datasetExportGet(testIssueId, testIssueKey, contextIssueId, contextIssueKey, resolved);
        // TODO: test validations
    }
    
}
