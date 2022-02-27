/*
 * Zephyr Scale Cloud API
 *  # Introduction  This is the **Zephyr Scale Cloud** API. If you are looking for the Server API, please refer to the [documentation](https://support.smartbear.com/zephyr-scale-server/docs/) for more information.  This API uses the OpenAPI specification. If you want to generate clients for different languages, please use the link above to download the API specification and use it with your preferred tools.  For feature requests or general support, please head to our [support site](https://smartbear.atlassian.net/servicedesk/customer/portal/42).  # Authentication The API authentication is based on JSON Web Token (JWT), which is a key for accessing the API. Authenticating using JWT requires the following steps: * Generate a key * Make authenticated requests  ## Generate a Key For accessing the API, you must generate an access key in Jira. To generate an access token, click on your profile picture at the page bottom left, and choose the option “Zephyr Scale API keys\". For more information, please check out the [documentation](https://support.smartbear.com/zephyr-scale-cloud/docs/api-and-test-automation/generating-access-keys.html).  ## Accessing the API The API is available at the following base URL: ``` https://api.zephyrscale.smartbear.com/v2 ``` For example, the final URL for retrieving test cases would be: ``` https://api.zephyrscale.smartbear.com/v2/testcases ```  ## Making Authenticated Requests To authenticate subsequent API requests, you must provide a valid token in an HTTP header, which is the key generated on the previous step: ``` Authorization: Bearer {bearer_token} ``` # Representing Users  Previous API definitions used Atlassian User Keys to identify users. This parameter is deprecated because of privacy changes. Use Atlassian Account ID instead.   Atlassian Account IDs are globally unique opaque identifiers for identifying a user. Every Atlassian Account has a ID which is assigned when the account is created and is immutable. Account IDs contain no personally identifiable information and are only used to retrieve user information ondemand. This API does not return any user information other than the Account ID (with the exception of the deprecated user keys during the deprecation period). 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapi.zephyr.invoker;

import java.util.Collection;
import java.util.Iterator;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-28T00:21:27.203715400+11:00[Australia/Sydney]")
public class StringUtil {
  /**
   * Check if the given array contains the given value (with case-insensitive comparison).
   *
   * @param array The array
   * @param value The value to search
   * @return true if the array contains the value
   */
  public static boolean containsIgnoreCase(String[] array, String value) {
    for (String str : array) {
      if (value == null && str == null) {
        return true;
      }
      if (value != null && value.equalsIgnoreCase(str)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Join an array of strings with the given separator.
   * <p>
   * Note: This might be replaced by utility method from commons-lang or guava someday
   * if one of those libraries is added as dependency.
   * </p>
   *
   * @param array     The array of strings
   * @param separator The separator
   * @return the resulting string
   */
  public static String join(String[] array, String separator) {
    int len = array.length;
    if (len == 0) {
      return "";
    }

    StringBuilder out = new StringBuilder();
    out.append(array[0]);
    for (int i = 1; i < len; i++) {
      out.append(separator).append(array[i]);
    }
    return out.toString();
  }

  /**
   * Join a list of strings with the given separator.
   *
   * @param list      The list of strings
   * @param separator The separator
   * @return the resulting string
   */
  public static String join(Collection<String> list, String separator) {
    Iterator<String> iterator = list.iterator();
    StringBuilder out = new StringBuilder();
    if (iterator.hasNext()) {
      out.append(iterator.next());
    }
    while (iterator.hasNext()) {
      out.append(separator).append(iterator.next());
    }
    return out.toString();
  }
}
