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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.ListCertificatesResponse;
import com.aliyuncs.kms.model.v20160120.ListCertificatesResponse.CertificateSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCertificatesResponseUnmarshaller {

	public static ListCertificatesResponse unmarshall(ListCertificatesResponse listCertificatesResponse, UnmarshallerContext _ctx) {
		
		listCertificatesResponse.setRequestId(_ctx.stringValue("ListCertificatesResponse.RequestId"));
		listCertificatesResponse.setTotalSize(_ctx.integerValue("ListCertificatesResponse.TotalSize"));
		listCertificatesResponse.setPageNumber(_ctx.integerValue("ListCertificatesResponse.PageNumber"));
		listCertificatesResponse.setPageSize(_ctx.integerValue("ListCertificatesResponse.PageSize"));

		List<CertificateSummary> certificateSummaryList = new ArrayList<CertificateSummary>();
		for (int i = 0; i < _ctx.lengthValue("ListCertificatesResponse.CertificateSummaryList.Length"); i++) {
			CertificateSummary certificateSummary = new CertificateSummary();
			certificateSummary.setCertificateId(_ctx.stringValue("ListCertificatesResponse.CertificateSummaryList["+ i +"].CertificateId"));
			certificateSummary.setSubject(_ctx.stringValue("ListCertificatesResponse.CertificateSummaryList["+ i +"].Subject"));
			certificateSummary.setIssuer(_ctx.stringValue("ListCertificatesResponse.CertificateSummaryList["+ i +"].Issuer"));
			certificateSummary.setKeySpec(_ctx.stringValue("ListCertificatesResponse.CertificateSummaryList["+ i +"].KeySpec"));
			certificateSummary.setProtectionLevel(_ctx.stringValue("ListCertificatesResponse.CertificateSummaryList["+ i +"].ProtectionLevel"));
			certificateSummary.setNotBefore(_ctx.stringValue("ListCertificatesResponse.CertificateSummaryList["+ i +"].NotBefore"));
			certificateSummary.setNotAfter(_ctx.stringValue("ListCertificatesResponse.CertificateSummaryList["+ i +"].NotAfter"));
			certificateSummary.setStatus(_ctx.stringValue("ListCertificatesResponse.CertificateSummaryList["+ i +"].Status"));

			certificateSummaryList.add(certificateSummary);
		}
		listCertificatesResponse.setCertificateSummaryList(certificateSummaryList);
	 
	 	return listCertificatesResponse;
	}
}