/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.dynamicdatamapping.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.portlet.dynamicdatamapping.model.DDMTemplateVersion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DDMTemplateVersion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DDMTemplateVersion
 * @generated
 */
@ProviderType
public class DDMTemplateVersionCacheModel implements CacheModel<DDMTemplateVersion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{templateVersionId=");
		sb.append(templateVersionId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", templateId=");
		sb.append(templateId);
		sb.append(", version=");
		sb.append(version);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", language=");
		sb.append(language);
		sb.append(", script=");
		sb.append(script);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DDMTemplateVersion toEntityModel() {
		DDMTemplateVersionImpl ddmTemplateVersionImpl = new DDMTemplateVersionImpl();

		ddmTemplateVersionImpl.setTemplateVersionId(templateVersionId);
		ddmTemplateVersionImpl.setGroupId(groupId);
		ddmTemplateVersionImpl.setCompanyId(companyId);
		ddmTemplateVersionImpl.setUserId(userId);

		if (userName == null) {
			ddmTemplateVersionImpl.setUserName(StringPool.BLANK);
		}
		else {
			ddmTemplateVersionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ddmTemplateVersionImpl.setCreateDate(null);
		}
		else {
			ddmTemplateVersionImpl.setCreateDate(new Date(createDate));
		}

		ddmTemplateVersionImpl.setTemplateId(templateId);

		if (version == null) {
			ddmTemplateVersionImpl.setVersion(StringPool.BLANK);
		}
		else {
			ddmTemplateVersionImpl.setVersion(version);
		}

		if (name == null) {
			ddmTemplateVersionImpl.setName(StringPool.BLANK);
		}
		else {
			ddmTemplateVersionImpl.setName(name);
		}

		if (description == null) {
			ddmTemplateVersionImpl.setDescription(StringPool.BLANK);
		}
		else {
			ddmTemplateVersionImpl.setDescription(description);
		}

		if (language == null) {
			ddmTemplateVersionImpl.setLanguage(StringPool.BLANK);
		}
		else {
			ddmTemplateVersionImpl.setLanguage(language);
		}

		if (script == null) {
			ddmTemplateVersionImpl.setScript(StringPool.BLANK);
		}
		else {
			ddmTemplateVersionImpl.setScript(script);
		}

		ddmTemplateVersionImpl.resetOriginalValues();

		return ddmTemplateVersionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		templateVersionId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		templateId = objectInput.readLong();
		version = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		language = objectInput.readUTF();
		script = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(templateVersionId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(templateId);

		if (version == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(version);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}

		if (script == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(script);
		}
	}

	public long templateVersionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long templateId;
	public String version;
	public String name;
	public String description;
	public String language;
	public String script;
}