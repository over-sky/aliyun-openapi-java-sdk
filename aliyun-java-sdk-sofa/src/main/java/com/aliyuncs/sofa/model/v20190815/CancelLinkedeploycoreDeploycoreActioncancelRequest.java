/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CancelLinkedeploycoreDeploycoreActioncancelRequest extends RpcAcsRequest<CancelLinkedeploycoreDeploycoreActioncancelResponse> {
	   

	private List<Long> actionIdsRepeatLists;

	private String operator;

	private String fromApp;
	public CancelLinkedeploycoreDeploycoreActioncancelRequest() {
		super("SOFA", "2019-08-15", "CancelLinkedeploycoreDeploycoreActioncancel", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getActionIdsRepeatLists() {
		return this.actionIdsRepeatLists;
	}

	public void setActionIdsRepeatLists(List<Long> actionIdsRepeatLists) {
		this.actionIdsRepeatLists = actionIdsRepeatLists;	
		if (actionIdsRepeatLists != null) {
			for (int i = 0; i < actionIdsRepeatLists.size(); i++) {
				putBodyParameter("ActionIdsRepeatList." + (i + 1) , actionIdsRepeatLists.get(i));
			}
		}	
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	public String getFromApp() {
		return this.fromApp;
	}

	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
		if(fromApp != null){
			putBodyParameter("FromApp", fromApp);
		}
	}

	@Override
	public Class<CancelLinkedeploycoreDeploycoreActioncancelResponse> getResponseClass() {
		return CancelLinkedeploycoreDeploycoreActioncancelResponse.class;
	}

}
