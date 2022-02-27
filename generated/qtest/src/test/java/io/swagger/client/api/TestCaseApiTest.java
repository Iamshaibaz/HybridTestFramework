/*
 * qTest Manager API Version 8.6 - 11.0
 * qTest Manager API Version 8.6 - 11.0
 *
 * OpenAPI spec version: 8.6 - 11.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CommentResource;
import io.swagger.client.model.PagedResourceCommentResource;
import io.swagger.client.model.TestCaseWithCustomFieldResource;
import io.swagger.client.model.TestStepResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TestCaseApi
 */
@Ignore
public class TestCaseApiTest {

    private final TestCaseApi api = new TestCaseApi();

    
    /**
     * Adds a Comment to a Test Case
     *
     * To add a Comment to a Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 7.5+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTestCaseCommentTest() throws ApiException {
        Long projectId = null;
        String idOrKey = null;
        CommentResource body = null;
        CommentResource response = api.addTestCaseComment(projectId, idOrKey, body);

        // TODO: test validations
    }
    
    /**
     * Creates a Test Step
     *
     * To add a Test Step to a Test Case&#39;s latest version  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTestStepTest() throws ApiException {
        Long projectId = null;
        Long testCaseId = null;
        TestStepResource body = null;
        Boolean showParamIdentifier = null;
        TestStepResource response = api.addTestStep(projectId, testCaseId, body, showParamIdentifier);

        // TODO: test validations
    }
    
    /**
     * Approves a Test Case
     *
     * To approve a Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 7.4+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void approveTestCaseTest() throws ApiException {
        Long projectId = null;
        Long testCaseId = null;
        TestCaseWithCustomFieldResource response = api.approveTestCase(projectId, testCaseId);

        // TODO: test validations
    }
    
    /**
     * test-case.vera.approve
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void approveTestCaseByVeraTest() throws ApiException {
        Long projectId = null;
        Long testCaseId = null;
        TestCaseWithCustomFieldResource response = api.approveTestCaseByVera(projectId, testCaseId);

        // TODO: test validations
    }
    
    /**
     * Creates a Test Case
     *
     * To create a Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 4+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTestCaseTest() throws ApiException {
        Long projectId = null;
        TestCaseWithCustomFieldResource body = null;
        String agentId = null;
        Boolean showParamIdentifier = null;
        TestCaseWithCustomFieldResource response = api.createTestCase(projectId, body, agentId, showParamIdentifier);

        // TODO: test validations
    }
    
    /**
     * Deletes a Test Case
     *
     * To delete Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTestCaseTest() throws ApiException {
        Long projectId = null;
        Long testCaseId = null;
        api.deleteTestCase(projectId, testCaseId);

        // TODO: test validations
    }
    
    /**
     * Deletes a Comment of a Test Case
     *
     * To delete a comment of a Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 7.5+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTestCaseCommentTest() throws ApiException {
        Long projectId = null;
        String idOrKey = null;
        Long commentId = null;
        api.deleteTestCaseComment(projectId, idOrKey, commentId);

        // TODO: test validations
    }
    
    /**
     * Deletes a Test Step
     *
     * To delete a test step of a Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTestStepTest() throws ApiException {
        Long projectId = null;
        Long testCaseId = null;
        Long stepId = null;
        Boolean updateVersion = null;
        api.deleteTestStep(projectId, testCaseId, stepId, updateVersion);

        // TODO: test validations
    }
    
    /**
     * Gets a Test Case
     *
     * To retrieve a Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestCaseTest() throws ApiException {
        Long projectId = null;
        String testCaseIdOrPid = null;
        Long versionId = null;
        String expand = null;
        Boolean showParamIdentifier = null;
        TestCaseWithCustomFieldResource response = api.getTestCase(projectId, testCaseIdOrPid, versionId, expand, showParamIdentifier);

        // TODO: test validations
    }
    
    /**
     * Gets a Comment of a Test Case
     *
     * To retrieve a comment of a Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 7.5+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestCaseCommentByIdTest() throws ApiException {
        Long projectId = null;
        String idOrKey = null;
        Long commentId = null;
        CommentResource response = api.getTestCaseCommentById(projectId, idOrKey, commentId);

        // TODO: test validations
    }
    
    /**
     * Gets all Comments of a Test Case
     *
     * To retrieve all comments of a Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 7.5+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestCaseCommentsTest() throws ApiException {
        Long projectId = null;
        String idOrKey = null;
        Long page = null;
        Long pageSize = null;
        PagedResourceCommentResource response = api.getTestCaseComments(projectId, idOrKey, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Gets a version of a Test Case
     *
     * To retrieve a specific version of a Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 4+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestCaseVersionByIdTest() throws ApiException {
        Long projectId = null;
        Long testCaseId = null;
        Long versionId = null;
        Boolean showParamIdentifier = null;
        TestCaseWithCustomFieldResource response = api.getTestCaseVersionById(projectId, testCaseId, versionId, showParamIdentifier);

        // TODO: test validations
    }
    
    /**
     * Gets multiple Test Cases
     *
     * To retrieve all Test Cases or Test Cases which are located directly under a Module
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestCasesTest() throws ApiException {
        Long projectId = null;
        Long page = null;
        Integer size = null;
        Long parentId = null;
        Boolean expandProps = null;
        Boolean expandSteps = null;
        Boolean showParamIdentifier = null;
        List<TestCaseWithCustomFieldResource> response = api.getTestCases(projectId, page, size, parentId, expandProps, expandSteps, showParamIdentifier);

        // TODO: test validations
    }
    
    /**
     * Gets a Test Step
     *
     * To retrieve a Test Step of a Test Case&#39;s latest version  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestStepTest() throws ApiException {
        Long projectId = null;
        Long testCaseId = null;
        Long stepId = null;
        Boolean showParamIdentifier = null;
        TestStepResource response = api.getTestStep(projectId, testCaseId, stepId, showParamIdentifier);

        // TODO: test validations
    }
    
    /**
     * Gets Test Steps of a Test Case
     *
     * To retrieve all Test Steps of a Test Case&#39;s latest version  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestStepsTest() throws ApiException {
        Long projectId = null;
        Long testCaseId = null;
        Boolean showParamIdentifier = null;
        List<TestStepResource> response = api.getTestSteps(projectId, testCaseId, showParamIdentifier);

        // TODO: test validations
    }
    
    /**
     * Gets Test Steps of a Test Case version
     *
     * To retrieve all Test Steps of a specific Test Case version
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestStepsByVersionTest() throws ApiException {
        Long projectId = null;
        Long testCaseId = null;
        Long versionId = null;
        String expand = null;
        Boolean showParamIdentifier = null;
        List<TestStepResource> response = api.getTestStepsByVersion(projectId, testCaseId, versionId, expand, showParamIdentifier);

        // TODO: test validations
    }
    
    /**
     * Gets all versions of a Test Case
     *
     * To retrieve all versions of a Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 7.4+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVersionsTest() throws ApiException {
        Long projectId = null;
        Long testCaseId = null;
        Boolean showParamIdentifier = null;
        List<TestCaseWithCustomFieldResource> response = api.getVersions(projectId, testCaseId, showParamIdentifier);

        // TODO: test validations
    }
    
    /**
     * Updates multiple test cases
     *
     * To update multiple Test Cases  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMultipleTestCasesTest() throws ApiException {
        Long projectId = null;
        Object body = null;
        Boolean showParamIdentifier = null;
        TestCaseWithCustomFieldResource response = api.updateMultipleTestCases(projectId, body, showParamIdentifier);

        // TODO: test validations
    }
    
    /**
     * Updates a Test Case
     *
     * To update a Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTestCaseTest() throws ApiException {
        Long projectId = null;
        Long testCaseId = null;
        TestCaseWithCustomFieldResource body = null;
        Boolean showParamIdentifier = null;
        TestCaseWithCustomFieldResource response = api.updateTestCase(projectId, testCaseId, body, showParamIdentifier);

        // TODO: test validations
    }
    
    /**
     * Updates a Comment of a Test Case
     *
     * To modify a comment of a Test Case  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 7.5+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTestCaseCommentTest() throws ApiException {
        Long projectId = null;
        String idOrKey = null;
        Long commentId = null;
        CommentResource body = null;
        CommentResource response = api.updateTestCaseComment(projectId, idOrKey, commentId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Test Step
     *
     * To update a Test Step of a Test Case&#39;s latest version  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTestStepTest() throws ApiException {
        Long projectId = null;
        Long testCaseId = null;
        Long stepId = null;
        TestStepResource body = null;
        Boolean showParamIdentifier = null;
        TestStepResource response = api.updateTestStep(projectId, testCaseId, stepId, body, showParamIdentifier);

        // TODO: test validations
    }
    
}
