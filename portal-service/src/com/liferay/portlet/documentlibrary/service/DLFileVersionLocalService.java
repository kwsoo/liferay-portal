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

package com.liferay.portlet.documentlibrary.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for DLFileVersion. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see DLFileVersionLocalServiceUtil
 * @see com.liferay.portlet.documentlibrary.service.base.DLFileVersionLocalServiceBaseImpl
 * @see com.liferay.portlet.documentlibrary.service.impl.DLFileVersionLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DLFileVersionLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DLFileVersionLocalServiceUtil} to access the document library file version local service. Add custom service methods to {@link com.liferay.portlet.documentlibrary.service.impl.DLFileVersionLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the document library file version to the database. Also notifies the appropriate model listeners.
	*
	* @param dlFileVersion the document library file version
	* @return the document library file version that was added
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion addDLFileVersion(
		com.liferay.portlet.documentlibrary.model.DLFileVersion dlFileVersion);

	/**
	* Creates a new document library file version with the primary key. Does not add the document library file version to the database.
	*
	* @param fileVersionId the primary key for the new document library file version
	* @return the new document library file version
	*/
	public com.liferay.portlet.documentlibrary.model.DLFileVersion createDLFileVersion(
		long fileVersionId);

	/**
	* Deletes the document library file version from the database. Also notifies the appropriate model listeners.
	*
	* @param dlFileVersion the document library file version
	* @return the document library file version that was removed
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion deleteDLFileVersion(
		com.liferay.portlet.documentlibrary.model.DLFileVersion dlFileVersion);

	/**
	* Deletes the document library file version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fileVersionId the primary key of the document library file version
	* @return the document library file version that was removed
	* @throws PortalException if a document library file version with the primary key could not be found
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion deleteDLFileVersion(
		long fileVersionId)
		throws com.liferay.portal.kernel.exception.PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.documentlibrary.model.impl.DLFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.documentlibrary.model.impl.DLFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion fetchDLFileVersion(
		long fileVersionId);

	/**
	* Returns the document library file version matching the UUID and group.
	*
	* @param uuid the document library file version's UUID
	* @param groupId the primary key of the group
	* @return the matching document library file version, or <code>null</code> if a matching document library file version could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion fetchDLFileVersionByUuidAndGroupId(
		java.lang.String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery();

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Returns the document library file version with the primary key.
	*
	* @param fileVersionId the primary key of the document library file version
	* @return the document library file version
	* @throws PortalException if a document library file version with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion getDLFileVersion(
		long fileVersionId)
		throws com.liferay.portal.kernel.exception.PortalException;

	/**
	* Returns the document library file version matching the UUID and group.
	*
	* @param uuid the document library file version's UUID
	* @param groupId the primary key of the group
	* @return the matching document library file version
	* @throws PortalException if a matching document library file version could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion getDLFileVersionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException;

	/**
	* Returns a range of all the document library file versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.documentlibrary.model.impl.DLFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of document library file versions
	* @param end the upper bound of the range of document library file versions (not inclusive)
	* @return the range of document library file versions
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileVersion> getDLFileVersions(
		int start, int end);

	/**
	* Returns all the document library file versions matching the UUID and company.
	*
	* @param uuid the UUID of the document library file versions
	* @param companyId the primary key of the company
	* @return the matching document library file versions, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileVersion> getDLFileVersionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of document library file versions matching the UUID and company.
	*
	* @param uuid the UUID of the document library file versions
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of document library file versions
	* @param end the upper bound of the range of document library file versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching document library file versions, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileVersion> getDLFileVersionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portlet.documentlibrary.model.DLFileVersion> orderByComparator);

	/**
	* Returns the number of document library file versions.
	*
	* @return the number of document library file versions
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDLFileVersionsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.portal.kernel.lar.PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion getFileVersion(
		long fileEntryId, java.lang.String version)
		throws com.liferay.portal.kernel.exception.PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion getFileVersion(
		long fileVersionId)
		throws com.liferay.portal.kernel.exception.PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion getFileVersionByUuidAndGroupId(
		java.lang.String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileVersion> getFileVersions(
		long fileEntryId, int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFileVersionsCount(long fileEntryId, int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion getLatestFileVersion(
		long fileEntryId, boolean excludeWorkingCopy)
		throws com.liferay.portal.kernel.exception.PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion getLatestFileVersion(
		long userId, long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException;

	public void rebuildTree(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException;

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public void setTreePaths(long folderId, java.lang.String treePath)
		throws com.liferay.portal.kernel.exception.PortalException;

	/**
	* Updates the document library file version in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dlFileVersion the document library file version
	* @return the document library file version that was updated
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public com.liferay.portlet.documentlibrary.model.DLFileVersion updateDLFileVersion(
		com.liferay.portlet.documentlibrary.model.DLFileVersion dlFileVersion);
}