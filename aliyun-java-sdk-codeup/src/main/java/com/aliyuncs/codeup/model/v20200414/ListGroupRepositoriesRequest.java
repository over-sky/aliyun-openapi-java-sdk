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

package com.aliyuncs.codeup.model.v20200414;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListGroupRepositoriesRequest extends RoaAcsRequest<ListGroupRepositoriesResponse> {
	   

	private String accessToken;

	private Boolean isMember;

	private String organizationId;

	private String search;

	private String subUserId;

	private String identity;

	private Long pageSize;

	private Long page;
	public ListGroupRepositoriesRequest() {
		super("codeup", "2020-04-14", "ListGroupRepositories");
		setUriPattern("/api/v3/groups/[Identity]/projects");
		setMethod(MethodType.GET);
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("AccessToken", accessToken);
		}
	}

	public Boolean getIsMember() {
		return this.isMember;
	}

	public void setIsMember(Boolean isMember) {
		this.isMember = isMember;
		if(isMember != null){
			putQueryParameter("IsMember", isMember.toString());
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("OrganizationId", organizationId);
		}
	}

	public String getSearch() {
		return this.search;
	}

	public void setSearch(String search) {
		this.search = search;
		if(search != null){
			putQueryParameter("Search", search);
		}
	}

	public String getSubUserId() {
		return this.subUserId;
	}

	public void setSubUserId(String subUserId) {
		this.subUserId = subUserId;
		if(subUserId != null){
			putQueryParameter("SubUserId", subUserId);
		}
	}

	public String getIdentity() {
		return this.identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
		if(identity != null){
			putPathParameter("Identity", identity);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	@Override
	public Class<ListGroupRepositoriesResponse> getResponseClass() {
		return ListGroupRepositoriesResponse.class;
	}

}
